package com.hu.hyeurekaclientribbon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("hy-eureka-client-one")
public interface FeignClientDemo {
    @GetMapping("/hello")
    String hello();
}
