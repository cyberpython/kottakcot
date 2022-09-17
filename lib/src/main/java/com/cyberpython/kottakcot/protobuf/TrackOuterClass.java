package com.cyberpython.kottakcot.protobuf;

public final class TrackOuterClass {
  private TrackOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TrackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.Track)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * speed=
     * </pre>
     *
     * <code>double speed = 1;</code>
     * @return The speed.
     */
    double getSpeed();

    /**
     * <pre>
     * course=
     * </pre>
     *
     * <code>double course = 2;</code>
     * @return The course.
     */
    double getCourse();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Track}
   */
  public  static final class Track extends
      com.google.protobuf.GeneratedMessageLite<
          Track, Track.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.Track)
      TrackOrBuilder {
    private Track() {
    }
    public static final int SPEED_FIELD_NUMBER = 1;
    private double speed_;
    /**
     * <pre>
     * speed=
     * </pre>
     *
     * <code>double speed = 1;</code>
     * @return The speed.
     */
    @java.lang.Override
    public double getSpeed() {
      return speed_;
    }
    /**
     * <pre>
     * speed=
     * </pre>
     *
     * <code>double speed = 1;</code>
     * @param value The speed to set.
     */
    private void setSpeed(double value) {
      
      speed_ = value;
    }
    /**
     * <pre>
     * speed=
     * </pre>
     *
     * <code>double speed = 1;</code>
     */
    private void clearSpeed() {
      
      speed_ = 0D;
    }

    public static final int COURSE_FIELD_NUMBER = 2;
    private double course_;
    /**
     * <pre>
     * course=
     * </pre>
     *
     * <code>double course = 2;</code>
     * @return The course.
     */
    @java.lang.Override
    public double getCourse() {
      return course_;
    }
    /**
     * <pre>
     * course=
     * </pre>
     *
     * <code>double course = 2;</code>
     * @param value The course to set.
     */
    private void setCourse(double value) {
      
      course_ = value;
    }
    /**
     * <pre>
     * course=
     * </pre>
     *
     * <code>double course = 2;</code>
     */
    private void clearCourse() {
      
      course_ = 0D;
    }

    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track prototype) {
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
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Track}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.Track)
        com.cyberpython.kottakcot.protobuf.TrackOuterClass.TrackOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * speed=
       * </pre>
       *
       * <code>double speed = 1;</code>
       * @return The speed.
       */
      @java.lang.Override
      public double getSpeed() {
        return instance.getSpeed();
      }
      /**
       * <pre>
       * speed=
       * </pre>
       *
       * <code>double speed = 1;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(double value) {
        copyOnWrite();
        instance.setSpeed(value);
        return this;
      }
      /**
       * <pre>
       * speed=
       * </pre>
       *
       * <code>double speed = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        copyOnWrite();
        instance.clearSpeed();
        return this;
      }

      /**
       * <pre>
       * course=
       * </pre>
       *
       * <code>double course = 2;</code>
       * @return The course.
       */
      @java.lang.Override
      public double getCourse() {
        return instance.getCourse();
      }
      /**
       * <pre>
       * course=
       * </pre>
       *
       * <code>double course = 2;</code>
       * @param value The course to set.
       * @return This builder for chaining.
       */
      public Builder setCourse(double value) {
        copyOnWrite();
        instance.setCourse(value);
        return this;
      }
      /**
       * <pre>
       * course=
       * </pre>
       *
       * <code>double course = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCourse() {
        copyOnWrite();
        instance.clearCourse();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.Track)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "speed_",
              "course_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.Track)
    private static final com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track DEFAULT_INSTANCE;
    static {
      Track defaultInstance = new Track();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Track.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.TrackOuterClass.Track getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Track> PARSER;

    public static com.google.protobuf.Parser<Track> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
