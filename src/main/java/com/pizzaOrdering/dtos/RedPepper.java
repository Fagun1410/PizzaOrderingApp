package com.pizzaOrdering.dtos;

public class RedPepper implements PizzaToppings{
	
	PizzaType pizza;
	
	/*public RedPepper(PizzaType pizza){
		  this.pizza = pizza;
		 }*/

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 20.0;
	}
	
	@Override
	public String getDescription() {
		  return this.pizza.getDescription() + ", RedPepper";
	  }


}
