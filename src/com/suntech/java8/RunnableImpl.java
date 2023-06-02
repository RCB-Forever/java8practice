package com.suntech.java8;

public class RunnableImpl {

	public static void main(String[] args) {
		
		// Prior java8
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Inside run method");
			}
		};
		
		//Wee can call interface methods using interface name
		r1.run();
		
//		Thread t1=new Thread(r1);
//		t1.start();
		
		//After java 8 using lambda
		new Thread(() -> System.out.println("Inside run method using lambda")).start();
		
	}

}
