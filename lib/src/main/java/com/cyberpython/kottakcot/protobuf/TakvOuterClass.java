package com.cyberpython.kottakcot.protobuf;

public final class TakvOuterClass {
  private TakvOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TakvOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.Takv)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @return The device.
     */
    java.lang.String getDevice();
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @return The bytes for device.
     */
    com.google.protobuf.ByteString
        getDeviceBytes();

    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @return The platform.
     */
    java.lang.String getPlatform();
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @return The bytes for platform.
     */
    com.google.protobuf.ByteString
        getPlatformBytes();

    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @return The os.
     */
    java.lang.String getOs();
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @return The bytes for os.
     */
    com.google.protobuf.ByteString
        getOsBytes();

    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @return The version.
     */
    java.lang.String getVersion();
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @return The bytes for version.
     */
    com.google.protobuf.ByteString
        getVersionBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Takv}
   */
  public  static final class Takv extends
      com.google.protobuf.GeneratedMessageLite<
          Takv, Takv.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.Takv)
      TakvOrBuilder {
    private Takv() {
      device_ = "";
      platform_ = "";
      os_ = "";
      version_ = "";
    }
    public static final int DEVICE_FIELD_NUMBER = 1;
    private java.lang.String device_;
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @return The device.
     */
    @java.lang.Override
    public java.lang.String getDevice() {
      return device_;
    }
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @return The bytes for device.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(device_);
    }
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @param value The device to set.
     */
    private void setDevice(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      device_ = value;
    }
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     */
    private void clearDevice() {
      
      device_ = getDefaultInstance().getDevice();
    }
    /**
     * <pre>
     * device=
     * </pre>
     *
     * <code>string device = 1;</code>
     * @param value The bytes for device to set.
     */
    private void setDeviceBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      device_ = value.toStringUtf8();
      
    }

    public static final int PLATFORM_FIELD_NUMBER = 2;
    private java.lang.String platform_;
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @return The platform.
     */
    @java.lang.Override
    public java.lang.String getPlatform() {
      return platform_;
    }
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @return The bytes for platform.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPlatformBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(platform_);
    }
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @param value The platform to set.
     */
    private void setPlatform(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      platform_ = value;
    }
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     */
    private void clearPlatform() {
      
      platform_ = getDefaultInstance().getPlatform();
    }
    /**
     * <pre>
     * platform=
     * </pre>
     *
     * <code>string platform = 2;</code>
     * @param value The bytes for platform to set.
     */
    private void setPlatformBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      platform_ = value.toStringUtf8();
      
    }

    public static final int OS_FIELD_NUMBER = 3;
    private java.lang.String os_;
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @return The os.
     */
    @java.lang.Override
    public java.lang.String getOs() {
      return os_;
    }
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @return The bytes for os.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOsBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(os_);
    }
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @param value The os to set.
     */
    private void setOs(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      os_ = value;
    }
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     */
    private void clearOs() {
      
      os_ = getDefaultInstance().getOs();
    }
    /**
     * <pre>
     * os=
     * </pre>
     *
     * <code>string os = 3;</code>
     * @param value The bytes for os to set.
     */
    private void setOsBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      os_ = value.toStringUtf8();
      
    }

    public static final int VERSION_FIELD_NUMBER = 4;
    private java.lang.String version_;
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @return The version.
     */
    @java.lang.Override
    public java.lang.String getVersion() {
      return version_;
    }
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @return The bytes for version.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVersionBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(version_);
    }
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @param value The version to set.
     */
    private void setVersion(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      version_ = value;
    }
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     */
    private void clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
    }
    /**
     * <pre>
     * version=
     * </pre>
     *
     * <code>string version = 4;</code>
     * @param value The bytes for version to set.
     */
    private void setVersionBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      version_ = value.toStringUtf8();
      
    }

    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv prototype) {
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
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Takv}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.Takv)
        com.cyberpython.kottakcot.protobuf.TakvOuterClass.TakvOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * device=
       * </pre>
       *
       * <code>string device = 1;</code>
       * @return The device.
       */
      @java.lang.Override
      public java.lang.String getDevice() {
        return instance.getDevice();
      }
      /**
       * <pre>
       * device=
       * </pre>
       *
       * <code>string device = 1;</code>
       * @return The bytes for device.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getDeviceBytes() {
        return instance.getDeviceBytes();
      }
      /**
       * <pre>
       * device=
       * </pre>
       *
       * <code>string device = 1;</code>
       * @param value The device to set.
       * @return This builder for chaining.
       */
      public Builder setDevice(
          java.lang.String value) {
        copyOnWrite();
        instance.setDevice(value);
        return this;
      }
      /**
       * <pre>
       * device=
       * </pre>
       *
       * <code>string device = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDevice() {
        copyOnWrite();
        instance.clearDevice();
        return this;
      }
      /**
       * <pre>
       * device=
       * </pre>
       *
       * <code>string device = 1;</code>
       * @param value The bytes for device to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDeviceBytes(value);
        return this;
      }

      /**
       * <pre>
       * platform=
       * </pre>
       *
       * <code>string platform = 2;</code>
       * @return The platform.
       */
      @java.lang.Override
      public java.lang.String getPlatform() {
        return instance.getPlatform();
      }
      /**
       * <pre>
       * platform=
       * </pre>
       *
       * <code>string platform = 2;</code>
       * @return The bytes for platform.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPlatformBytes() {
        return instance.getPlatformBytes();
      }
      /**
       * <pre>
       * platform=
       * </pre>
       *
       * <code>string platform = 2;</code>
       * @param value The platform to set.
       * @return This builder for chaining.
       */
      public Builder setPlatform(
          java.lang.String value) {
        copyOnWrite();
        instance.setPlatform(value);
        return this;
      }
      /**
       * <pre>
       * platform=
       * </pre>
       *
       * <code>string platform = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlatform() {
        copyOnWrite();
        instance.clearPlatform();
        return this;
      }
      /**
       * <pre>
       * platform=
       * </pre>
       *
       * <code>string platform = 2;</code>
       * @param value The bytes for platform to set.
       * @return This builder for chaining.
       */
      public Builder setPlatformBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPlatformBytes(value);
        return this;
      }

      /**
       * <pre>
       * os=
       * </pre>
       *
       * <code>string os = 3;</code>
       * @return The os.
       */
      @java.lang.Override
      public java.lang.String getOs() {
        return instance.getOs();
      }
      /**
       * <pre>
       * os=
       * </pre>
       *
       * <code>string os = 3;</code>
       * @return The bytes for os.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getOsBytes() {
        return instance.getOsBytes();
      }
      /**
       * <pre>
       * os=
       * </pre>
       *
       * <code>string os = 3;</code>
       * @param value The os to set.
       * @return This builder for chaining.
       */
      public Builder setOs(
          java.lang.String value) {
        copyOnWrite();
        instance.setOs(value);
        return this;
      }
      /**
       * <pre>
       * os=
       * </pre>
       *
       * <code>string os = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOs() {
        copyOnWrite();
        instance.clearOs();
        return this;
      }
      /**
       * <pre>
       * os=
       * </pre>
       *
       * <code>string os = 3;</code>
       * @param value The bytes for os to set.
       * @return This builder for chaining.
       */
      public Builder setOsBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setOsBytes(value);
        return this;
      }

      /**
       * <pre>
       * version=
       * </pre>
       *
       * <code>string version = 4;</code>
       * @return The version.
       */
      @java.lang.Override
      public java.lang.String getVersion() {
        return instance.getVersion();
      }
      /**
       * <pre>
       * version=
       * </pre>
       *
       * <code>string version = 4;</code>
       * @return The bytes for version.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getVersionBytes() {
        return instance.getVersionBytes();
      }
      /**
       * <pre>
       * version=
       * </pre>
       *
       * <code>string version = 4;</code>
       * @param value The version to set.
       * @return This builder for chaining.
       */
      public Builder setVersion(
          java.lang.String value) {
        copyOnWrite();
        instance.setVersion(value);
        return this;
      }
      /**
       * <pre>
       * version=
       * </pre>
       *
       * <code>string version = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersion() {
        copyOnWrite();
        instance.clearVersion();
        return this;
      }
      /**
       * <pre>
       * version=
       * </pre>
       *
       * <code>string version = 4;</code>
       * @param value The bytes for version to set.
       * @return This builder for chaining.
       */
      public Builder setVersionBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setVersionBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.Takv)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "device_",
              "platform_",
              "os_",
              "version_",
            };
            java.lang.String info =
                "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
                "\u0003\u0208\u0004\u0208";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.Takv)
    private static final com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv DEFAULT_INSTANCE;
    static {
      Takv defaultInstance = new Takv();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Takv.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.TakvOuterClass.Takv getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Takv> PARSER;

    public static com.google.protobuf.Parser<Takv> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
