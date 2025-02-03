package com.example.server;

import com.example.grpc.GreetRequest;
import com.example.grpc.GreetResponse;
import com.example.grpc.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        String greeting = "Hello, " + request.getName();
        GreetResponse response = GreetResponse.newBuilder().setMessage(greeting).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
