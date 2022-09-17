package com.cyberpython.kottakcot.protobuf;

public final class Takmessage {
  private Takmessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TakMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.TakMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     * @return Whether the takControl field is set.
     */
    boolean hasTakControl();
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     * @return The takControl.
     */
    com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl getTakControl();

    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     * @return Whether the cotEvent field is set.
     */
    boolean hasCotEvent();
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     * @return The cotEvent.
     */
    com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent getCotEvent();
  }
  /**
   * <pre>
   * Top level message sent for TAK Messaging Protocol Version 1.
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.TakMessage}
   */
  public  static final class TakMessage extends
      com.google.protobuf.GeneratedMessageLite<
          TakMessage, TakMessage.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.TakMessage)
      TakMessageOrBuilder {
    private TakMessage() {
    }
    public static final int TAKCONTROL_FIELD_NUMBER = 1;
    private com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl takControl_;
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     */
    @java.lang.Override
    public boolean hasTakControl() {
      return takControl_ != null;
    }
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl getTakControl() {
      return takControl_ == null ? com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.getDefaultInstance() : takControl_;
    }
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     */
    private void setTakControl(com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl value) {
      value.getClass();
  takControl_ = value;
      
      }
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeTakControl(com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl value) {
      value.getClass();
  if (takControl_ != null &&
          takControl_ != com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.getDefaultInstance()) {
        takControl_ =
          com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.newBuilder(takControl_).mergeFrom(value).buildPartial();
      } else {
        takControl_ = value;
      }
      
    }
    /**
     * <pre>
     * Optional - if omitted, continue using last reported control
     * information
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
     */
    private void clearTakControl() {  takControl_ = null;
      
    }

    public static final int COTEVENT_FIELD_NUMBER = 2;
    private com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent cotEvent_;
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     */
    @java.lang.Override
    public boolean hasCotEvent() {
      return cotEvent_ != null;
    }
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     */
    @java.lang.Override
    public com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent getCotEvent() {
      return cotEvent_ == null ? com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.getDefaultInstance() : cotEvent_;
    }
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     */
    private void setCotEvent(com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent value) {
      value.getClass();
  cotEvent_ = value;
      
      }
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeCotEvent(com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent value) {
      value.getClass();
  if (cotEvent_ != null &&
          cotEvent_ != com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.getDefaultInstance()) {
        cotEvent_ =
          com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.newBuilder(cotEvent_).mergeFrom(value).buildPartial();
      } else {
        cotEvent_ = value;
      }
      
    }
    /**
     * <pre>
     * Optional - if omitted, no event data in this message
     * </pre>
     *
     * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
     */
    private void clearCotEvent() {  cotEvent_ = null;
      
    }

    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Top level message sent for TAK Messaging Protocol Version 1.
     * </pre>
     *
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.TakMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.TakMessage)
        com.cyberpython.kottakcot.protobuf.Takmessage.TakMessageOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      @java.lang.Override
      public boolean hasTakControl() {
        return instance.hasTakControl();
      }
      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl getTakControl() {
        return instance.getTakControl();
      }
      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      public Builder setTakControl(com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl value) {
        copyOnWrite();
        instance.setTakControl(value);
        return this;
        }
      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      public Builder setTakControl(
          com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl.Builder builderForValue) {
        copyOnWrite();
        instance.setTakControl(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      public Builder mergeTakControl(com.cyberpython.kottakcot.protobuf.Takcontrol.TakControl value) {
        copyOnWrite();
        instance.mergeTakControl(value);
        return this;
      }
      /**
       * <pre>
       * Optional - if omitted, continue using last reported control
       * information
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.TakControl takControl = 1;</code>
       */
      public Builder clearTakControl() {  copyOnWrite();
        instance.clearTakControl();
        return this;
      }

      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      @java.lang.Override
      public boolean hasCotEvent() {
        return instance.hasCotEvent();
      }
      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      @java.lang.Override
      public com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent getCotEvent() {
        return instance.getCotEvent();
      }
      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      public Builder setCotEvent(com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent value) {
        copyOnWrite();
        instance.setCotEvent(value);
        return this;
        }
      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      public Builder setCotEvent(
          com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent.Builder builderForValue) {
        copyOnWrite();
        instance.setCotEvent(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      public Builder mergeCotEvent(com.cyberpython.kottakcot.protobuf.Cotevent.CotEvent value) {
        copyOnWrite();
        instance.mergeCotEvent(value);
        return this;
      }
      /**
       * <pre>
       * Optional - if omitted, no event data in this message
       * </pre>
       *
       * <code>.com.cyberpython.kottakcot.protobuf.CotEvent cotEvent = 2;</code>
       */
      public Builder clearCotEvent() {  copyOnWrite();
        instance.clearCotEvent();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.TakMessage)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "takControl_",
              "cotEvent_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.TakMessage)
    private static final com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage DEFAULT_INSTANCE;
    static {
      TakMessage defaultInstance = new TakMessage();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        TakMessage.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.Takmessage.TakMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TakMessage> PARSER;

    public static com.google.protobuf.Parser<TakMessage> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
