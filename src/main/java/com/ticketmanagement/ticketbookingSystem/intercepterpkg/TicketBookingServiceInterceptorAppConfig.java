package com.ticketmanagement.ticketbookingSystem.intercepterpkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class TicketBookingServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {

	@Autowired
	TicketBookingServiceInterceptor ticketbookingserviceinterceptor;
	
	  @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(ticketbookingserviceinterceptor);
	   }
	
}
