package com.capgemini.spring.food.type;



public class FoodRenderer{

	private FoodType food;

	public void render(){

		System.out.println(food.getFood());
	} 

	public void setFoodType(FoodType food){
	
	this.food = food;
	}

}