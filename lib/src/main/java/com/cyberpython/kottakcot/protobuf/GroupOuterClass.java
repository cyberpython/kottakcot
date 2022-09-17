package com.cyberpython.kottakcot.protobuf;

public final class GroupOuterClass {
  private GroupOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface GroupOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.cyberpython.kottakcot.protobuf.Group)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The role.
     */
    java.lang.String getRole();
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The bytes for role.
     */
    com.google.protobuf.ByteString
        getRoleBytes();
  }
  /**
   * <pre>
   * All items are required unless otherwise noted!
   * "required" means if they are missing on send, the conversion
   * to the message format will be rejected and fall back to opaque
   * XML representation
   * </pre>
   *
   * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Group}
   */
  public  static final class Group extends
      com.google.protobuf.GeneratedMessageLite<
          Group, Group.Builder> implements
      // @@protoc_insertion_point(message_implements:com.cyberpython.kottakcot.protobuf.Group)
      GroupOrBuilder {
    private Group() {
      name_ = "";
      role_ = "";
    }
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.String name_;
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     */
    private void setName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      name_ = value;
    }
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    private void clearName() {
      
      name_ = getDefaultInstance().getName();
    }
    /**
     * <pre>
     * name=
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      name_ = value.toStringUtf8();
      
    }

    public static final int ROLE_FIELD_NUMBER = 2;
    private java.lang.String role_;
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The role.
     */
    @java.lang.Override
    public java.lang.String getRole() {
      return role_;
    }
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @return The bytes for role.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRoleBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(role_);
    }
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The role to set.
     */
    private void setRole(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      role_ = value;
    }
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     */
    private void clearRole() {
      
      role_ = getDefaultInstance().getRole();
    }
    /**
     * <pre>
     * role=
     * </pre>
     *
     * <code>string role = 2;</code>
     * @param value The bytes for role to set.
     */
    private void setRoleBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      role_ = value.toStringUtf8();
      
    }

    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group prototype) {
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
     * Protobuf type {@code com.cyberpython.kottakcot.protobuf.Group}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.cyberpython.kottakcot.protobuf.Group)
        com.cyberpython.kottakcot.protobuf.GroupOuterClass.GroupOrBuilder {
      // Construct using com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <pre>
       * name=
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>string role = 2;</code>
       * @return The role.
       */
      @java.lang.Override
      public java.lang.String getRole() {
        return instance.getRole();
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>string role = 2;</code>
       * @return The bytes for role.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getRoleBytes() {
        return instance.getRoleBytes();
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>string role = 2;</code>
       * @param value The role to set.
       * @return This builder for chaining.
       */
      public Builder setRole(
          java.lang.String value) {
        copyOnWrite();
        instance.setRole(value);
        return this;
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>string role = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRole() {
        copyOnWrite();
        instance.clearRole();
        return this;
      }
      /**
       * <pre>
       * role=
       * </pre>
       *
       * <code>string role = 2;</code>
       * @param value The bytes for role to set.
       * @return This builder for chaining.
       */
      public Builder setRoleBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setRoleBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.cyberpython.kottakcot.protobuf.Group)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "name_",
              "role_",
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
          com.google.protobuf.Parser<com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group> parser = PARSER;
          if (parser == null) {
            synchronized (com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group>(
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


    // @@protoc_insertion_point(class_scope:com.cyberpython.kottakcot.protobuf.Group)
    private static final com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group DEFAULT_INSTANCE;
    static {
      Group defaultInstance = new Group();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Group.class, defaultInstance);
    }

    public static com.cyberpython.kottakcot.protobuf.GroupOuterClass.Group getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Group> PARSER;

    public static com.google.protobuf.Parser<Group> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
