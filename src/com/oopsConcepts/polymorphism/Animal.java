package com.oopsConcepts.polymorphism;

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Some generic animal sound");
	}

	// Overloaded methods
	public void eat() {
		System.out.println(name + " is eating something");
	}

	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}

	public void eat(String food, int quantity) {
		System.out.println(name + " is eating " + quantity + " " + food);
	}

}
