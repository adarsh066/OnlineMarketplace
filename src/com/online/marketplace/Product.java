package com.online.marketplace;

/**
 * Represents a product in the online marketplace.
 *
 * Author: Aadarsh Patil  
 * Date: 26th June 2024
 */
public class Product {
	private String name;
	private double price;
	private int priority;

	/**
	 * Constructor to initialize a product.
	 * 
	 * @param name     The name of the product.
	 * @param price    The price of the product.
	 * @param priority The priority of the product.
	 */
	public Product(String name, double price, int priority) {
		this.name = name;
		this.price = price;
		this.priority = priority;
	}

	/**
	 * Gets the name of the product.
	 * 
	 * @return The name of the product.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the price of the product.
	 * 
	 * @return The price of the product.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets the priority of the product.
	 * 
	 * @return The priority of the product.
	 */
	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Product{name='" + name + "', price=" + price + ", priority=" + priority + "}";
	}
}
