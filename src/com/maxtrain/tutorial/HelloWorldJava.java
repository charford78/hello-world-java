package com.maxtrain.tutorial;

import com.maxtrain.tutorial.models.Customer;  //this gets created when you import this by clicking
												//on the error on the new instance of Customer.
												//if there are many classes to import than you can do
												//import com.maxtrain.tutorial.models.*
import com.maxtrain.tutorial.models.PrimeCustomer;

public class HelloWorldJava {

	public static void main(String[] args) {
		
		var primeCustomer2 = new PrimeCustomer("ABC", 1000);			
		var primeCustomer = new PrimeCustomer("MAX");
		
		var customer = new Customer();
		customer.setName("Fred Inc.");
		customer.setSales(2000);
		
		customer.setSales(customer.getSales() + 1000);
		
		var message = String.format("Customer: %d | %s | %f",
											customer.getId(),
											customer.getName(),
											customer.getSales());
		
		System.out.println(message);
	}
}
