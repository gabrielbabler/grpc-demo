// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Weather.proto

package com.gbabler.msusers.grpc;

public final class Weather {
  private Weather() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeatherResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeatherResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rWeather.proto\"\036\n\016WeatherRequest\022\014\n\004cit" +
      "y\030\001 \001(\t\" \n\017WeatherResponse\022\r\n\005state\030\001 \001(" +
      "\t2C\n\016WeatherService\0221\n\nGetWeather\022\017.Weat" +
      "herRequest\032\020.WeatherResponse\"\000B\034\n\030com.gb" +
      "abler.msusers.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeatherRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeatherRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherRequest_descriptor,
        new String[] { "City", });
    internal_static_WeatherResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WeatherResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeatherResponse_descriptor,
        new String[] { "State", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
