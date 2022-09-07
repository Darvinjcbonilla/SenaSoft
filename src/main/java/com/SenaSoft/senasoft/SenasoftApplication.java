package com.SenaSoft.senasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SenasoftApplication {

	public static void main(String[] args) {SpringApplication.run(SenasoftApplication.class, args);
	}

}
