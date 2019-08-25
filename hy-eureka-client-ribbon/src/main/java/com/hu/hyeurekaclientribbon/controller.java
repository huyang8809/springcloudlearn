package com.hu.hyeurekaclientribbon;

import com.hu.hyeurekaclientribbon.feign.FeignClientDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignClientDemo feignClientDemo;


    @GetMapping("/hi")
    public String hi(){
        return restTemplate.getForObject("http://hy-eureka-client-one/hello",String.class);
    }

    @GetMapping("/hello")
    public String hello(){
        return feignClientDemo.hello();
    }
}
