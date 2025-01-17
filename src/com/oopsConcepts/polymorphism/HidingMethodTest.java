package com.oopsConcepts.polymorphism;

public class HidingMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing method hiding:");

		// Using Parent reference
		HidingParent p = new HidingChild(); // Despite using Child object, Parent's static methods will be called
		p.display(); // Calls Parent's display (because static methods use reference type)

		// Using Child reference
		HidingChild c = new HidingChild();
		c.display(); // Calls Child's display

		// Direct class calls
		HidingParent.display(); // Calls Parent's display
		HidingChild.display(); // Calls Child's display
	}

}
