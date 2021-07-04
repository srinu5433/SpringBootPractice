package com.srtech.components;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDateTime localDate;
	
	public String wish(String name)
	{
		int hour = localDate.getHour();
		if(hour<12)
			return "Hello Good Morning "+name;
		else if(hour  <16)
			return "Hello Good Afternoon "+name;
		else if(hour  <20)
			return "Hello Good Evening "+name;
		else
		return "Hello Good Ni8 "+name;
	}
}
