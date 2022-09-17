package com.cyberpython.kottakcot.protobuf;

public final class Precisionlocation {
  private Precisionlocation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PrecisionLocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.PrecisionLocation)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @return The geopointsrc.
     */
    java.lang.String getGeopointsrc();
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @return The bytes for geopointsrc.
     */
    com.google.protobuf.ByteString
        getGeopointsrcBytes();

    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @return The altsrc.
     */
    java.lang.String getAltsrc();
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @return The bytes for altsrc.
     */
    com.google.protobuf.ByteString
        getAltsrcBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.PrecisionLocation}
   */
  public  static final class PrecisionLocation extends
      com.google.protobuf.GeneratedMessageLite<
          PrecisionLocation, PrecisionLocation.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.PrecisionLocation)
      PrecisionLocationOrBuilder {
    private PrecisionLocation() {
      geopointsrc_ = "";
      altsrc_ = "";
    }
    public static final int GEOPOINTSRC_FIELD_NUMBER = 1;
    private java.lang.String geopointsrc_;
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @return The geopointsrc.
     */
    @java.lang.Override
    public java.lang.String getGeopointsrc() {
      return geopointsrc_;
    }
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @return The bytes for geopointsrc.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGeopointsrcBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(geopointsrc_);
    }
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @param value The geopointsrc to set.
     */
    private void setGeopointsrc(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      geopointsrc_ = value;
    }
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     */
    private void clearGeopointsrc() {
      
      geopointsrc_ = getDefaultInstance().getGeopointsrc();
    }
    /**
     * <pre>
     * geopointsrc=
     * </pre>
     *
     * <code>string geopointsrc = 1;</code>
     * @param value The bytes for geopointsrc to set.
     */
    private void setGeopointsrcBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      geopointsrc_ = value.toStringUtf8();
      
    }

    public static final int ALTSRC_FIELD_NUMBER = 2;
    private java.lang.String altsrc_;
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @return The altsrc.
     */
    @java.lang.Override
    public java.lang.String getAltsrc() {
      return altsrc_;
    }
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @return The bytes for altsrc.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAltsrcBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(altsrc_);
    }
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @param value The altsrc to set.
     */
    private void setAltsrc(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      altsrc_ = value;
    }
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     */
    private void clearAltsrc() {
      
      altsrc_ = getDefaultInstance().getAltsrc();
    }
    /**
     * <pre>
     * altsrc=
     * </pre>
     *
     * <code>string altsrc = 2;</code>
     * @param value The bytes for altsrc to set.
     */
    private void setAltsrcBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      altsrc_ = value.toStringUtf8();
      
    }

    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * All items are required unless otherwise noted!
     * "required" means if they are missing on send, the conversion
     * to the message format will be rejected and fall back to opaque
     * XML representation
     * </pre>
     *
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.PrecisionLocation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.PrecisionLocation)
        com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocationOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>string geopointsrc = 1;</code>
       * @return The geopointsrc.
       */
      @java.lang.Override
      public java.lang.String getGeopointsrc() {
        return instance.getGeopointsrc();
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>string geopointsrc = 1;</code>
       * @return The bytes for geopointsrc.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getGeopointsrcBytes() {
        return instance.getGeopointsrcBytes();
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>string geopointsrc = 1;</code>
       * @param value The geopointsrc to set.
       * @return This builder for chaining.
       */
      public Builder setGeopointsrc(
          java.lang.String value) {
        copyOnWrite();
        instance.setGeopointsrc(value);
        return this;
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>string geopointsrc = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGeopointsrc() {
        copyOnWrite();
        instance.clearGeopointsrc();
        return this;
      }
      /**
       * <pre>
       * geopointsrc=
       * </pre>
       *
       * <code>string geopointsrc = 1;</code>
       * @param value The bytes for geopointsrc to set.
       * @return This builder for chaining.
       */
      public Builder setGeopointsrcBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGeopointsrcBytes(value);
        return this;
      }

      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>string altsrc = 2;</code>
       * @return The altsrc.
       */
      @java.lang.Override
      public java.lang.String getAltsrc() {
        return instance.getAltsrc();
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>string altsrc = 2;</code>
       * @return The bytes for altsrc.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getAltsrcBytes() {
        return instance.getAltsrcBytes();
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>string altsrc = 2;</code>
       * @param value The altsrc to set.
       * @return This builder for chaining.
       */
      public Builder setAltsrc(
          java.lang.String value) {
        copyOnWrite();
        instance.setAltsrc(value);
        return this;
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>string altsrc = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAltsrc() {
        copyOnWrite();
        instance.clearAltsrc();
        return this;
      }
      /**
       * <pre>
       * altsrc=
       * </pre>
       *
       * <code>string altsrc = 2;</code>
       * @param value The bytes for altsrc to set.
       * @return This builder for chaining.
       */
      public Builder setAltsrcBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setAltsrcBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.PrecisionLocation)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "geopointsrc_",
              "altsrc_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.PrecisionLocation)
    private static final com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation DEFAULT_INSTANCE;
    static {
      PrecisionLocation defaultInstance = new PrecisionLocation();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        PrecisionLocation.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.Precisionlocation.PrecisionLocation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PrecisionLocation> PARSER;

    public static com.google.protobuf.Parser<PrecisionLocation> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
