package com.capgemini.spring.config;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Lazy
@Configuration
public class AppConfig{

	@Bean
	public MessageProvider getMessageProvider(){
		
		return new GoodMorning();

	}


	@Bean
	public MessageRenderer renderer(){
		MessageRenderer  renderer = new MessageRenderer(getMessageProvider());
		return renderer;

	}

}