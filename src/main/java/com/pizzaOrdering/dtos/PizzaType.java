package com.pizzaOrdering.dtos;

//import java.util.HashMap;

//import lombok.Getter;
//import lombok.Setter;

public interface PizzaType {
	
	public String PizzaName = "Pizza";
	//public String Description = "";
	//public double Cost = 0; 

	  public default String getDescription() {
		  return PizzaName;
	  }
	  public double getPrice();
	/*public static HashMap<String, Double> getPizzatype() {
		return pizzatype;
	}

	public static void setPizzatype(HashMap<String, Double> pizzatype) {
		PizzaType.pizzatype = pizzatype;
	}

	static HashMap<String, Double> pizzatype = new HashMap<>();
	static {
		pizzatype.put("VeggiePizza", 200.0);
		pizzatype.put("PaneerPizza", 300.0);
		pizzatype.put("CanadianPizza", 350.0);
	}*/
}