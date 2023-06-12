package com.microdept.MicroService_DepartmentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceDepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceDepartmentServiceApplication.class, args);
	}
	

}
