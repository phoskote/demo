package com.udemy.spring.springselenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {
	
	@Bean
	public WebDriver chromeDriver() {
		WebDriverManager.chromedriver().version("83.0.4103.39").setup();
		return new ChromeDriver();
	}
	
	@Bean
	public WebDriverWait webdriverwait(WebDriver driver) {
		return new WebDriverWait(driver, 30);
	}
}
