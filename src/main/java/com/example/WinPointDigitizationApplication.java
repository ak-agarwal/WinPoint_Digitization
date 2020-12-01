package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.model", "com.example.repository"} )
public class WinPointDigitizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(WinPointDigitizationApplication.class, args);
	}

}
