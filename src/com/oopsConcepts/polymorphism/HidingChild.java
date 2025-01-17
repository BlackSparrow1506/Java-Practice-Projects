package com.oopsConcepts.polymorphism;

public class HidingChild extends HidingParent {

	// This hides Parent's main method
	public static void main(String[] args) {
		System.out.println("Child's main method");
		display(); // Calls Child's display

		HidingParent.main(args);
		HidingParent.display();
	}

	// This hides Parent's display method
	public static void display() {
		System.out.println("Display method from Child");
	}

}
