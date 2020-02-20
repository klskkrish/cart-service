package com.barter.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.barter.cart.controller","com.barter.cart.service","com.barter.cart.service.impl"})
@EntityScan("com.barter.cart.entity")
@EnableJpaRepositories({"com.barter.cart.repository","com.barter.cart.repository.dao","com.barter.cart.repository.dao.impl"})
@EnableEurekaClient
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}
}
