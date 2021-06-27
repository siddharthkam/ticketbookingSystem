package com.ticketmanagement.ticketbookingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan("com.ticketmanagement")
public class TicketbookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketbookingSystemApplication.class, args);
	}

}
