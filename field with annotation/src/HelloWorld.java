package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;

//@Component
public class HelloWorld implements MessageProvider{

	public String getMessage(){

		return "Hello World";		

	}

}