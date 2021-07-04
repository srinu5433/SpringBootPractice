package com.srtech.demo.items;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BillGenerator {
	
	@Value("#{itemsinfo.idlyPrice + itemsinfo.dosaPrice + itemsinfo.pohaPrice}")
	private float total;
	@Value("${data.hotelName}")
	private String hotelName;
	

}
