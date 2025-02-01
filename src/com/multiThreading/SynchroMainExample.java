package com.multiThreading;

public class SynchroMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchroSharedResource resource = new SynchroSharedResource();
		
		SynchroWorkerThread thread1 = new SynchroWorkerThread(resource, true); //Increment 
		SynchroWorkerThread thread2 = new SynchroWorkerThread(resource, false); //Decrement

		thread1.start();
		thread2.start();
	}

}
