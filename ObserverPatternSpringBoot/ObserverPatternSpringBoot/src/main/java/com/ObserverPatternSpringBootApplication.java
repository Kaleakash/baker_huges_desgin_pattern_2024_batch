package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class ObserverPatternSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverPatternSpringBootApplication.class, args);
		System.out.println("spring boot up!");
	}

}
