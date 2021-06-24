package com.laptrinhjavaweb.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

	// model mapper
	@Bean(name="mapper")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
