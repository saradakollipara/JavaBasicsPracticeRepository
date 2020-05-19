package com.threads;

public class ExcuteThread {

	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		t1.setName("Thread 1");
		t1.start(); // start() method will call run() method internally.
		
		TestThread t2  = new TestThread();
		t2.setName("Thread 2");

		t2.start();
	}

}
