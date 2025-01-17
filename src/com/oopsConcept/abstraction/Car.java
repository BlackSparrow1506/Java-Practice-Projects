package com.oopsConcept.abstraction;

public class Car extends Vehicle{
	
	private int horsePower;
	private double engineSize;

	public Car(String Brand, String model, int year, int horsePower, double engineSize) {
		super(Brand, model, year);
		// TODO Auto-generated constructor stub
	this.horsePower = horsePower;
	this.engineSize = engineSize;
		
	}

	@Override
	double effi() {
		// simple calculations
		return 30.0 - (engineSize * 2) + (year - 2000) * 0.1;
	}

	@Override
	double maxSpeed() {
		// TODO Auto-generated method stub
		return 120.0 + (horsePower / 2.0);
	}

}
