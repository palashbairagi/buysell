package com.exchange.buysell;

import javafx.application.Application;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BuysellApplication {
	//private static final Logger log = (Logger) LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(BuysellApplication.class, args);

		System.out.println("Hello World");
	}

}
