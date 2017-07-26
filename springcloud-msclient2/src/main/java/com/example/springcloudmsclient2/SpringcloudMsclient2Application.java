package com.example.springcloudmsclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudMsclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudMsclient2Application.class, args);
	}
}
