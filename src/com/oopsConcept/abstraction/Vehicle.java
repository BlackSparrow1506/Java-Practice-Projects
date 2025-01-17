package com.oopsConcept.abstraction;

public abstract class Vehicle {
	private String Brand;
	private String model;
	protected int year;
	
	//CONSTRUCTOR
	public Vehicle(String Brand, String model, int year) {
		this.Brand = Brand;
		this.model = model;
		this.year = year;
		
		
	}
	
	//Abstract methods that must be implemented by subclasses
	abstract double effi();
	abstract double maxSpeed();
	
	// Concrete method shared by all vehicles
	public void displayInfo() {
		System.out.println("Brand: " + Brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Efficiency: " + effi() + " mpg");
        System.out.println("Max Speed: " + maxSpeed() + " mph");
    
	}
	
	//GETTER AND SETTER
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
