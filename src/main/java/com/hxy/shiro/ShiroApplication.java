package com.hxy.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShiroApplication {
	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ShiroApplication.class);
	public static void main(String[] args) {
		logger.debug("程序开始");
		SpringApplication.run(ShiroApplication.class, args);
	}

}
