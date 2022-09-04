package org.akshay.multithread.usingThreadClass;

public class ExtendThread {
	
	public static void main(String args[]) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		
		for(int i=10; i>0; i--) {
			System.out.println("Main thread :" + i);
			Thread.sleep(1000);
		}
		System.out.println("Exiting main thread...");
	}

}
