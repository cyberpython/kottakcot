package com.cyberpython.kottakcot.protobuf;

public final class ContactOuterClass {
  private ContactOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ContactOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.Contact)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @return The endpoint.
     */
    java.lang.String getEndpoint();
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @return The bytes for endpoint.
     */
    com.google.protobuf.ByteString
        getEndpointBytes();

    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @return The callsign.
     */
    java.lang.String getCallsign();
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @return The bytes for callsign.
     */
    com.google.protobuf.ByteString
        getCallsignBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Contact}
   */
  public  static final class Contact extends
      com.google.protobuf.GeneratedMessageLite<
          Contact, Contact.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.Contact)
      ContactOrBuilder {
    private Contact() {
      endpoint_ = "";
      callsign_ = "";
    }
    public static final int ENDPOINT_FIELD_NUMBER = 1;
    private java.lang.String endpoint_;
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @return The endpoint.
     */
    @java.lang.Override
    public java.lang.String getEndpoint() {
      return endpoint_;
    }
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @return The bytes for endpoint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEndpointBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(endpoint_);
    }
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @param value The endpoint to set.
     */
    private void setEndpoint(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      endpoint_ = value;
    }
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     */
    private void clearEndpoint() {
      
      endpoint_ = getDefaultInstance().getEndpoint();
    }
    /**
     * <pre>
     * Endpoint is optional; if missing/empty do not populate.
     * </pre>
     *
     * <code>string endpoint = 1;</code>
     * @param value The bytes for endpoint to set.
     */
    private void setEndpointBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      endpoint_ = value.toStringUtf8();
      
    }

    public static final int CALLSIGN_FIELD_NUMBER = 2;
    private java.lang.String callsign_;
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @return The callsign.
     */
    @java.lang.Override
    public java.lang.String getCallsign() {
      return callsign_;
    }
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @return The bytes for callsign.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCallsignBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(callsign_);
    }
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @param value The callsign to set.
     */
    private void setCallsign(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      callsign_ = value;
    }
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     */
    private void clearCallsign() {
      
      callsign_ = getDefaultInstance().getCallsign();
    }
    /**
     * <pre>
     * callsign=
     * </pre>
     *
     * <code>string callsign = 2;</code>
     * @param value The bytes for callsign to set.
     */
    private void setCallsignBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      callsign_ = value.toStringUtf8();
      
    }

    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact prototype) {
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
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Contact}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.Contact)
        com.cyberpython.kottakcot.protobuf.ContactOuterClass.ContactOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Endpoint is optional; if missing/empty do not populate.
       * </pre>
       *
       * <code>string endpoint = 1;</code>
       * @return The endpoint.
       */
      @java.lang.Override
      public java.lang.String getEndpoint() {
        return instance.getEndpoint();
      }
      /**
       * <pre>
       * Endpoint is optional; if missing/empty do not populate.
       * </pre>
       *
       * <code>string endpoint = 1;</code>
       * @return The bytes for endpoint.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getEndpointBytes() {
        return instance.getEndpointBytes();
      }
      /**
       * <pre>
       * Endpoint is optional; if missing/empty do not populate.
       * </pre>
       *
       * <code>string endpoint = 1;</code>
       * @param value The endpoint to set.
       * @return This builder for chaining.
       */
      public Builder setEndpoint(
          java.lang.String value) {
        copyOnWrite();
        instance.setEndpoint(value);
        return this;
      }
      /**
       * <pre>
       * Endpoint is optional; if missing/empty do not populate.
       * </pre>
       *
       * <code>string endpoint = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndpoint() {
        copyOnWrite();
        instance.clearEndpoint();
        return this;
      }
      /**
       * <pre>
       * Endpoint is optional; if missing/empty do not populate.
       * </pre>
       *
       * <code>string endpoint = 1;</code>
       * @param value The bytes for endpoint to set.
       * @return This builder for chaining.
       */
      public Builder setEndpointBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setEndpointBytes(value);
        return this;
      }

      /**
       * <pre>
       * callsign=
       * </pre>
       *
       * <code>string callsign = 2;</code>
       * @return The callsign.
       */
      @java.lang.Override
      public java.lang.String getCallsign() {
        return instance.getCallsign();
      }
      /**
       * <pre>
       * callsign=
       * </pre>
       *
       * <code>string callsign = 2;</code>
       * @return The bytes for callsign.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getCallsignBytes() {
        return instance.getCallsignBytes();
      }
      /**
       * <pre>
       * callsign=
       * </pre>
       *
       * <code>string callsign = 2;</code>
       * @param value The callsign to set.
       * @return This builder for chaining.
       */
      public Builder setCallsign(
          java.lang.String value) {
        copyOnWrite();
        instance.setCallsign(value);
        return this;
      }
      /**
       * <pre>
       * callsign=
       * </pre>
       *
       * <code>string callsign = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCallsign() {
        copyOnWrite();
        instance.clearCallsign();
        return this;
      }
      /**
       * <pre>
       * callsign=
       * </pre>
       *
       * <code>string callsign = 2;</code>
       * @param value The bytes for callsign to set.
       * @return This builder for chaining.
       */
      public Builder setCallsignBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setCallsignBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.Contact)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "endpoint_",
              "callsign_",
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
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.Contact)
    private static final com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact DEFAULT_INSTANCE;
    static {
      Contact defaultInstance = new Contact();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Contact.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.ContactOuterClass.Contact getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Contact> PARSER;

    public static com.google.protobuf.Parser<Contact> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
