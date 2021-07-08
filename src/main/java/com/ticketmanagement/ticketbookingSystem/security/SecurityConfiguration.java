package com.ticketmanagement.ticketbookingSystem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configurable
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/user/ticket/**").hasAnyRole("USER").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/ticketbyfare/**").hasAnyRole("USER").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/ticketbydestination**").hasAnyRole("USER").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/ticketbydestination**").hasAnyRole("USER").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/allticket/**").hasAnyRole("ADMIN").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/ticketbydestination**").hasAnyRole("ADMIN").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/ticketbyid/**").hasAnyRole("ADMIN").and().formLogin().and().csrf().disable();
	
	
	}
	
	
	@Autowired
	public void globalConfiguration(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("USER").password("{noop}SIDDHARTH").roles("USER");
		auth.inMemoryAuthentication().withUser("ADMIN").password("{noop}SIDDHARTH").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH1").password("{noop}PASSWORD").roles("USER");
		auth.inMemoryAuthentication().withUser("SIDDHARTH2").password("{noop}PASSWORD").roles("USER");
		
	}

}
