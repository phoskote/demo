package com.udemy.spring.springselenium;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public List<String> getList() {
		return Arrays.asList("a", "b", "c");
	}
}
