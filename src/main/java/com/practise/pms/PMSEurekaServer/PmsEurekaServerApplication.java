package com.practise.pms.PMSEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//Aactivate Eureka Server related configuration EurekaServerAutoConfiguration
@EnableEurekaServer  
public class PmsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsEurekaServerApplication.class, args);
	}

}
