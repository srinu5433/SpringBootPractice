package com.srtech.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Address {
	
	private String streetName;
	private String city;
	private String state;

}
