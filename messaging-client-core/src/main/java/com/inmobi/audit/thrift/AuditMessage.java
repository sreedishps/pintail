/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.inmobi.audit.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class AuditMessage implements TBase<AuditMessage, AuditMessage._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("AuditMessage");

  private static final TField TIMESTAMP_FIELD_DESC = new TField("timestamp",
      TType.I64, (short) 1);
  private static final TField TOPIC_FIELD_DESC = new TField("topic",
      TType.STRING, (short) 2);
  private static final TField TIER_FIELD_DESC = new TField("tier",
      TType.STRING, (short) 3);
  private static final TField HOSTNAME_FIELD_DESC = new TField("hostname",
      TType.STRING, (short) 4);
  private static final TField WINDOW_SIZE_FIELD_DESC = new TField("windowSize",
      TType.I32, (short) 5);
  private static final TField RECEIVED_FIELD_DESC = new TField("received",
      TType.MAP, (short) 6);
  private static final TField SENT_FIELD_DESC = new TField("sent", TType.MAP,
      (short) 7);
  private static final TField FILENAMES_FIELD_DESC = new TField("filenames",
      TType.LIST, (short) 8);
  private static final TField TAGS_FIELD_DESC = new TField("tags", TType.MAP,
      (short) 9);

  public long timestamp;
  public String topic;
  public String tier;
  public String hostname;
  public int windowSize;
  public Map<Long, Long> received;
  public Map<Long, Long> sent;
  public List<String> filenames;
  public Map<String, String> tags;

  /** The set of fields this struct contains, along with convenience methods
   *  for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TIMESTAMP((short) 1, "timestamp"),
    TOPIC((short) 2, "topic"),
    TIER((short) 3, "tier"),
    HOSTNAME((short) 4, "hostname"),
    WINDOW_SIZE((short) 5, "windowSize"),
    RECEIVED((short) 6, "received"),
    SENT((short) 7, "sent"),
    FILENAMES((short) 8, "filenames"),
    TAGS((short) 9, "tags");

    private static final Map<String, _Fields> byName = new HashMap<String,
        _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // TOPIC
          return TOPIC;
        case 3: // TIER
          return TIER;
        case 4: // HOSTNAME
          return HOSTNAME;
        case 5: // WINDOW_SIZE
          return WINDOW_SIZE;
        case 6: // RECEIVED
          return RECEIVED;
        case 7: // SENT
          return SENT;
        case 8: // FILENAMES
          return FILENAMES;
        case 9: // TAGS
          return TAGS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) {
        throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      }
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __WINDOWSIZE_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(
        _Fields.class);

    tmpMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp",
        TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I64)));

    tmpMap.put(_Fields.TOPIC, new FieldMetaData("topic",
        TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));

    tmpMap.put(_Fields.TIER, new FieldMetaData("tier",
        TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));

    tmpMap.put(_Fields.HOSTNAME, new FieldMetaData("hostname",
        TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.STRING)));

    tmpMap.put(_Fields.WINDOW_SIZE, new FieldMetaData("windowSize",
        TFieldRequirementType.DEFAULT, new FieldValueMetaData(TType.I32)));

    tmpMap.put(_Fields.RECEIVED, new FieldMetaData("received",
        TFieldRequirementType.DEFAULT,
        new MapMetaData(TType.MAP, new FieldValueMetaData(TType.I64),
            new FieldValueMetaData(TType.I64))));

    tmpMap.put(_Fields.SENT, new FieldMetaData("sent",
        TFieldRequirementType.DEFAULT,
        new MapMetaData(TType.MAP, new FieldValueMetaData(TType.I64),
            new FieldValueMetaData(TType.I64))));

    tmpMap.put(_Fields.FILENAMES, new FieldMetaData("filenames",
        TFieldRequirementType.DEFAULT,
        new ListMetaData(TType.LIST, new FieldValueMetaData(TType.STRING))));

    tmpMap.put(_Fields.TAGS, new FieldMetaData("tags",
        TFieldRequirementType.DEFAULT,
        new MapMetaData(TType.MAP, new FieldValueMetaData(TType.STRING),
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(AuditMessage.class, metaDataMap);
  }

  public AuditMessage() {
  }

  public AuditMessage(
    long timestamp,
    String topic,
    String tier,
    String hostname,
    int windowSize,
    Map<Long, Long> received,
    Map<Long, Long> sent,
    List<String> filenames,
    Map<String, String> tags) {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.topic = topic;
    this.tier = tier;
    this.hostname = hostname;
    this.windowSize = windowSize;
    setWindowSizeIsSet(true);
    this.received = received;
    this.sent = sent;
    this.filenames = filenames;
    this.tags = tags;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuditMessage(AuditMessage other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.timestamp = other.timestamp;
    if (other.isSetTopic()) {
      this.topic = other.topic;
    }
    if (other.isSetTier()) {
      this.tier = other.tier;
    }
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
    this.windowSize = other.windowSize;
    if (other.isSetReceived()) {
      Map<Long, Long> __this__received = new HashMap<Long, Long>();
      for (Map.Entry<Long, Long> other_element : other.received.entrySet()) {

        Long other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        Long __this__received_copy_key = other_element_key;

        Long __this__received_copy_value = other_element_value;

        __this__received.put(__this__received_copy_key,
            __this__received_copy_value);
      }
      this.received = __this__received;
    }
    if (other.isSetSent()) {
      Map<Long, Long> __this__sent = new HashMap<Long, Long>();
      for (Map.Entry<Long, Long> other_element : other.sent.entrySet()) {

        Long other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        Long __this__sent_copy_key = other_element_key;

        Long __this__sent_copy_value = other_element_value;

        __this__sent.put(__this__sent_copy_key, __this__sent_copy_value);
      }
      this.sent = __this__sent;
    }
    if (other.isSetFilenames()) {
      List<String> __this__filenames = new ArrayList<String>();
      for (String other_element : other.filenames) {
        __this__filenames.add(other_element);
      }
      this.filenames = __this__filenames;
    }
    if (other.isSetTags()) {
      Map<String, String> __this__tags = new HashMap<String, String>();
      for (Map.Entry<String, String> other_element : other.tags.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__tags_copy_key = other_element_key;

        String __this__tags_copy_value = other_element_value;

        __this__tags.put(__this__tags_copy_key, __this__tags_copy_value);
      }
      this.tags = __this__tags;
    }
  }

  public AuditMessage deepCopy() {
    return new AuditMessage(this);
  }

  @Deprecated
  public AuditMessage clone() {
    return new AuditMessage(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    this.topic = null;
    this.tier = null;
    this.hostname = null;
    setWindowSizeIsSet(false);
    this.windowSize = 0;
    this.received = null;
    this.sent = null;
    this.filenames = null;
    this.tags = null;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public AuditMessage setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been asigned a value) and
   *  false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public String getTopic() {
    return this.topic;
  }

  public AuditMessage setTopic(String topic) {
    this.topic = topic;
    return this;
  }

  public void unsetTopic() {
    this.topic = null;
  }

  /** Returns true if field topic is set (has been asigned a value) and false
   *  otherwise */
  public boolean isSetTopic() {
    return this.topic != null;
  }

  public void setTopicIsSet(boolean value) {
    if (!value) {
      this.topic = null;
    }
  }

  public String getTier() {
    return this.tier;
  }

  public AuditMessage setTier(String tier) {
    this.tier = tier;
    return this;
  }

  public void unsetTier() {
    this.tier = null;
  }

  /** Returns true if field tier is set (has been asigned a value) and false
   *  otherwise */
  public boolean isSetTier() {
    return this.tier != null;
  }

  public void setTierIsSet(boolean value) {
    if (!value) {
      this.tier = null;
    }
  }

  public String getHostname() {
    return this.hostname;
  }

  public AuditMessage setHostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  public void unsetHostname() {
    this.hostname = null;
  }

  /** Returns true if field hostname is set (has been asigned a value) and
   *  false otherwise */
  public boolean isSetHostname() {
    return this.hostname != null;
  }

  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }

  public int getWindowSize() {
    return this.windowSize;
  }

  public AuditMessage setWindowSize(int windowSize) {
    this.windowSize = windowSize;
    setWindowSizeIsSet(true);
    return this;
  }

  public void unsetWindowSize() {
    __isset_bit_vector.clear(__WINDOWSIZE_ISSET_ID);
  }

  /** Returns true if field windowSize is set (has been asigned a value) and
   *  false otherwise */
  public boolean isSetWindowSize() {
    return __isset_bit_vector.get(__WINDOWSIZE_ISSET_ID);
  }

  public void setWindowSizeIsSet(boolean value) {
    __isset_bit_vector.set(__WINDOWSIZE_ISSET_ID, value);
  }

  public int getReceivedSize() {
    return (this.received == null) ? 0 : this.received.size();
  }

  public void putToReceived(long key, long val) {
    if (this.received == null) {
      this.received = new HashMap<Long, Long>();
    }
    this.received.put(key, val);
  }

  public Map<Long, Long> getReceived() {
    return this.received;
  }

  public AuditMessage setReceived(Map<Long, Long> received) {
    this.received = received;
    return this;
  }

  public void unsetReceived() {
    this.received = null;
  }

  /** Returns true if field received is set (has been asigned a value) and
   *  false otherwise */
  public boolean isSetReceived() {
    return this.received != null;
  }

  public void setReceivedIsSet(boolean value) {
    if (!value) {
      this.received = null;
    }
  }

  public int getSentSize() {
    return (this.sent == null) ? 0 : this.sent.size();
  }

  public void putToSent(long key, long val) {
    if (this.sent == null) {
      this.sent = new HashMap<Long, Long>();
    }
    this.sent.put(key, val);
  }

  public Map<Long, Long> getSent() {
    return this.sent;
  }

  public AuditMessage setSent(Map<Long, Long> sent) {
    this.sent = sent;
    return this;
  }

  public void unsetSent() {
    this.sent = null;
  }

  /** Returns true if field sent is set (has been asigned a value) and false
   *  otherwise */
  public boolean isSetSent() {
    return this.sent != null;
  }

  public void setSentIsSet(boolean value) {
    if (!value) {
      this.sent = null;
    }
  }

  public int getFilenamesSize() {
    return (this.filenames == null) ? 0 : this.filenames.size();
  }

  public java.util.Iterator<String> getFilenamesIterator() {
    return (this.filenames == null) ? null : this.filenames.iterator();
  }

  public void addToFilenames(String elem) {
    if (this.filenames == null) {
      this.filenames = new ArrayList<String>();
    }
    this.filenames.add(elem);
  }

  public List<String> getFilenames() {
    return this.filenames;
  }

  public AuditMessage setFilenames(List<String> filenames) {
    this.filenames = filenames;
    return this;
  }

  public void unsetFilenames() {
    this.filenames = null;
  }

  /** Returns true if field filenames is set (has been asigned a value) and
   *  false otherwise */
  public boolean isSetFilenames() {
    return this.filenames != null;
  }

  public void setFilenamesIsSet(boolean value) {
    if (!value) {
      this.filenames = null;
    }
  }

  public int getTagsSize() {
    return (this.tags == null) ? 0 : this.tags.size();
  }

  public void putToTags(String key, String val) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, val);
  }

  public Map<String, String> getTags() {
    return this.tags;
  }

  public AuditMessage setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public void unsetTags() {
    this.tags = null;
  }

  /** Returns true if field tags is set (has been asigned a value) and false
   *  otherwise */
  public boolean isSetTags() {
    return this.tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.tags = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long) value);
      }
      break;

    case TOPIC:
      if (value == null) {
        unsetTopic();
      } else {
        setTopic((String) value);
      }
      break;

    case TIER:
      if (value == null) {
        unsetTier();
      } else {
        setTier((String) value);
      }
      break;

    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((String) value);
      }
      break;

    case WINDOW_SIZE:
      if (value == null) {
        unsetWindowSize();
      } else {
        setWindowSize((Integer) value);
      }
      break;

    case RECEIVED:
      if (value == null) {
        unsetReceived();
      } else {
        setReceived((Map<Long, Long>) value);
      }
      break;

    case SENT:
      if (value == null) {
        unsetSent();
      } else {
        setSent((Map<Long, Long>) value);
      }
      break;

    case FILENAMES:
      if (value == null) {
        unsetFilenames();
      } else {
        setFilenames((List<String>) value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Map<String, String>) value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case TOPIC:
      return getTopic();

    case TIER:
      return getTier();

    case HOSTNAME:
      return getHostname();

    case WINDOW_SIZE:
      return Integer.valueOf(getWindowSize());

    case RECEIVED:
      return getReceived();

    case SENT:
      return getSent();

    case FILENAMES:
      return getFilenames();

    case TAGS:
      return getTags();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a
   *  value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case TOPIC:
      return isSetTopic();
    case TIER:
      return isSetTier();
    case HOSTNAME:
      return isSetHostname();
    case WINDOW_SIZE:
      return isSetWindowSize();
    case RECEIVED:
      return isSetReceived();
    case SENT:
      return isSetSent();
    case FILENAMES:
      return isSetFilenames();
    case TAGS:
      return isSetTags();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null) {
      return false;
    }
    if (that instanceof AuditMessage) {
      return this.equals((AuditMessage) that);
    }
    return false;
  }

  public boolean equals(AuditMessage that) {
    if (that == null) {
      return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp)) {
        return false;
      }
      if (this.timestamp != that.timestamp) {
        return false;
      }
    }

    boolean this_present_topic = this.isSetTopic();
    boolean that_present_topic = that.isSetTopic();
    if (this_present_topic || that_present_topic) {
      if (!(this_present_topic && that_present_topic)) {
        return false;
      }
      if (!this.topic.equals(that.topic)) {
        return false;
      }
    }

    boolean this_present_tier = this.isSetTier();
    boolean that_present_tier = that.isSetTier();
    if (this_present_tier || that_present_tier) {
      if (!(this_present_tier && that_present_tier)) {
        return false;
      }
      if (!this.tier.equals(that.tier)) {
        return false;
      }
    }

    boolean this_present_hostname = this.isSetHostname();
    boolean that_present_hostname = that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname)) {
        return false;
      }
      if (!this.hostname.equals(that.hostname)) {
        return false;
      }
    }

    boolean this_present_windowSize = true;
    boolean that_present_windowSize = true;
    if (this_present_windowSize || that_present_windowSize) {
      if (!(this_present_windowSize && that_present_windowSize)) {
        return false;
      }
      if (this.windowSize != that.windowSize) {
        return false;
      }
    }

    boolean this_present_received = this.isSetReceived();
    boolean that_present_received = that.isSetReceived();
    if (this_present_received || that_present_received) {
      if (!(this_present_received && that_present_received)) {
        return false;
      }
      if (!this.received.equals(that.received)) {
        return false;
      }
    }

    boolean this_present_sent = this.isSetSent();
    boolean that_present_sent = that.isSetSent();
    if (this_present_sent || that_present_sent) {
      if (!(this_present_sent && that_present_sent)) {
        return false;
      }
      if (!this.sent.equals(that.sent)) {
        return false;
      }
    }

    boolean this_present_filenames = this.isSetFilenames();
    boolean that_present_filenames = that.isSetFilenames();
    if (this_present_filenames || that_present_filenames) {
      if (!(this_present_filenames && that_present_filenames)) {
        return false;
      }
      if (!this.filenames.equals(that.filenames)) {
        return false;
      }
    }

    boolean this_present_tags = this.isSetTags();
    boolean that_present_tags = that.isSetTags();
    if (this_present_tags || that_present_tags) {
      if (!(this_present_tags && that_present_tags)) {
        return false;
      }
      if (!this.tags.equals(that.tags)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AuditMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AuditMessage typedOther = (AuditMessage) other;

    lastComparison = Boolean.valueOf(
        isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = TBaseHelper.compareTo(this.timestamp,
          typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopic()).compareTo(
        typedOther.isSetTopic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic()) {
      lastComparison = TBaseHelper.compareTo(this.topic, typedOther.topic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTier()).compareTo(
        typedOther.isSetTier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTier()) {
      lastComparison = TBaseHelper.compareTo(this.tier, typedOther.tier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostname()).compareTo(
        typedOther.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = TBaseHelper.compareTo(this.hostname, typedOther.hostname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWindowSize()).compareTo(
        typedOther.isSetWindowSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWindowSize()) {
      lastComparison = TBaseHelper.compareTo(this.windowSize,
          typedOther.windowSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceived()).compareTo(
        typedOther.isSetReceived());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceived()) {
      lastComparison = TBaseHelper.compareTo(this.received,
          typedOther.received);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSent()).compareTo(
        typedOther.isSetSent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSent()) {
      lastComparison = TBaseHelper.compareTo(this.sent, typedOther.sent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilenames()).compareTo(
        typedOther.isSetFilenames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilenames()) {
      lastComparison = TBaseHelper.compareTo(this.filenames,
          typedOther.filenames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(
        typedOther.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = TBaseHelper.compareTo(this.tags, typedOther.tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // TIMESTAMP
          if (field.type == TType.I64) {
            this.timestamp = iprot.readI64();
            setTimestampIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TOPIC
          if (field.type == TType.STRING) {
            this.topic = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TIER
          if (field.type == TType.STRING) {
            this.tier = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // HOSTNAME
          if (field.type == TType.STRING) {
            this.hostname = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // WINDOW_SIZE
          if (field.type == TType.I32) {
            this.windowSize = iprot.readI32();
            setWindowSizeIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // RECEIVED
          if (field.type == TType.MAP) {
            {
              TMap _map0 = iprot.readMapBegin();
              this.received = new HashMap<Long, Long>(2 * _map0.size);
              for (int _i1 = 0; _i1 < _map0.size; ++_i1) {
                long _key2;
                long _val3;
                _key2 = iprot.readI64();
                _val3 = iprot.readI64();
                this.received.put(_key2, _val3);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // SENT
          if (field.type == TType.MAP) {
            {
              TMap _map4 = iprot.readMapBegin();
              this.sent = new HashMap<Long, Long>(2 * _map4.size);
              for (int _i5 = 0; _i5 < _map4.size; ++_i5) {
                long _key6;
                long _val7;
                _key6 = iprot.readI64();
                _val7 = iprot.readI64();
                this.sent.put(_key6, _val7);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // FILENAMES
          if (field.type == TType.LIST) {
            {
              TList _list8 = iprot.readListBegin();
              this.filenames = new ArrayList<String>(_list8.size);
              for (int _i9 = 0; _i9 < _list8.size; ++_i9) {
                String _elem10;
                _elem10 = iprot.readString();
                this.filenames.add(_elem10);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // TAGS
          if (field.type == TType.MAP) {
            {
              TMap _map11 = iprot.readMapBegin();
              this.tags = new HashMap<String, String>(2 * _map11.size);
              for (int _i12 = 0; _i12 < _map11.size; ++_i12) {
                String _key13;
                String _val14;
                _key13 = iprot.readString();
                _val14 = iprot.readString();
                this.tags.put(_key13, _val14);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in
    // the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.timestamp);
    oprot.writeFieldEnd();
    if (this.topic != null) {
      oprot.writeFieldBegin(TOPIC_FIELD_DESC);
      oprot.writeString(this.topic);
      oprot.writeFieldEnd();
    }
    if (this.tier != null) {
      oprot.writeFieldBegin(TIER_FIELD_DESC);
      oprot.writeString(this.tier);
      oprot.writeFieldEnd();
    }
    if (this.hostname != null) {
      oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
      oprot.writeString(this.hostname);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(WINDOW_SIZE_FIELD_DESC);
    oprot.writeI32(this.windowSize);
    oprot.writeFieldEnd();
    if (this.received != null) {
      oprot.writeFieldBegin(RECEIVED_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.I64,
            this.received.size()));
        for (Map.Entry<Long, Long> _iter15 : this.received.entrySet()) {
          oprot.writeI64(_iter15.getKey());
          oprot.writeI64(_iter15.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.sent != null) {
      oprot.writeFieldBegin(SENT_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.I64, this.sent.size()));
        for (Map.Entry<Long, Long> _iter16 : this.sent.entrySet()) {
          oprot.writeI64(_iter16.getKey());
          oprot.writeI64(_iter16.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.filenames != null) {
      oprot.writeFieldBegin(FILENAMES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.filenames.size()));
        for (String _iter17 : this.filenames) {
          oprot.writeString(_iter17);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.tags != null) {
      oprot.writeFieldBegin(TAGS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING,
            this.tags.size()));
        for (Map.Entry<String, String> _iter18 : this.tags.entrySet()) {
          oprot.writeString(_iter18.getKey());
          oprot.writeString(_iter18.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AuditMessage(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("topic:");
    if (this.topic == null) {
      sb.append("null");
    } else {
      sb.append(this.topic);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("tier:");
    if (this.tier == null) {
      sb.append("null");
    } else {
      sb.append(this.tier);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("hostname:");
    if (this.hostname == null) {
      sb.append("null");
    } else {
      sb.append(this.hostname);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("windowSize:");
    sb.append(this.windowSize);
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("received:");
    if (this.received == null) {
      sb.append("null");
    } else {
      sb.append(this.received);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("sent:");
    if (this.sent == null) {
      sb.append("null");
    } else {
      sb.append(this.sent);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("filenames:");
    if (this.filenames == null) {
      sb.append("null");
    } else {
      sb.append(this.filenames);
    }
    first = false;
    if (!first) {
      sb.append(", ");
    }
    sb.append("tags:");
    if (this.tags == null) {
      sb.append("null");
    } else {
      sb.append(this.tags);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

