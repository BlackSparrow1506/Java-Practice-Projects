package com.multiThreading;

public class SynchroWorkerThread extends Thread {

	private final SynchroSharedResource resource;
	private final boolean increment;

	public SynchroWorkerThread(SynchroSharedResource resource, boolean increment) {
		this.resource = resource;
		this.increment = increment;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			if (increment) {
				resource.increment();
			} else {
				resource.decrement();
			}

			try {
				Thread.sleep(500); // Simulate work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
