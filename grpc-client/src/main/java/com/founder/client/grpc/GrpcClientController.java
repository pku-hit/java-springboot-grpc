package com.founder.client.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {
    @Autowired
    private GrpcClientService service;

    @RequestMapping("hello")
    public String sayHello(@RequestParam("name") String name){
        return service.sendMessage(name);
    }
}
