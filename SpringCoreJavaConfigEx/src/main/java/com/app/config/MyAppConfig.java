package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.DriverManager;

@Configuration
public class MyAppConfig {
	@Bean
	public DriverManager conObj() {
		DriverManager dm = new DriverManager();
		dm.setDriverClass("Orcale");
		dm.setUrl("JDBC:ORACLE");
		return dm;
	}

}
