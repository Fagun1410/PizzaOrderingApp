package com.pizzaOrdering.dtos;

public class CanadianPizza implements PizzaType{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 250.00;
	}

	@Override
	public String getDescription() {
		  return "Canadian Pizza";
	  }
	

}
