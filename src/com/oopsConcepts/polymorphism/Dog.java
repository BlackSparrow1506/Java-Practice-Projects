package com.oopsConcepts.polymorphism;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " says: Woof! Woof!");
	}
	
	// Additional overloaded methods
    public void play() {
        System.out.println(name + " is playing");
    }
    
    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }
    
    public void play(String toy, int duration) {
        System.out.println(name + " is playing with " + toy + " for " + duration + " minutes");
    }

}
