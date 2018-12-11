package com.qa.springbootonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class OnlineSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSpringBootApplication.class, args);
	}
}
