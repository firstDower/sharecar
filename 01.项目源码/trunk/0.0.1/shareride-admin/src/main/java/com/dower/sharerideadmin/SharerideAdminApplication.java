package com.dower.sharerideadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.dower.sharerideadmin.core.repository","com.dower.sharerideadmin.core.serverdb.dao"})
public class SharerideAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharerideAdminApplication.class, args);
	}
}
