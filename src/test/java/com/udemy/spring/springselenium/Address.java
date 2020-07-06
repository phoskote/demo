package com.udemy.spring.springselenium;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	
	public Address() {
		this.street = "Baker Street";
	}
	
	public String getStreet() {
		return street;
	}

}
