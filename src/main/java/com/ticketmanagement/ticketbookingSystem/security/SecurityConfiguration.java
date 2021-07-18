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
		http.authorizeRequests().antMatchers("/user/destinationquery/**").hasAnyRole("ADMIN").and().formLogin().and().csrf().disable();
		http.authorizeRequests().antMatchers("/user/allticket/**").permitAll();
	}
	@Autowired
	public void globalConfiguration(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("USER").password("{noop}SIDDHARTH").roles("USER");
		auth.inMemoryAuthentication().withUser("ADMIN").password("{noop}SIDDHARTH").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH1").password("{noop}PASSWORD").roles("USER");
		auth.inMemoryAuthentication().withUser("SIDDHARTH2").password("{noop}PASSWORD").roles("USER");
		auth.inMemoryAuthentication().withUser("SIDDHARTH3").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH4").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH5").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH16").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH17").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH18").password("{noop}PASSWORD").roles("USER","ADMIN");
		
		
		auth.inMemoryAuthentication().withUser("SIDDHARTH6").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH7").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH8").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH9").password("{noop}PASSWORD").roles("USER","ADMIN");
		auth.inMemoryAuthentication().withUser("SIDDHARTH10").password("{noop}PASSWORD").roles("USER","ADMIN");
	
		
	}

}
