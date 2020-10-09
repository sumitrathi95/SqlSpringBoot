package com.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mysql.*")
@EntityScan("com.mysql.*")
public class MysqlApplication {

	public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
        System.out.println("hi");
	}
}
