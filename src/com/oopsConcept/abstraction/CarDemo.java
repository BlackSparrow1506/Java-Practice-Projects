package com.oopsConcept.abstraction;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a car
		Car car = new Car("Tesla", "x3", 2022, 200, 2.5);
		System.out.println("Car Information:");
        car.displayInfo();
        
        System.out.println("\n-------------------\n");
        
        //create a bike
       Bike bike = new Bike("Honda", "Activa", 2023, 60, true);
       System.out.println("Bike Information");
       bike.displayInfo();

	}

}
