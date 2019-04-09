package com.capgemini.spring.calculator;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component("calculator")
public class CalculatorService implements Calculator{
	
	

	@Override
	public void add(int number1, int number2){

		System.out.println(number1+number2);	

	}

	@Override
	public void division(Double number1, Double number2){

		System.out.println(number1/number2);

	}

}