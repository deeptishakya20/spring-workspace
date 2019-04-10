package com.capgemini.bank.aspects;
import org.springframework.stereotype.*;
import org.apache.log4j.*;
import org.aspectj.lang.annotation.*;


@Component
@Aspect
public class LoggingAspects{
	
	private Logger logger = Logger.getLogger(LoggingAspects.class);
	@After("execution(* com.capgemini.bank.service.impl.BankAccountSerivceIpml.addNewBankAccount(..))")
	public void log(){
	
		logger.info("Account created successfully..");
	}

}