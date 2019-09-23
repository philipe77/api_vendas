package com.philipe.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.philipe.cursomc.services.DBService;
import com.philipe.cursomc.services.EmailService;
import com.philipe.cursomc.services.SMTPEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService dbService;
	
	@Value("$(spring.jpa.hibernate.ddl-auto)")
	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		System.out.println(strategy);
//		if(!("create").equals(strategy) ) {
//			return false;
//		}
		dbService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService(){
		return new SMTPEmailService();
	}
	
}
