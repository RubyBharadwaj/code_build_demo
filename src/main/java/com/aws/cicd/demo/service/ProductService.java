package com.aws.cicd.demo.service;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.cicd.demo.bean.Product;
import com.aws.cicd.demo.dao.ProductDao;

@RestController
@RequestMapping("/product")
public class ProductService {

	  @Autowired
	    private ProductDao productDao;

	    @GetMapping
	    public List<Product> fetchOrders() {
	        return productDao.getProducts().stream().
	                sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(ProductService.class, args);
	    }
}
