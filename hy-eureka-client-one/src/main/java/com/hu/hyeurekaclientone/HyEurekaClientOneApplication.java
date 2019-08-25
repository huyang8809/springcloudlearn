package com.hu.hyeurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HyEurekaClientOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyEurekaClientOneApplication.class, args);
	}

}
