package com.srtech.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Student {

	@Autowired
	@Qualifier("myCourse")
	ICourseMaterial courseMaterial;

	public String preparation(String examName) {
		System.out.println("Exam Preparation Started");
		String content = courseMaterial.courseContent();
		int price = courseMaterial.price();
		return "Course content is " + content + " with price " + price;
	}

}
