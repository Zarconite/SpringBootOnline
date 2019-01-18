package com.qa.springbootblockbuster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootBlockbusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlockbusterApplication.class, args);
	}
}
