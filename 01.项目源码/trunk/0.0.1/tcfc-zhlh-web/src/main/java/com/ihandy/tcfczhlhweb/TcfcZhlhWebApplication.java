package com.ihandy.tcfczhlhweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class TcfcZhlhWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcfcZhlhWebApplication.class, args);
	}
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
