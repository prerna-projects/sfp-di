package com.spring.sfpdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("jdbc")
@ConstructorBinding
public class SfpConstructorConfig {
		
	private final String username;
	private final String password;
	private final String jdbcurl;
	
	public SfpConstructorConfig(String username, String password, String jdbcurl) {
		super();
		System.out.println("Creating constructor Config bean");
		this.username = username;
		this.password = password;
		this.jdbcurl = jdbcurl;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}
	
}
