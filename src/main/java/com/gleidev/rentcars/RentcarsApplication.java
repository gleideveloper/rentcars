package com.gleidev.rentcars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class RentcarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentcarsApplication.class, args);
	}

}
