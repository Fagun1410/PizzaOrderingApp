package com.pizzaOrdering.dtos;

public class Onion implements PizzaToppings{
	
	PizzaType pizza;
	
	/*public Onion(PizzaType pizza){
		  this.pizza = pizza;
		 }*/

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 15.0;
	}
	
	@Override
	public String getDescription() {
		  return this.pizza.getDescription() + ", Onion";
	  }

}
