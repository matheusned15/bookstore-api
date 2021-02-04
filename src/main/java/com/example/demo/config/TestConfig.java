package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService DbService;

	@Bean
	public void instanciaBaseDeDados() {
		this.DbService.instanciaBaseDeDados();

	}

}
