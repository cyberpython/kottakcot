package com.cyberpython.kottakcot.protobuf;

public final class Takcontrol {
  private Takcontrol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TakControlOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.TakControl)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Lowest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 minProtoVersion = 1;</code>
     * @return The minProtoVersion.
     */
    int getMinProtoVersion();

    /**
     * <pre>
     * Highest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 maxProtoVersion = 2;</code>
     * @return The maxProtoVersion.
     */
    int getMaxProtoVersion();

    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @return The contactUid.
     */
    java.lang.String getContactUid();
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @return The bytes for contactUid.
     */
    com.google.protobuf.ByteString
        getContactUidBytes();
  }
  /**
   * <pre>
   * TAK Protocol control message
   * This specifies to a recipient what versions
   * of protocol elements this sender supports during
   * decoding.
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.TakControl}
   */
  public  static final class TakControl extends
      com.google.protobuf.GeneratedMessageLite<
          TakControl, TakControl.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.TakControl)
      TakControlOrBuilder {
    private TakControl() {
      contactUid_ = "";
    }
    public static final int MINPROTOVERSION_FIELD_NUMBER = 1;
    private int minProtoVersion_;
    /**
     * <pre>
     * Lowest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 minProtoVersion = 1;</code>
     * @return The minProtoVersion.
     */
    @java.lang.Override
    public int getMinProtoVersion() {
      return minProtoVersion_;
    }
    /**
     * <pre>
     * Lowest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 minProtoVersion = 1;</code>
     * @param value The minProtoVersion to set.
     */
    private void setMinProtoVersion(int value) {
      
      minProtoVersion_ = value;
    }
    /**
     * <pre>
     * Lowest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 minProtoVersion = 1;</code>
     */
    private void clearMinProtoVersion() {
      
      minProtoVersion_ = 0;
    }

    public static final int MAXPROTOVERSION_FIELD_NUMBER = 2;
    private int maxProtoVersion_;
    /**
     * <pre>
     * Highest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 maxProtoVersion = 2;</code>
     * @return The maxProtoVersion.
     */
    @java.lang.Override
    public int getMaxProtoVersion() {
      return maxProtoVersion_;
    }
    /**
     * <pre>
     * Highest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 maxProtoVersion = 2;</code>
     * @param value The maxProtoVersion to set.
     */
    private void setMaxProtoVersion(int value) {
      
      maxProtoVersion_ = value;
    }
    /**
     * <pre>
     * Highest TAK protocol version supported
     * If not filled in (reads as 0), version 1 is assumed
     * </pre>
     *
     * <code>uint32 maxProtoVersion = 2;</code>
     */
    private void clearMaxProtoVersion() {
      
      maxProtoVersion_ = 0;
    }

    public static final int CONTACTUID_FIELD_NUMBER = 3;
    private java.lang.String contactUid_;
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @return The contactUid.
     */
    @java.lang.Override
    public java.lang.String getContactUid() {
      return contactUid_;
    }
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @return The bytes for contactUid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContactUidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(contactUid_);
    }
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @param value The contactUid to set.
     */
    private void setContactUid(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      contactUid_ = value;
    }
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     */
    private void clearContactUid() {
      
      contactUid_ = getDefaultInstance().getContactUid();
    }
    /**
     * <pre>
     * UID of the sending contact. May be omitted if
     * this message is paired in a TakMessage with a CotEvent
     * and the CotEvent contains this information
     * </pre>
     *
     * <code>string contactUid = 3;</code>
     * @param value The bytes for contactUid to set.
     */
    private void setContactUidBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      contactUid_ = value.toStringUtf8();
      
    }

    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * TAK Protocol control message
     * This specifies to a recipient what versions
     * of protocol elements this sender supports during
     * decoding.
     * </pre>
     *
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.TakControl}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.TakControl)
        com.cyberpython.kottakcot.protobuf.Takcontrol.TakControlOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Lowest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 minProtoVersion = 1;</code>
       * @return The minProtoVersion.
       */
      @java.lang.Override
      public int getMinProtoVersion() {
        return instance.getMinProtoVersion();
      }
      /**
       * <pre>
       * Lowest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 minProtoVersion = 1;</code>
       * @param value The minProtoVersion to set.
       * @return This builder for chaining.
       */
      public Builder setMinProtoVersion(int value) {
        copyOnWrite();
        instance.setMinProtoVersion(value);
        return this;
      }
      /**
       * <pre>
       * Lowest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 minProtoVersion = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinProtoVersion() {
        copyOnWrite();
        instance.clearMinProtoVersion();
        return this;
      }

      /**
       * <pre>
       * Highest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 maxProtoVersion = 2;</code>
       * @return The maxProtoVersion.
       */
      @java.lang.Override
      public int getMaxProtoVersion() {
        return instance.getMaxProtoVersion();
      }
      /**
       * <pre>
       * Highest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 maxProtoVersion = 2;</code>
       * @param value The maxProtoVersion to set.
       * @return This builder for chaining.
       */
      public Builder setMaxProtoVersion(int value) {
        copyOnWrite();
        instance.setMaxProtoVersion(value);
        return this;
      }
      /**
       * <pre>
       * Highest TAK protocol version supported
       * If not filled in (reads as 0), version 1 is assumed
       * </pre>
       *
       * <code>uint32 maxProtoVersion = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxProtoVersion() {
        copyOnWrite();
        instance.clearMaxProtoVersion();
        return this;
      }

      /**
       * <pre>
       * UID of the sending contact. May be omitted if
       * this message is paired in a TakMessage with a CotEvent
       * and the CotEvent contains this information
       * </pre>
       *
       * <code>string contactUid = 3;</code>
       * @return The contactUid.
       */
      @java.lang.Override
      public java.lang.String getContactUid() {
        return instance.getContactUid();
      }
      /**
       * <pre>
       * UID of the sending contact. May be omitted if
       * this message is paired in a TakMessage with a CotEvent
       * and the CotEvent contains this information
       * </pre>
       *
       * <code>string contactUid = 3;</code>
       * @return The bytes for contactUid.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getContactUidBytes() {
        return instance.getContactUidBytes();
      }
      /**
       * <pre>
       * UID of the sending contact. May be omitted if
       * this message is paired in a TakMessage with a CotEvent
       * and the CotEvent contains this information
       * </pre>
       *
       * <code>string contactUid = 3;</code>
       * @param value The contactUid to set.
       * @return This builder for chaining.
       */
      public Builder setContactUid(
          java.lang.String value) {
        copyOnWrite();
        instance.setContactUid(value);
        return this;
      }
      /**
       * <pre>
       * UID of the sending contact. May be omitted if
       * this message is paired in a TakMessage with a CotEvent
       * and the CotEvent contains this information
       * </pre>
       *
       * <code>string contactUid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearContactUid() {
        copyOnWrite();
        instance.clearContactUid();
        return this;
      }
      /**
       * <pre>
       * UID of the sending contact. May be omitted if
       * this message is paired in a TakMessage with a CotEvent
       * and the CotEvent contains this information
       * </pre>
       *
       * <code>string contactUid = 3;</code>
       * @param value The bytes for contactUid to set.
       * @return This builder for chaining.
       */
      public Builder setContactUidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setContactUidBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.TakControl)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "minProtoVersion_",
              "maxProtoVersion_",
              "contactUid_",
            };
            java.lang.String info =
                "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b" +
                "\u0003\u0208";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.TakControl)
    private static final com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl DEFAULT_INSTANCE;
    static {
      TakControl defaultInstance = new TakControl();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        TakControl.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TakControl> PARSER;

    public static com.google.protobuf.Parser<TakControl> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
