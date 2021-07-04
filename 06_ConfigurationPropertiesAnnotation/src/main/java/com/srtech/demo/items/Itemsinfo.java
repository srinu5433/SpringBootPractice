package com.srtech.demo.items;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@PropertySource("info.properties")
@Component
@ConfigurationProperties(prefix = "data")
public class Itemsinfo {
	
	//@Value("${data.idlyPrice}")
	private float idlyPrice;
	@Value("${data.dosaPrice2}")
	private float dosaPrice;
	//@Value("${data.pohaPrice}")
	private float pohaPrice;

}
