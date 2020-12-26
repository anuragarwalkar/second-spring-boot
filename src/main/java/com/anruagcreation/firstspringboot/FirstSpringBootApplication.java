package com.anruagcreation.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = 
		// new BinarySearchImpl(new BubbleSortAlorithm());
		
		ApplicationContext applicationContext = SpringApplication.run(FirstSpringBootApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[]{12, 4}, 2);

		System.out.println(result);
	}

}
