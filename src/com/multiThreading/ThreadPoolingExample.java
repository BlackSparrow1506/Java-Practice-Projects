package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingExample {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // Pool with 3 threads

        for (int i = 1; i <= 5; i++) {
            executor.execute(new ThreadPoolingTask(i)); // Submitting tasks
        }

        executor.shutdown(); // Stop accepting new tasks
    }

}
