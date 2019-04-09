package com.capgemini.spring.calculator;
import com.capgemini.spring.calculator.*;
import org.springframework.aop.*;
import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;

@Service
@Aspect
public class CalculatorAspect{

	@Before("execution(* com.capgemini.spring.calculator.CalculatorService.add(..))")
	public void add1(){

		System.out.println("Done with aspect before addtion");	

	}

	@After("execution(* com.capgemini.spring.calculator.CalculatorService.division(..))")
	public void log1(){

		System.out.println("Done with aspect after addition");	

	}

	@Before("execution(* com.capgemini.spring.calculator.CalculatorService.division(..))")
	public void add2(){

		System.out.println("Done with aspect before division");	

	}

	@After("execution(* com.capgemini.spring.calculator.CalculatorService.division(..))")
	public void add3(){

		System.out.println("Done with aspect after division");	

	}

	@Around("execution(* com.capgemini.spring.calculator.CalculatorService.division(..))")
	public void log(ProceedingJoinPoint jp) throws Throwable{
	
	Object[] argument = jp.getArgs();
	Double firstArg = Double.parseDouble(argument[0].toString());
	Double secondArg = Double.parseDouble(argument[1].toString());

	if(secondArg!=0){
		System.out.println("Done with aspect before around division");
		jp.proceed();
		System.out.println("Done with aspect after around division");
	}
	else
		System.out.println("Divisor can not be zero");			

	}	
	
	



}
