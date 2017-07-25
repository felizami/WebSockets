package com.anuz.tddspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TddDummybootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(TddDummybootApplication.class, args);
		System.out.println(ctx.getBean("datasource").toString());


	}
}
