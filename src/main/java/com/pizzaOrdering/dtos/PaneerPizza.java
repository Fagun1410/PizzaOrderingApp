package com.pizzaOrdering.dtos;

public class PaneerPizza implements PizzaType{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200.00;
	}

	@Override
	public String getDescription() {
		  return "Paneer Pizza";
	  }

}
