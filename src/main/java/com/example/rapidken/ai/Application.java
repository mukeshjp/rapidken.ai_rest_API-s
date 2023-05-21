package com.example.rapidken.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.rapidken.ai.controller")
@EntityScan(basePackages = "com.rapidken.entity")
@EnableJpaRepositories(basePackages = "com.rapidken.ai.employee.repository")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
