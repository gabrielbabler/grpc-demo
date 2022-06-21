package com.gbabler.msusers.service;

import org.lognet.springboot.grpc.GRpcService;

import com.gbabler.msusers.grpc.Weather;
import com.gbabler.msusers.grpc.WeatherRequest;
import com.gbabler.msusers.grpc.WeatherResponse;
import com.gbabler.msusers.grpc.WeatherServiceGrpc;

import io.grpc.stub.StreamObserver;

@GRpcService
public class UserService extends WeatherServiceGrpc.WeatherServiceImplBase {

    @Override
    public void getWeather(WeatherRequest request, StreamObserver<WeatherResponse> responseObserver) {
        WeatherResponse response = WeatherResponse.newBuilder()
                        .setState("Sao Paulo")
                        .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}