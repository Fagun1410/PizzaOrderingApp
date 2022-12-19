package com.pizzaOrderingApp;

import com.pizzaOrdering.services.BillingHandler;
import com.pizzaOrdering.services.BillingHandlerImp;

public class PizzaOrderingApp {
	public static void main(String[] args) {

		BillingHandler bill = new BillingHandlerImp();
		bill.calculateBill();
	}
}
