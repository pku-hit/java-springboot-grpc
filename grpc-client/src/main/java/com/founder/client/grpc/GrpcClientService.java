package com.founder.client.grpc;

import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {

    @GrpcClient("cloud-grpc-server")
    private GreeterGrpc.GreeterBlockingStub stub;

    public String sendMessage(String name) {
        HelloReply reply = stub.sayHello(HelloRequest.newBuilder().setName(name).build());
        return reply.getMessage();
    }
}
