package com.gbabler.msusers.service.client;

import com.gbabler.msusers.grpc.Weather;
import com.gbabler.msusers.grpc.WeatherRequest;
import com.gbabler.msusers.grpc.WeatherResponse;
import com.gbabler.msusers.grpc.WeatherServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ApplicationClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
 
        WeatherServiceGrpc.WeatherServiceBlockingStub weatherServiceBlockingStub
                = WeatherServiceGrpc.newBlockingStub(managedChannel);
 
        WeatherRequest weatherRequest = WeatherRequest.newBuilder()
                .setCity("Campinas")
                .build();
 
        WeatherResponse weatherResponse = weatherServiceBlockingStub.getWeather(weatherRequest);
 
        System.out.println("Received response: " + weatherResponse.getState());

        managedChannel.shutdown();
    }
}