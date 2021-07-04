package com.srtech.components;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
public final class Student {

	@Inject
	@Resource(name="myCourse")
	//@Qualifier("myCourse")
	ICourseMaterial courseMaterial;

	public String preparation(String examName) {
		System.out.println("Exam Preparation Started");
		String content = courseMaterial.courseContent();
		int price = courseMaterial.price();
		return "Course content is " + content + " with price " + price;
	}

}
