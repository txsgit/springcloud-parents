package com.txs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@MapperScan(basePackages = {"com.txs.dao"})
@EnableEurekaClient //启动自动注册eureka服务
public class Provider2Application {
	public static void main(String[] args) {
		SpringApplication.run(Provider2Application.class, args);
	}
}
