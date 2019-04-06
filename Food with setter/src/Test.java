package com.capgemini.spring.food.test; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.food.type.*;



public class Test{
	
	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		FoodRenderer renderer = (FoodRenderer)context.getBean("nonVeg");
		renderer.render();
		
	}
} 