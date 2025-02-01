package com.multiThreading;

public class ExtendBaseClass extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			// Using Thread.currentThread().getName(): Prints the name of the currently running thread.
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
			try {
				Thread.sleep(1000); // Pause for 1 second
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
