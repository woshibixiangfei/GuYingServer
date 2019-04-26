package cn.teacherbe.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "cn.teacherbe")
@MapperScan(basePackages = "cn.teacherbe.dao")
public class ControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}

}
