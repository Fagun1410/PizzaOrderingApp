package com.pizzaOrdering.dtos;

public class VeggiePizza implements PizzaType{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100.0;
	}
	
	@Override
	public String getDescription() {
		  return "Veggie Pizza";
	  }
}
