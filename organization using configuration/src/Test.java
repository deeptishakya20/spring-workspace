package com.capgemini.spring.test; 
import com.capgemini.spring.organization.*;


import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class Test{
	
	public static void main(String args[]){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Organization org = (Organization)context.getBean("organization");
		

		System.out.println(org);
		
		
	}
} 