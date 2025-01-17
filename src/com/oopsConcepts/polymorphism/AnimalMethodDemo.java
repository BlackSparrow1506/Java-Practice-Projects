package com.oopsConcepts.polymorphism;

public class AnimalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("cow");
		Dog dog = new Dog("Husky");

		// Demonstrate method overriding
		System.out.println("Method Overriding Example:");
		animal.makeSound();
		dog.makeSound();

		System.out.println("\nMethod Overloading Examples:");

		// Demonstrate method overloading in Animal class
		dog.eat(); // Calls no-parameter version
		dog.eat("dog food"); // Calls version with food parameter
		dog.eat("dog treats", 3); // Calls version with food and quantity

		// Demonstrate method overloading in Dog class
		System.out.println("\nDog-specific overloading:");
		dog.play(); // Calls no-parameter version
		dog.play("ball"); // Calls version with toy parameter
		dog.play("frisbee", 30); // Calls version with toy and duration

	}

}
