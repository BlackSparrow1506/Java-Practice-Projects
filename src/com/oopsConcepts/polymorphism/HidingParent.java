package com.oopsConcepts.polymorphism;

public class HidingParent {
	
	// Static method in parent class
    public static void main(String[] args) {
        System.out.println("Parent's main method");
        display(); // Calls Parent's display
    }
    
    // Another static method to demonstrate hiding
    public static void display() {
        System.out.println("Display method from Parent");
    }

}
