package com.oopsConcept.abstraction;

public class Bike extends Vehicle{
	private int EngineCC;
	private boolean hasFiring;

	public Bike(String Brand, String model, int year, int EngineCC, boolean hasFiring) {
		super(Brand, model, year);
		// TODO Auto-generated constructor stub
		this.EngineCC = EngineCC;
		this.hasFiring =hasFiring;
		
		
	}

	@Override
	double effi() {
		// TODO Auto-generated method stub
		return 50.0 - (EngineCC / 100.0) + (hasFiring ? 5.0 : 0.0);
	}

	@Override
	double maxSpeed() {
		// TODO Auto-generated method stub
		return 80.0 + (EngineCC / 10.0) + (hasFiring ? 20.0 : 0.0);
	}

}
