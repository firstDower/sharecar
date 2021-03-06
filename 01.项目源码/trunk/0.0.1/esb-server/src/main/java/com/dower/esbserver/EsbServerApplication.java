package com.dower.esbserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EsbServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsbServerApplication.class, args);
	}

	@RequestMapping("test")
	public String test(){
		return "hello esbServer!";
	}
}
