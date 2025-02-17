package com.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new GreetingServiceImpl())
                .build();

        System.out.println("Starting gRPC server on port 9090...");
        server.start();
        server.awaitTermination();
    }
}
