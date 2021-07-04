package com.srtech.demo.items;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@PropertySource("info.properties")
@Component
public class Itemsinfo {
	
	@Value("${data.idlyPrice}")
	private float idlyPrice;
	@Value("${data.dosaPrice}")
	private float dosaPrice;
	@Value("${data.pohaPrice}")
	private float pohaPrice;

}
