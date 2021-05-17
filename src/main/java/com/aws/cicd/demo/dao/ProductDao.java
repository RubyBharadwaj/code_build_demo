package com.aws.cicd.demo.dao;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.aws.cicd.demo.bean.Product;

@Repository
public class ProductDao {
	
	 public List<Product> getProducts() {
		 return Stream.of(
	                new Product(101, "Mobile", 1, 30000),
	                new Product(58, "Book", 4, 2000),
	                new Product(205, "Laptop", 1, 150000),
	                new Product(809, "headset", 1, 1799))
	                .collect(Collectors.toList());
	       
	    }

}
