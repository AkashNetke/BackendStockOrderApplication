package com.symbiosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.repository","com.service","com.controller","com.symbiosis"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages = "com.repository")
public class TradeDetailsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradeDetailsProjectApplication.class, args);
	}

}
