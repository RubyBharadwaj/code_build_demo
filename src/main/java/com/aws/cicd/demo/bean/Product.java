package com.aws.cicd.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class Product {
	
		private int id;
	    private String name;
	    private int quantity;
	    private long price;
	    
}
