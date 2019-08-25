package com.hu.hyeurekaclientone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${info.message}")
    private String infoMessage;

    @GetMapping("/hello")
    public String hello(){
        return "hello Spring Cloud,this serverPort is "+serverPort+" and info message :"+infoMessage;
    }
}
