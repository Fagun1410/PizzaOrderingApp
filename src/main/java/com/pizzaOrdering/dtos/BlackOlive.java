package com.pizzaOrdering.dtos;

public class BlackOlive implements PizzaToppings{
PizzaType pizza;
	
	/*public BlackOlive(PizzaType pizza){
		  this.pizza = pizza;
		 }*/

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 25.0;
	}
	
	@Override
	public String getDescription() {
		  return this.pizza.getDescription() + ", Paneer";
	  }


}
