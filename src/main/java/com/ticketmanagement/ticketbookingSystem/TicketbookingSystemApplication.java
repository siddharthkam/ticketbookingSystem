package com.ticketmanagement.ticketbookingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ticketmanagement")
@EnableEurekaClient
public class TicketbookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketbookingSystemApplication.class, args);
		
		
	}

}
