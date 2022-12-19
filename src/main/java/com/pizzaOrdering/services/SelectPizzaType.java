package com.pizzaOrdering.services;

import java.util.HashMap;
import java.util.Scanner;

import com.pizzaOrdering.dtos.CanadianPizza;
import com.pizzaOrdering.dtos.PaneerPizza;
import com.pizzaOrdering.dtos.PizzaType;
import com.pizzaOrdering.dtos.VeggiePizza;

public class SelectPizzaType {
	public double selectPizzType(double Bill) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Select Pizza Type");
		String type = SC.nextLine();
		PizzaType pizza;
		//PizzaType ty = new PizzaType();
		//HashMap<String, Double> PizzaType = ty.getPizzatype();
		switch (type) {
		case "VeggiePizza":
			pizza = new VeggiePizza();
			Bill = Bill + pizza.getPrice();
			break;
		case "PaneerPizza":
			pizza = new PaneerPizza();
			Bill = Bill + pizza.getPrice();
			break;
		case "CanadianPizza":
			pizza = new CanadianPizza();
			Bill = Bill + pizza.getPrice();
			break;
		}
		return Bill;

	}

}
