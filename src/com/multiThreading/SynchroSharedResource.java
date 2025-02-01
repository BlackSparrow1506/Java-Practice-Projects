package com.multiThreading;

public class SynchroSharedResource {
	private int count = 0;
	
	//Synchronized method to increment count
	public synchronized void increment() {
		 count++;
	        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
	}
	
	// Synchronized method to decrement count
    public synchronized void decrement() {
        count--;
        System.out.println(Thread.currentThread().getName() + " decremented count to: " + count);
    }

}
