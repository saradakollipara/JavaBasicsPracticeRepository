package com.threads;

public class TestThread extends Thread{
	public void run() {
		System.out.println("This is run method");
		for (int i =0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+ " " +":" +" "+ i);
		}
	}

}
