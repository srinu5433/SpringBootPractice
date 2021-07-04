package com.srtech.demo.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "student.data")
public class Student {
	
	private int id;
	private String name;
	private List<String> frnds;
	private Set<String> phoneNums;
	private String collegeName;
	private Map<String,Float> marks;
	private Address address;

}
