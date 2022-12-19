package com.pizzaOrdering.services;

import java.util.Scanner;

import com.pizzaOrdering.dtos.BlackOlive;
import com.pizzaOrdering.dtos.Onion;
import com.pizzaOrdering.dtos.PizzaToppings;
import com.pizzaOrdering.dtos.RedPepper;
import com.pizzaOrdering.dtos.VeggiePizza;

public class AddPizzaTopping {
	String conti;
	Scanner SC = new Scanner(System.in);

	public double addPizzaTopping(double Bill) {
		do {
			System.out.println("Select Pizza Toppings");
			String topping = SC.nextLine();
			PizzaToppings pizzatopping;
		//	PizzaToppings top = PizzaToppings.valueOf(topping);
			switch (topping) {
			case "Onion":
				pizzatopping = new Onion();
				Bill = Bill + pizzatopping.getPrice();
				//Bill = Bill + 15.0;
				break;
			case "RedPepper":
				pizzatopping = new RedPepper();
				Bill = Bill + pizzatopping.getPrice();
				
				//Bill = Bill + 10.0;
				break;
			case "BlackOlive":
				pizzatopping = new BlackOlive();
				Bill = Bill + pizzatopping.getPrice();
				
				//Bill = Bill + 20.0;
				break;
			}
			System.out.println("Do you want to add more toppings?(Y/N):");
			conti = SC.nextLine();
		} while (conti.equalsIgnoreCase("Y"));
		return Bill;
	}
}
