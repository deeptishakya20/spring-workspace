package com.capgemini.spring.test;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.config.AppConfig;
import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Test{
	
	public static void main(String args[]){

	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
	renderer.render();
		

	}


}