package com.oopsConcepts.polymorphism;

public class MainMethodOverloadingExample {

	public static void main(String[] args) {
		System.out.println("1. Original main method called with String[] args");

		// Calling other overloaded main methods
		main("Hello");
		main("Hello", "World");
		main(42);

	}
	
	// Overloaded main method with one String parameter
    public static void main(String arg1) {
        System.out.println("2. Overloaded main method called with String parameter: " + arg1);
    }
    
    // Overloaded main method with two String parameters
    public static void main(String arg1, String arg2) {
        System.out.println("3. Overloaded main method called with two String parameters: " + arg1 + ", " + arg2);
    }
    
    // Overloaded main method with integer parameter
    public static void main(int number) {
        System.out.println("4. Overloaded main method called with int parameter: " + number);
    }

}
