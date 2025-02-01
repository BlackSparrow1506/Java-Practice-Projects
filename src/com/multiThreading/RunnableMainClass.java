package com.multiThreading;

public class RunnableMainClass {

	public static void main(String[] args) {
		// Creating Runnable instance
		RunnableBaseClass thread = new RunnableBaseClass();

		// Creating thread objects and passing Runnable instance
		Thread thread1 = new Thread(thread);
		Thread thread2 = new Thread(thread);

		// Starting the threads
		thread1.start();
		thread2.start();

	}

}
