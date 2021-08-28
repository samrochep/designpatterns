package com.sam.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.sam.design_patterns.templatemethod.ConnectionTemplate;
import com.sam.design_patterns.templatemethod.MySqlTemplate;
import com.sam.design_patterns.templatemethod.OracleSqlTemplate;

@SpringBootApplication
@EnableCaching
public class ApplicationConfig {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}
	
	@Bean
	public ConnectionTemplate getConnectionTemplate() {
		ConnectionTemplate connectionTemplate = new OracleSqlTemplate();
		return connectionTemplate;
	}

}
