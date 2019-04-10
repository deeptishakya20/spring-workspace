package com.capgemini.spring.main;
import com.capgemini.spring.calculator.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

	public static void main(String args[]){
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	Calculator calculator = (Calculator)context.getBean("calculator");
	calculator.add(12,18);
	calculator.division(100.0,10.0);
	
			
	}

}