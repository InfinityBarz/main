package com.crptapi.crptapibackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrptapibackendApplication {
	private static final Logger logger = LoggerFactory.getLogger(CrptapibackendApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CrptapibackendApplication.class, args);
	}

}
