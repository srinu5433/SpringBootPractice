package com.srtech.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public  final class JavaCourseMaterial implements ICourseMaterial {
	
	public JavaCourseMaterial() {
	System.out.println("JavaCourseMaterial==> 0 Param Constructor");
	}

	@Override
	public String courseContent() {
		return "1.OOPS 2.Exception Handling 3. Multi Threading 4. Collections";
	}

	@Override
	public int price() {
		return 400;
	}

}
