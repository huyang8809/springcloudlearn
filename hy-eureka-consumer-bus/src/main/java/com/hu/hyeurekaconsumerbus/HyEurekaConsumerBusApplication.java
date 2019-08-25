package com.hu.hyeurekaconsumerbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
public class HyEurekaConsumerBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyEurekaConsumerBusApplication.class, args);
	}

}
