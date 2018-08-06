package com.dower.sharerideadmin;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
@MapperScan({"com.dower.sharerideadmin.core.repository","com.dower.sharerideadmin.core.serverdb.dao","com.dower.sharerideadmin.core.serverdb.extDao"})
public class SharerideAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharerideAdminApplication.class, args);
	}
}
