package com.capgemini.spring.provider;
import org.springframework.stereotype.Component;


@Component("hm")
public class HWMessageProvider implements MessageProvider{
	
	
	public String getMessage(){
	
		return "Hello World";

	}

}