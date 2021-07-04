package com.srtech.components;

import org.springframework.stereotype.Component;

@Component("UI")
public final class UICourseMaterial implements ICourseMaterial {
	
	public UICourseMaterial() {
	System.out.println("UICourseMaterial==> 0 Param Constructor");
	}

	@Override
	public String courseContent() {
		return "1.HTML 2.CSS 3. JS 4. BootStarp";
	}

	@Override
	public int price() {
		return 350;
	}

}
