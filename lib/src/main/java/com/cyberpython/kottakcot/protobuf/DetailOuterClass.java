package com.cyberpython.kottakcot.protobuf;

public final class DetailOuterClass {
  private DetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface DetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.Detail)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string xmlDetail = 1;</code>
     * @return The xmlDetail.
     */
    java.lang.String getXmlDetail();
    /**
     * <code>string xmlDetail = 1;</code>
     * @return The bytes for xmlDetail.
     */
    com.google.protobuf.ByteString
        getXmlDetailBytes();

    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     * @return Whether the contact field is set.
     */
    boolean hasContact();
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     * @return The contact.
     */
    com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact getContact();

    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     * @return Whether the group field is set.
     */
    boolean hasGroup();
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     * @return The group.
     */
    com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group getGroup();

    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     * @return Whether the precisionLocation field is set.
     */
    boolean hasPrecisionLocation();
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     * @return The precisionLocation.
     */
    com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation getPrecisionLocation();

    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     * @return Whether the status field is set.
     */
    boolean hasStatus();
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     * @return The status.
     */
    com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status getStatus();

    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     * @return Whether the takv field is set.
     */
    boolean hasTakv();
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     * @return The takv.
     */
    com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv getTakv();

    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     * @return Whether the track field is set.
     */
    boolean hasTrack();
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     * @return The track.
     */
    com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track getTrack();
  }
  /**
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Detail}
   */
  public  static final class Detail extends
      com.google.protobuf.GeneratedMessageLite<
          Detail, Detail.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.Detail)
      DetailOrBuilder {
    private Detail() {
      xmlDetail_ = "";
    }
    public static final int XMLDETAIL_FIELD_NUMBER = 1;
    private java.lang.String xmlDetail_;
    /**
     * <code>string xmlDetail = 1;</code>
     * @return The xmlDetail.
     */
    @java.lang.Override
    public java.lang.String getXmlDetail() {
      return xmlDetail_;
    }
    /**
     * <code>string xmlDetail = 1;</code>
     * @return The bytes for xmlDetail.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getXmlDetailBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(xmlDetail_);
    }
    /**
     * <code>string xmlDetail = 1;</code>
     * @param value The xmlDetail to set.
     */
    private void setXmlDetail(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      xmlDetail_ = value;
    }
    /**
     * <code>string xmlDetail = 1;</code>
     */
    private void clearXmlDetail() {
      
      xmlDetail_ = getDefaultInstance().getXmlDetail();
    }
    /**
     * <code>string xmlDetail = 1;</code>
     * @param value The bytes for xmlDetail to set.
     */
    private void setXmlDetailBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      xmlDetail_ = value.toStringUtf8();
      
    }

    public static final int CONTACT_FIELD_NUMBER = 2;
    private com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact contact_;
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     */
    @java.lang.Override
    public boolean hasContact() {
      return contact_ != null;
    }
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact getContact() {
      return contact_ == null ? com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.getDefaultInstance() : contact_;
    }
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     */
    private void setContact(com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact value) {
      value.getClass();
  contact_ = value;
      
      }
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeContact(com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact value) {
      value.getClass();
  if (contact_ != null &&
          contact_ != com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.getDefaultInstance()) {
        contact_ =
          com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.newBuilder(contact_).mergeFrom(value).buildPartial();
      } else {
        contact_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;contact&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
     */
    private void clearContact() {  contact_ = null;
      
    }

    public static final int GROUP_FIELD_NUMBER = 3;
    private com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group group_;
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     */
    @java.lang.Override
    public boolean hasGroup() {
      return group_ != null;
    }
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group getGroup() {
      return group_ == null ? com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.getDefaultInstance() : group_;
    }
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     */
    private void setGroup(com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group value) {
      value.getClass();
  group_ = value;
      
      }
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeGroup(com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group value) {
      value.getClass();
  if (group_ != null &&
          group_ != com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.getDefaultInstance()) {
        group_ =
          com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.newBuilder(group_).mergeFrom(value).buildPartial();
      } else {
        group_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;__group&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
     */
    private void clearGroup() {  group_ = null;
      
    }

    public static final int PRECISIONLOCATION_FIELD_NUMBER = 4;
    private com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation precisionLocation_;
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     */
    @java.lang.Override
    public boolean hasPrecisionLocation() {
      return precisionLocation_ != null;
    }
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation getPrecisionLocation() {
      return precisionLocation_ == null ? com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.getDefaultInstance() : precisionLocation_;
    }
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     */
    private void setPrecisionLocation(com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation value) {
      value.getClass();
  precisionLocation_ = value;
      
      }
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergePrecisionLocation(com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation value) {
      value.getClass();
  if (precisionLocation_ != null &&
          precisionLocation_ != com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.getDefaultInstance()) {
        precisionLocation_ =
          com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.newBuilder(precisionLocation_).mergeFrom(value).buildPartial();
      } else {
        precisionLocation_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;precisionlocation&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
     */
    private void clearPrecisionLocation() {  precisionLocation_ = null;
      
    }

    public static final int STATUS_FIELD_NUMBER = 5;
    private com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status status_;
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     */
    @java.lang.Override
    public boolean hasStatus() {
      return status_ != null;
    }
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status getStatus() {
      return status_ == null ? com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status.getDefaultInstance() : status_;
    }
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     */
    private void setStatus(com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status value) {
      value.getClass();
  status_ = value;
      
      }
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeStatus(com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status value) {
      value.getClass();
  if (status_ != null &&
          status_ != com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status.getDefaultInstance()) {
        status_ =
          com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status.newBuilder(status_).mergeFrom(value).buildPartial();
      } else {
        status_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;status&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
     */
    private void clearStatus() {  status_ = null;
      
    }

    public static final int TAKV_FIELD_NUMBER = 6;
    private com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv takv_;
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     */
    @java.lang.Override
    public boolean hasTakv() {
      return takv_ != null;
    }
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv getTakv() {
      return takv_ == null ? com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.getDefaultInstance() : takv_;
    }
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     */
    private void setTakv(com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv value) {
      value.getClass();
  takv_ = value;
      
      }
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeTakv(com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv value) {
      value.getClass();
  if (takv_ != null &&
          takv_ != com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.getDefaultInstance()) {
        takv_ =
          com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.newBuilder(takv_).mergeFrom(value).buildPartial();
      } else {
        takv_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;takv&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
     */
    private void clearTakv() {  takv_ = null;
      
    }

    public static final int TRACK_FIELD_NUMBER = 7;
    private com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track track_;
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     */
    @java.lang.Override
    public boolean hasTrack() {
      return track_ != null;
    }
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track getTrack() {
      return track_ == null ? com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.getDefaultInstance() : track_;
    }
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     */
    private void setTrack(com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track value) {
      value.getClass();
  track_ = value;
      
      }
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeTrack(com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track value) {
      value.getClass();
  if (track_ != null &&
          track_ != com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.getDefaultInstance()) {
        track_ =
          com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.newBuilder(track_).mergeFrom(value).buildPartial();
      } else {
        track_ = value;
      }
      
    }
    /**
     * <pre>
     * &lt;track&gt;
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
     */
    private void clearTrack() {  track_ = null;
      
    }

    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Detail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.Detail)
        com.cyberpython.kottakcot.protobuf.DetailOuterClass.DetailOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string xmlDetail = 1;</code>
       * @return The xmlDetail.
       */
      @java.lang.Override
      public java.lang.String getXmlDetail() {
        return instance.getXmlDetail();
      }
      /**
       * <code>string xmlDetail = 1;</code>
       * @return The bytes for xmlDetail.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getXmlDetailBytes() {
        return instance.getXmlDetailBytes();
      }
      /**
       * <code>string xmlDetail = 1;</code>
       * @param value The xmlDetail to set.
       * @return This builder for chaining.
       */
      public Builder setXmlDetail(
          java.lang.String value) {
        copyOnWrite();
        instance.setXmlDetail(value);
        return this;
      }
      /**
       * <code>string xmlDetail = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearXmlDetail() {
        copyOnWrite();
        instance.clearXmlDetail();
        return this;
      }
      /**
       * <code>string xmlDetail = 1;</code>
       * @param value The bytes for xmlDetail to set.
       * @return This builder for chaining.
       */
      public Builder setXmlDetailBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setXmlDetailBytes(value);
        return this;
      }

      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      @java.lang.Override
      public boolean hasContact() {
        return instance.hasContact();
      }
      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact getContact() {
        return instance.getContact();
      }
      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      public Builder setContact(com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact value) {
        copyOnWrite();
        instance.setContact(value);
        return this;
        }
      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      public Builder setContact(
          com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.Builder builderForValue) {
        copyOnWrite();
        instance.setContact(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      public Builder mergeContact(com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact value) {
        copyOnWrite();
        instance.mergeContact(value);
        return this;
      }
      /**
       * <pre>
       * &lt;contact&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Contact contact = 2;</code>
       */
      public Builder clearContact() {  copyOnWrite();
        instance.clearContact();
        return this;
      }

      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      @java.lang.Override
      public boolean hasGroup() {
        return instance.hasGroup();
      }
      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group getGroup() {
        return instance.getGroup();
      }
      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      public Builder setGroup(com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group value) {
        copyOnWrite();
        instance.setGroup(value);
        return this;
        }
      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      public Builder setGroup(
          com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.Builder builderForValue) {
        copyOnWrite();
        instance.setGroup(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      public Builder mergeGroup(com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group value) {
        copyOnWrite();
        instance.mergeGroup(value);
        return this;
      }
      /**
       * <pre>
       * &lt;__group&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Group group = 3;</code>
       */
      public Builder clearGroup() {  copyOnWrite();
        instance.clearGroup();
        return this;
      }

      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      @java.lang.Override
      public boolean hasPrecisionLocation() {
        return instance.hasPrecisionLocation();
      }
      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation getPrecisionLocation() {
        return instance.getPrecisionLocation();
      }
      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      public Builder setPrecisionLocation(com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation value) {
        copyOnWrite();
        instance.setPrecisionLocation(value);
        return this;
        }
      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      public Builder setPrecisionLocation(
          com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.Builder builderForValue) {
        copyOnWrite();
        instance.setPrecisionLocation(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      public Builder mergePrecisionLocation(com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation value) {
        copyOnWrite();
        instance.mergePrecisionLocation(value);
        return this;
      }
      /**
       * <pre>
       * &lt;precisionlocation&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.PrecisionLocation precisionLocation = 4;</code>
       */
      public Builder clearPrecisionLocation() {  copyOnWrite();
        instance.clearPrecisionLocation();
        return this;
      }

      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      @java.lang.Override
      public boolean hasStatus() {
        return instance.hasStatus();
      }
      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status getStatus() {
        return instance.getStatus();
      }
      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      public Builder setStatus(com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status value) {
        copyOnWrite();
        instance.setStatus(value);
        return this;
        }
      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      public Builder setStatus(
          com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status.Builder builderForValue) {
        copyOnWrite();
        instance.setStatus(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      public Builder mergeStatus(com.cyberpython.kottakcot.protobuf.StatusOuterClass.Status value) {
        copyOnWrite();
        instance.mergeStatus(value);
        return this;
      }
      /**
       * <pre>
       * &lt;status&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Status status = 5;</code>
       */
      public Builder clearStatus() {  copyOnWrite();
        instance.clearStatus();
        return this;
      }

      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      @java.lang.Override
      public boolean hasTakv() {
        return instance.hasTakv();
      }
      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv getTakv() {
        return instance.getTakv();
      }
      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      public Builder setTakv(com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv value) {
        copyOnWrite();
        instance.setTakv(value);
        return this;
        }
      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      public Builder setTakv(
          com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.Builder builderForValue) {
        copyOnWrite();
        instance.setTakv(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      public Builder mergeTakv(com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv value) {
        copyOnWrite();
        instance.mergeTakv(value);
        return this;
      }
      /**
       * <pre>
       * &lt;takv&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Takv takv = 6;</code>
       */
      public Builder clearTakv() {  copyOnWrite();
        instance.clearTakv();
        return this;
      }

      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      @java.lang.Override
      public boolean hasTrack() {
        return instance.hasTrack();
      }
      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track getTrack() {
        return instance.getTrack();
      }
      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      public Builder setTrack(com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track value) {
        copyOnWrite();
        instance.setTrack(value);
        return this;
        }
      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      public Builder setTrack(
          com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.Builder builderForValue) {
        copyOnWrite();
        instance.setTrack(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      public Builder mergeTrack(com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track value) {
        copyOnWrite();
        instance.mergeTrack(value);
        return this;
      }
      /**
       * <pre>
       * &lt;track&gt;
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.Track track = 7;</code>
       */
      public Builder clearTrack() {  copyOnWrite();
        instance.clearTrack();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.Detail)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "xmlDetail_",
              "contact_",
              "group_",
              "precisionLocation_",
              "status_",
              "takv_",
              "track_",
            };
            java.lang.String info =
                "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\t" +
                "\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.Detail)
    private static final com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail DEFAULT_INSTANCE;
    static {
      Detail defaultInstance = new Detail();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Detail.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.DetailOuterClass.Detail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Detail> PARSER;

    public static com.google.protobuf.Parser<Detail> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
