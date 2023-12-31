package com.ereukaServer.MicroServices_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesEurekaServerApplication.class, args);
	}

}
