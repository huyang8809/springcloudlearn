package com.hu.hyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyEurekaServerApplication.class, args);
	}

}
