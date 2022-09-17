package com.cyberpython.kottakcot.protobuf;

public final class Cotevent {
  private Cotevent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface CotEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.CotEvent)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @return The access.
     */
    java.lang.String getAccess();
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @return The bytes for access.
     */
    com.google.protobuf.ByteString
        getAccessBytes();

    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @return The qos.
     */
    java.lang.String getQos();
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @return The bytes for qos.
     */
    com.google.protobuf.ByteString
        getQosBytes();

    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @return The opex.
     */
    java.lang.String getOpex();
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @return The bytes for opex.
     */
    com.google.protobuf.ByteString
        getOpexBytes();

    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @return The uid.
     */
    java.lang.String getUid();
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @return The bytes for uid.
     */
    com.google.protobuf.ByteString
        getUidBytes();

    /**
     * <pre>
     * &lt;event time="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 sendTime = 6;</code>
     * @return The sendTime.
     */
    long getSendTime();

    /**
     * <pre>
     * &lt;event start="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 startTime = 7;</code>
     * @return The startTime.
     */
    long getStartTime();

    /**
     * <pre>
     * &lt;event stale="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 staleTime = 8;</code>
     * @return The staleTime.
     */
    long getStaleTime();

    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @return The how.
     */
    java.lang.String getHow();
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @return The bytes for how.
     */
    com.google.protobuf.ByteString
        getHowBytes();

    /**
     * <pre>
     * &lt;point&gt;
     * </pre>
     *
     * <code>double lat = 10;</code>
     * @return The lat.
     */
    double getLat();

    /**
     * <pre>
     * &lt;point lon="x"&gt;
     * </pre>
     *
     * <code>double lon = 11;</code>
     * @return The lon.
     */
    double getLon();

    /**
     * <pre>
     * &lt;point hae="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double hae = 12;</code>
     * @return The hae.
     */
    double getHae();

    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double ce = 13;</code>
     * @return The ce.
     */
    double getCe();

    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double le = 14;</code>
     * @return The le.
     */
    double getLe();

    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     * @return Whether the detail field is set.
     */
    boolean hasDetail();
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     * @return The detail.
     */
    com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail getDetail();
  }
  /**
   * <pre>
   * A note about timestamps:
   * Uses "timeMs" units, which is number of milliseconds since
   * 1970-01-01 00:00:00 UTC
   * All items are required unless otherwise noted!
   * "required" means if they are missing in the XML during outbound
   * conversion to protobuf, the message will be
   * rejected
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.CotEvent}
   */
  public  static final class CotEvent extends
      com.google.protobuf.GeneratedMessageLite<
          CotEvent, CotEvent.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.CotEvent)
      CotEventOrBuilder {
    private CotEvent() {
      type_ = "";
      access_ = "";
      qos_ = "";
      opex_ = "";
      uid_ = "";
      how_ = "";
    }
    public static final int TYPE_FIELD_NUMBER = 1;
    private java.lang.String type_;
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      return type_;
    }
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(type_);
    }
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The type to set.
     */
    private void setType(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      type_ = value;
    }
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     */
    private void clearType() {
      
      type_ = getDefaultInstance().getType();
    }
    /**
     * <pre>
     * &lt;event type="x"&gt;
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     */
    private void setTypeBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      type_ = value.toStringUtf8();
      
    }

    public static final int ACCESS_FIELD_NUMBER = 2;
    private java.lang.String access_;
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @return The access.
     */
    @java.lang.Override
    public java.lang.String getAccess() {
      return access_;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @return The bytes for access.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccessBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(access_);
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @param value The access to set.
     */
    private void setAccess(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      access_ = value;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     */
    private void clearAccess() {
      
      access_ = getDefaultInstance().getAccess();
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string access = 2;</code>
     * @param value The bytes for access to set.
     */
    private void setAccessBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      access_ = value.toStringUtf8();
      
    }

    public static final int QOS_FIELD_NUMBER = 3;
    private java.lang.String qos_;
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @return The qos.
     */
    @java.lang.Override
    public java.lang.String getQos() {
      return qos_;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @return The bytes for qos.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getQosBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(qos_);
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @param value The qos to set.
     */
    private void setQos(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      qos_ = value;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     */
    private void clearQos() {
      
      qos_ = getDefaultInstance().getQos();
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string qos = 3;</code>
     * @param value The bytes for qos to set.
     */
    private void setQosBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      qos_ = value.toStringUtf8();
      
    }

    public static final int OPEX_FIELD_NUMBER = 4;
    private java.lang.String opex_;
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @return The opex.
     */
    @java.lang.Override
    public java.lang.String getOpex() {
      return opex_;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @return The bytes for opex.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOpexBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(opex_);
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @param value The opex to set.
     */
    private void setOpex(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      opex_ = value;
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     */
    private void clearOpex() {
      
      opex_ = getDefaultInstance().getOpex();
    }
    /**
     * <pre>
     * optional
     * </pre>
     *
     * <code>string opex = 4;</code>
     * @param value The bytes for opex to set.
     */
    private void setOpexBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      opex_ = value.toStringUtf8();
      
    }

    public static final int UID_FIELD_NUMBER = 5;
    private java.lang.String uid_;
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @return The uid.
     */
    @java.lang.Override
    public java.lang.String getUid() {
      return uid_;
    }
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @return The bytes for uid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(uid_);
    }
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @param value The uid to set.
     */
    private void setUid(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      uid_ = value;
    }
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     */
    private void clearUid() {
      
      uid_ = getDefaultInstance().getUid();
    }
    /**
     * <pre>
     * &lt;event uid="x"&gt;
     * </pre>
     *
     * <code>string uid = 5;</code>
     * @param value The bytes for uid to set.
     */
    private void setUidBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      uid_ = value.toStringUtf8();
      
    }

    public static final int SENDTIME_FIELD_NUMBER = 6;
    private long sendTime_;
    /**
     * <pre>
     * &lt;event time="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 sendTime = 6;</code>
     * @return The sendTime.
     */
    @java.lang.Override
    public long getSendTime() {
      return sendTime_;
    }
    /**
     * <pre>
     * &lt;event time="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 sendTime = 6;</code>
     * @param value The sendTime to set.
     */
    private void setSendTime(long value) {
      
      sendTime_ = value;
    }
    /**
     * <pre>
     * &lt;event time="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 sendTime = 6;</code>
     */
    private void clearSendTime() {
      
      sendTime_ = 0L;
    }

    public static final int STARTTIME_FIELD_NUMBER = 7;
    private long startTime_;
    /**
     * <pre>
     * &lt;event start="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 startTime = 7;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <pre>
     * &lt;event start="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 startTime = 7;</code>
     * @param value The startTime to set.
     */
    private void setStartTime(long value) {
      
      startTime_ = value;
    }
    /**
     * <pre>
     * &lt;event start="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 startTime = 7;</code>
     */
    private void clearStartTime() {
      
      startTime_ = 0L;
    }

    public static final int STALETIME_FIELD_NUMBER = 8;
    private long staleTime_;
    /**
     * <pre>
     * &lt;event stale="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 staleTime = 8;</code>
     * @return The staleTime.
     */
    @java.lang.Override
    public long getStaleTime() {
      return staleTime_;
    }
    /**
     * <pre>
     * &lt;event stale="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 staleTime = 8;</code>
     * @param value The staleTime to set.
     */
    private void setStaleTime(long value) {
      
      staleTime_ = value;
    }
    /**
     * <pre>
     * &lt;event stale="x"&gt; converted to timeMs
     * </pre>
     *
     * <code>uint64 staleTime = 8;</code>
     */
    private void clearStaleTime() {
      
      staleTime_ = 0L;
    }

    public static final int HOW_FIELD_NUMBER = 9;
    private java.lang.String how_;
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @return The how.
     */
    @java.lang.Override
    public java.lang.String getHow() {
      return how_;
    }
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @return The bytes for how.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHowBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(how_);
    }
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @param value The how to set.
     */
    private void setHow(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      how_ = value;
    }
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     */
    private void clearHow() {
      
      how_ = getDefaultInstance().getHow();
    }
    /**
     * <pre>
     * &lt;event how="x"&gt;
     * </pre>
     *
     * <code>string how = 9;</code>
     * @param value The bytes for how to set.
     */
    private void setHowBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      how_ = value.toStringUtf8();
      
    }

    public static final int LAT_FIELD_NUMBER = 10;
    private double lat_;
    /**
     * <pre>
     * &lt;point&gt;
     * </pre>
     *
     * <code>double lat = 10;</code>
     * @return The lat.
     */
    @java.lang.Override
    public double getLat() {
      return lat_;
    }
    /**
     * <pre>
     * &lt;point&gt;
     * </pre>
     *
     * <code>double lat = 10;</code>
     * @param value The lat to set.
     */
    private void setLat(double value) {
      
      lat_ = value;
    }
    /**
     * <pre>
     * &lt;point&gt;
     * </pre>
     *
     * <code>double lat = 10;</code>
     */
    private void clearLat() {
      
      lat_ = 0D;
    }

    public static final int LON_FIELD_NUMBER = 11;
    private double lon_;
    /**
     * <pre>
     * &lt;point lon="x"&gt;
     * </pre>
     *
     * <code>double lon = 11;</code>
     * @return The lon.
     */
    @java.lang.Override
    public double getLon() {
      return lon_;
    }
    /**
     * <pre>
     * &lt;point lon="x"&gt;
     * </pre>
     *
     * <code>double lon = 11;</code>
     * @param value The lon to set.
     */
    private void setLon(double value) {
      
      lon_ = value;
    }
    /**
     * <pre>
     * &lt;point lon="x"&gt;
     * </pre>
     *
     * <code>double lon = 11;</code>
     */
    private void clearLon() {
      
      lon_ = 0D;
    }

    public static final int HAE_FIELD_NUMBER = 12;
    private double hae_;
    /**
     * <pre>
     * &lt;point hae="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double hae = 12;</code>
     * @return The hae.
     */
    @java.lang.Override
    public double getHae() {
      return hae_;
    }
    /**
     * <pre>
     * &lt;point hae="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double hae = 12;</code>
     * @param value The hae to set.
     */
    private void setHae(double value) {
      
      hae_ = value;
    }
    /**
     * <pre>
     * &lt;point hae="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double hae = 12;</code>
     */
    private void clearHae() {
      
      hae_ = 0D;
    }

    public static final int CE_FIELD_NUMBER = 13;
    private double ce_;
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double ce = 13;</code>
     * @return The ce.
     */
    @java.lang.Override
    public double getCe() {
      return ce_;
    }
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double ce = 13;</code>
     * @param value The ce to set.
     */
    private void setCe(double value) {
      
      ce_ = value;
    }
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double ce = 13;</code>
     */
    private void clearCe() {
      
      ce_ = 0D;
    }

    public static final int LE_FIELD_NUMBER = 14;
    private double le_;
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double le = 14;</code>
     * @return The le.
     */
    @java.lang.Override
    public double getLe() {
      return le_;
    }
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double le = 14;</code>
     * @param value The le to set.
     */
    private void setLe(double value) {
      
      le_ = value;
    }
    /**
     * <pre>
     * &lt;point ce="x"&gt; use 999999 for unknown
     * </pre>
     *
     * <code>double le = 14;</code>
     */
    private void clearLe() {
      
      le_ = 0D;
    }

    public static final int DETAIL_FIELD_NUMBER = 15;
    private com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail detail_;
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     */
    @java.lang.Override
    public boolean hasDetail() {
      return detail_ != null;
    }
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail getDetail() {
      return detail_ == null ? com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.getDefaultInstance() : detail_;
    }
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     */
    private void setDetail(com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail value) {
      value.getClass();
  detail_ = value;
      
      }
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeDetail(com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail value) {
      value.getClass();
  if (detail_ != null &&
          detail_ != com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.getDefaultInstance()) {
        detail_ =
          com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.newBuilder(detail_).mergeFrom(value).buildPartial();
      } else {
        detail_ = value;
      }
      
    }
    /**
     * <pre>
     * comprises children of &lt;detail&gt;
     * This is optional - if omitted, then the cot message
     * had no data under &lt;detail&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
     */
    private void clearDetail() {  detail_ = null;
      
    }

    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A note about timestamps:
     * Uses "timeMs" units, which is number of milliseconds since
     * 1970-01-01 00:00:00 UTC
     * All items are required unless otherwise noted!
     * "required" means if they are missing in the XML during outbound
     * conversion to protobuf, the message will be
     * rejected
     * </pre>
     *
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.CotEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.CotEvent)
        com.cyberpython.kottakcot.protobuf.Cotevent.CotEventOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * &lt;event type="x"&gt;
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public java.lang.String getType() {
        return instance.getType();
      }
      /**
       * <pre>
       * &lt;event type="x"&gt;
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The bytes for type.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getTypeBytes() {
        return instance.getTypeBytes();
      }
      /**
       * <pre>
       * &lt;event type="x"&gt;
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event type="x"&gt;
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }
      /**
       * <pre>
       * &lt;event type="x"&gt;
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTypeBytes(value);
        return this;
      }

      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string access = 2;</code>
       * @return The access.
       */
      @java.lang.Override
      public java.lang.String getAccess() {
        return instance.getAccess();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string access = 2;</code>
       * @return The bytes for access.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getAccessBytes() {
        return instance.getAccessBytes();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string access = 2;</code>
       * @param value The access to set.
       * @return This builder for chaining.
       */
      public Builder setAccess(
          java.lang.String value) {
        copyOnWrite();
        instance.setAccess(value);
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string access = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccess() {
        copyOnWrite();
        instance.clearAccess();
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string access = 2;</code>
       * @param value The bytes for access to set.
       * @return This builder for chaining.
       */
      public Builder setAccessBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setAccessBytes(value);
        return this;
      }

      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string qos = 3;</code>
       * @return The qos.
       */
      @java.lang.Override
      public java.lang.String getQos() {
        return instance.getQos();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string qos = 3;</code>
       * @return The bytes for qos.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getQosBytes() {
        return instance.getQosBytes();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string qos = 3;</code>
       * @param value The qos to set.
       * @return This builder for chaining.
       */
      public Builder setQos(
          java.lang.String value) {
        copyOnWrite();
        instance.setQos(value);
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string qos = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQos() {
        copyOnWrite();
        instance.clearQos();
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string qos = 3;</code>
       * @param value The bytes for qos to set.
       * @return This builder for chaining.
       */
      public Builder setQosBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setQosBytes(value);
        return this;
      }

      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string opex = 4;</code>
       * @return The opex.
       */
      @java.lang.Override
      public java.lang.String getOpex() {
        return instance.getOpex();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string opex = 4;</code>
       * @return The bytes for opex.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getOpexBytes() {
        return instance.getOpexBytes();
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string opex = 4;</code>
       * @param value The opex to set.
       * @return This builder for chaining.
       */
      public Builder setOpex(
          java.lang.String value) {
        copyOnWrite();
        instance.setOpex(value);
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string opex = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpex() {
        copyOnWrite();
        instance.clearOpex();
        return this;
      }
      /**
       * <pre>
       * optional
       * </pre>
       *
       * <code>string opex = 4;</code>
       * @param value The bytes for opex to set.
       * @return This builder for chaining.
       */
      public Builder setOpexBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setOpexBytes(value);
        return this;
      }

      /**
       * <pre>
       * &lt;event uid="x"&gt;
       * </pre>
       *
       * <code>string uid = 5;</code>
       * @return The uid.
       */
      @java.lang.Override
      public java.lang.String getUid() {
        return instance.getUid();
      }
      /**
       * <pre>
       * &lt;event uid="x"&gt;
       * </pre>
       *
       * <code>string uid = 5;</code>
       * @return The bytes for uid.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getUidBytes() {
        return instance.getUidBytes();
      }
      /**
       * <pre>
       * &lt;event uid="x"&gt;
       * </pre>
       *
       * <code>string uid = 5;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(
          java.lang.String value) {
        copyOnWrite();
        instance.setUid(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event uid="x"&gt;
       * </pre>
       *
       * <code>string uid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        copyOnWrite();
        instance.clearUid();
        return this;
      }
      /**
       * <pre>
       * &lt;event uid="x"&gt;
       * </pre>
       *
       * <code>string uid = 5;</code>
       * @param value The bytes for uid to set.
       * @return This builder for chaining.
       */
      public Builder setUidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUidBytes(value);
        return this;
      }

      /**
       * <pre>
       * &lt;event time="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 sendTime = 6;</code>
       * @return The sendTime.
       */
      @java.lang.Override
      public long getSendTime() {
        return instance.getSendTime();
      }
      /**
       * <pre>
       * &lt;event time="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 sendTime = 6;</code>
       * @param value The sendTime to set.
       * @return This builder for chaining.
       */
      public Builder setSendTime(long value) {
        copyOnWrite();
        instance.setSendTime(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event time="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 sendTime = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSendTime() {
        copyOnWrite();
        instance.clearSendTime();
        return this;
      }

      /**
       * <pre>
       * &lt;event start="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 startTime = 7;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public long getStartTime() {
        return instance.getStartTime();
      }
      /**
       * <pre>
       * &lt;event start="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 startTime = 7;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(long value) {
        copyOnWrite();
        instance.setStartTime(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event start="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 startTime = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        copyOnWrite();
        instance.clearStartTime();
        return this;
      }

      /**
       * <pre>
       * &lt;event stale="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 staleTime = 8;</code>
       * @return The staleTime.
       */
      @java.lang.Override
      public long getStaleTime() {
        return instance.getStaleTime();
      }
      /**
       * <pre>
       * &lt;event stale="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 staleTime = 8;</code>
       * @param value The staleTime to set.
       * @return This builder for chaining.
       */
      public Builder setStaleTime(long value) {
        copyOnWrite();
        instance.setStaleTime(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event stale="x"&gt; converted to timeMs
       * </pre>
       *
       * <code>uint64 staleTime = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearStaleTime() {
        copyOnWrite();
        instance.clearStaleTime();
        return this;
      }

      /**
       * <pre>
       * &lt;event how="x"&gt;
       * </pre>
       *
       * <code>string how = 9;</code>
       * @return The how.
       */
      @java.lang.Override
      public java.lang.String getHow() {
        return instance.getHow();
      }
      /**
       * <pre>
       * &lt;event how="x"&gt;
       * </pre>
       *
       * <code>string how = 9;</code>
       * @return The bytes for how.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getHowBytes() {
        return instance.getHowBytes();
      }
      /**
       * <pre>
       * &lt;event how="x"&gt;
       * </pre>
       *
       * <code>string how = 9;</code>
       * @param value The how to set.
       * @return This builder for chaining.
       */
      public Builder setHow(
          java.lang.String value) {
        copyOnWrite();
        instance.setHow(value);
        return this;
      }
      /**
       * <pre>
       * &lt;event how="x"&gt;
       * </pre>
       *
       * <code>string how = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHow() {
        copyOnWrite();
        instance.clearHow();
        return this;
      }
      /**
       * <pre>
       * &lt;event how="x"&gt;
       * </pre>
       *
       * <code>string how = 9;</code>
       * @param value The bytes for how to set.
       * @return This builder for chaining.
       */
      public Builder setHowBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setHowBytes(value);
        return this;
      }

      /**
       * <pre>
       * &lt;point&gt;
       * </pre>
       *
       * <code>double lat = 10;</code>
       * @return The lat.
       */
      @java.lang.Override
      public double getLat() {
        return instance.getLat();
      }
      /**
       * <pre>
       * &lt;point&gt;
       * </pre>
       *
       * <code>double lat = 10;</code>
       * @param value The lat to set.
       * @return This builder for chaining.
       */
      public Builder setLat(double value) {
        copyOnWrite();
        instance.setLat(value);
        return this;
      }
      /**
       * <pre>
       * &lt;point&gt;
       * </pre>
       *
       * <code>double lat = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLat() {
        copyOnWrite();
        instance.clearLat();
        return this;
      }

      /**
       * <pre>
       * &lt;point lon="x"&gt;
       * </pre>
       *
       * <code>double lon = 11;</code>
       * @return The lon.
       */
      @java.lang.Override
      public double getLon() {
        return instance.getLon();
      }
      /**
       * <pre>
       * &lt;point lon="x"&gt;
       * </pre>
       *
       * <code>double lon = 11;</code>
       * @param value The lon to set.
       * @return This builder for chaining.
       */
      public Builder setLon(double value) {
        copyOnWrite();
        instance.setLon(value);
        return this;
      }
      /**
       * <pre>
       * &lt;point lon="x"&gt;
       * </pre>
       *
       * <code>double lon = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLon() {
        copyOnWrite();
        instance.clearLon();
        return this;
      }

      /**
       * <pre>
       * &lt;point hae="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double hae = 12;</code>
       * @return The hae.
       */
      @java.lang.Override
      public double getHae() {
        return instance.getHae();
      }
      /**
       * <pre>
       * &lt;point hae="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double hae = 12;</code>
       * @param value The hae to set.
       * @return This builder for chaining.
       */
      public Builder setHae(double value) {
        copyOnWrite();
        instance.setHae(value);
        return this;
      }
      /**
       * <pre>
       * &lt;point hae="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double hae = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearHae() {
        copyOnWrite();
        instance.clearHae();
        return this;
      }

      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double ce = 13;</code>
       * @return The ce.
       */
      @java.lang.Override
      public double getCe() {
        return instance.getCe();
      }
      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double ce = 13;</code>
       * @param value The ce to set.
       * @return This builder for chaining.
       */
      public Builder setCe(double value) {
        copyOnWrite();
        instance.setCe(value);
        return this;
      }
      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double ce = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCe() {
        copyOnWrite();
        instance.clearCe();
        return this;
      }

      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double le = 14;</code>
       * @return The le.
       */
      @java.lang.Override
      public double getLe() {
        return instance.getLe();
      }
      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double le = 14;</code>
       * @param value The le to set.
       * @return This builder for chaining.
       */
      public Builder setLe(double value) {
        copyOnWrite();
        instance.setLe(value);
        return this;
      }
      /**
       * <pre>
       * &lt;point ce="x"&gt; use 999999 for unknown
       * </pre>
       *
       * <code>double le = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLe() {
        copyOnWrite();
        instance.clearLe();
        return this;
      }

      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      @java.lang.Override
      public boolean hasDetail() {
        return instance.hasDetail();
      }
      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail getDetail() {
        return instance.getDetail();
      }
      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      public Builder setDetail(com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail value) {
        copyOnWrite();
        instance.setDetail(value);
        return this;
        }
      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      public Builder setDetail(
          com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.Builder builderForValue) {
        copyOnWrite();
        instance.setDetail(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      public Builder mergeDetail(com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail value) {
        copyOnWrite();
        instance.mergeDetail(value);
        return this;
      }
      /**
       * <pre>
       * comprises children of &lt;detail&gt;
       * This is optional - if omitted, then the cot message
       * had no data under &lt;detail&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Detail detail = 15;</code>
       */
      public Builder clearDetail() {  copyOnWrite();
        instance.clearDetail();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.CotEvent)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "type_",
              "access_",
              "qos_",
              "opex_",
              "uid_",
              "sendTime_",
              "startTime_",
              "staleTime_",
              "how_",
              "lat_",
              "lon_",
              "hae_",
              "ce_",
              "le_",
              "detail_",
            };
            java.lang.String info =
                "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0003\u0007\u0003\b\u0003\t\u0208\n\u0000" +
                "\u000b\u0000\f\u0000\r\u0000\u000e\u0000\u000f\t";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.CotEvent)
    private static final com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent DEFAULT_INSTANCE;
    static {
      CotEvent defaultInstance = new CotEvent();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        CotEvent.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<CotEvent> PARSER;

    public static com.google.protobuf.Parser<CotEvent> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
