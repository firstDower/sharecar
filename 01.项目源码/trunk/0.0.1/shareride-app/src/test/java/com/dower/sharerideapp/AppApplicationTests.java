package com.dower.sharerideapp;

import com.dower.sharerideapp.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AppApplicationTests {
	@Autowired
	RedisTemplate redisTemplate;

	@Autowired
	RedisService redisService;

	@Test
	public void contextLoads() {
		Boolean test01 = redisTemplate.hasKey("test01");
		log.info("======test01========="+test01);
		redisTemplate.opsForValue().set("name","李月芳");
		Boolean name1 = redisTemplate.hasKey("name");
		log.info("======name1========="+name1);
		String name = redisTemplate.opsForValue().get("name").toString();
		log.info("======name========="+name);
	}

	@Test
	public void testRedis01(){

	}

}
