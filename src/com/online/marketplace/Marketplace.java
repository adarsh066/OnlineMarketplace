package com.online.marketplace;

import java.util.PriorityQueue;

/**
 * Main class to simulate the online marketplace.
 * Author: Aadarsh Patil 
 * Date: 26th June 2024
 */
public class Marketplace {

	public static void main(String[] args) {
		// Create a custom comparator for products
		ProductComparator comparator = new ProductComparator();

		// Priority queue with custom comparator
		PriorityQueue<Product> productQueue = new PriorityQueue<>(comparator);

		// Add products to the queue
		productQueue.add(new Product("Laptop", 1000.0, 1));
		productQueue.add(new Product("Smartphone", 700.0, 3));
		productQueue.add(new Product("Headphones", 200.0, 2));
		productQueue.add(new Product("Smartwatch", 300.0, 2));
		productQueue.add(new Product("Tablet", 500.0, 3));

		// Print products based on priority
		System.out.println("Products sorted by priority:");
		while (!productQueue.isEmpty()) {
			System.out.println(productQueue.poll());
		}
	}
}
