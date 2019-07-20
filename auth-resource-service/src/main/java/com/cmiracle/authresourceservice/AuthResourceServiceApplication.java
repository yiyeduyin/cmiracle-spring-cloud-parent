package com.cmiracle.authresourceservice;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.cmiracle.authresourceservice"})
@Slf4j
public class AuthResourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthResourceServiceApplication.class, args);
		log.info("AuthResourceServiceApplication 服务启动..");
	}

}
