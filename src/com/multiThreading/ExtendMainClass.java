package com.multiThreading;

public class ExtendMainClass {
	public static void main(String[] args) {
		ExtendBaseClass thread1 = new ExtendBaseClass();
		ExtendBaseClass thread2 = new ExtendBaseClass();
		
		// Assigning thread names (optional)
		thread1.setName("Thread - 1");
		thread2.setName("Thread - 2");
		
		// Starting the threads
		thread1.start();
		thread2.start();

	}

}
