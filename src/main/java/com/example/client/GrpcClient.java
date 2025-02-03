package com.example.client;

import com.example.grpc.GreetRequest;
import com.example.grpc.GreetResponse;
import com.example.grpc.GreetingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

        GreetRequest request = GreetRequest.newBuilder().setName("User").build();
        GreetResponse response = stub.greet(request);

        System.out.println("Response: " + response.getMessage());

        channel.shutdown();
    }
}
