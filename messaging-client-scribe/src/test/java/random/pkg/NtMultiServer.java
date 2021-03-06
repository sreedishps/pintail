package random.pkg;

/*
 * #%L
 * messaging-client-scribe
 * %%
 * Copyright (C) 2012 - 2014 InMobi
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import scribe.thrift.scribe;
import scribe.thrift.scribe.Iface;
import se.cgbystrom.netty.thrift.ThriftPipelineFactory;
import se.cgbystrom.netty.thrift.ThriftServerHandler;

public class NtMultiServer {
  private ThriftServerHandler x = null;
  private int port = 7912;

  private Channel y;

  private boolean running = false;
  private ExecutorService workers;
  private ExecutorService boss;

  private final Iface scribeImpl;

  public NtMultiServer() {
    this(new ScribeAlwaysSuccess(), 7912);
  }

  public NtMultiServer(Iface i, int port) {
    scribeImpl = i;
    this.port = port;
  }

  private synchronized ThriftServerHandler getTHandler() {
    if (x == null) {
      x = new ThriftServerHandler(new scribe.Processor(scribeImpl)) {
        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
            throws Exception {
          System.out.println("Got exception on NtMultiServer");
          e.getCause().printStackTrace();
        }        
      };
    }
    return x;
  }

  private synchronized void framedSocketServer() throws InterruptedException {
    if (running)
      return;

    ChannelPipelineFactory factory = new ThriftPipelineFactory(getTHandler());
    boss = Executors.newCachedThreadPool();
    workers = Executors.newCachedThreadPool();
    NioServerSocketChannelFactory z = new NioServerSocketChannelFactory(boss,
        workers);
    ServerBootstrap bootstrap = new ServerBootstrap(z);

    bootstrap.setPipelineFactory(factory);

    y = bootstrap.bind(new InetSocketAddress(port));

    running = true;

    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        NtMultiServer.this.stop();
      }
    });
  }

  public void start() {
    try {
      framedSocketServer();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public synchronized void stop() {
    if (!running || (y == null))
      return;

    running = false;
    y.close();
    y.unbind();
    workers.shutdownNow();
    boss.shutdownNow();

    // y.getFactory().releaseExternalResources();
  }
}