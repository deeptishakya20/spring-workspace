package com.capgemini.spring.config;
import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages ="com.capgemini.spring.renderer")
public class AppConfig{

	@Bean
	public MessageProvider getMessageProvider(){
		
		return new GoodMorning();

	}


	@Bean
	public MessageRenderer renderer(){
		MessageRenderer  renderer = new MessageRenderer();
		renderer.setMessageProvider(getMessageProvider());
		return renderer;

	}

}