package com.djn.cn.op.cloud.ucenter.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 开启事务
public class OPCloudUCenterMicroServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OPCloudUCenterMicroServiceApplication.class, args);
	}
}
