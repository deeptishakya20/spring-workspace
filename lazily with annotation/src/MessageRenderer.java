package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;

//Lazy
@Component
public class MessageRenderer{

	private MessageProvider provider;
	{

		System.out.println("Object created");		

	}

	
	@Autowired
	@Qualifier("gm")
	public void setMessageProvider(MessageProvider provider){
		this.provider = provider; 
	
	}

	public void render(){
		System.out.println(provider.getMessage());
	}
	


}