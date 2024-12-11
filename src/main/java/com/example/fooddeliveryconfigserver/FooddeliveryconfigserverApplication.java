package com.example.fooddeliveryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FooddeliveryconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooddeliveryconfigserverApplication.class, args);
	}

}
