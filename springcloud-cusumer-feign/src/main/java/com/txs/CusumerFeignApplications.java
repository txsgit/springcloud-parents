package com.txs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients(basePackages="com.txs.feign")
@EnableFeignClients
public class CusumerFeignApplications {
	public static void main(String[] args) {
		SpringApplication.run(CusumerFeignApplications.class, args);
	}
}
