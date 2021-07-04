package com.srtech.components;

import org.springframework.stereotype.Component;

@Component("dotNet")
public final class DotNetCourseMaterial implements ICourseMaterial {
	
	public DotNetCourseMaterial() {
	System.out.println("DotNetCourseMaterial==> 0 Param Constructor");
	}

	@Override
	public String courseContent() {
		return "1.DotNet Basics";
	}

	@Override
	public int price() {
		return 300;
	}

}
