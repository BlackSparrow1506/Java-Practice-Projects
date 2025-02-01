package com.multiThreading;

public class ThreadPoolingTask implements Runnable {

	private final int taskId;

	public ThreadPoolingTask(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println("Task " + taskId + " is running on: " + Thread.currentThread().getName());

		try {
			Thread.sleep(2000); // Simulating work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Task " + taskId + " completed.");
	}

}
