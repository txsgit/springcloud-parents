package com.txs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CusumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CusumerApplication.class, args);
	}
		
}
