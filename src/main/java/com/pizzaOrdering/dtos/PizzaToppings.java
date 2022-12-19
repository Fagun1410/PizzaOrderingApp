package com.pizzaOrdering.dtos;

/*public enum PizzaToppings {
	Onion, RedPepper, BlackOlive
}*/

public interface PizzaToppings extends PizzaType{
	public default String getDescription() {
        return "Toppings";
    }
}