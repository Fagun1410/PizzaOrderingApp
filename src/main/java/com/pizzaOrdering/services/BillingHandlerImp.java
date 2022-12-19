package com.pizzaOrdering.services;

public class BillingHandlerImp implements BillingHandler {

	double Bill = 0.0;

	SelectPizzaType selectpizzatype = new SelectPizzaType();
	AddPizzaTopping addpizzatopping = new AddPizzaTopping();

	@Override
	public void calculateBill() {

		Bill = selectpizzatype.selectPizzType(Bill);
		Bill = addpizzatopping.addPizzaTopping(Bill);

		//System.out.println("Your "+pizza.getDescription()+"with toppings of choice is ready");
		System.out.println("Total Bill:" + Bill);
	}
}
