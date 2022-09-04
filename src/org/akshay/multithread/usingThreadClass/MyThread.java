package org.akshay.multithread.usingThreadClass;

public class MyThread extends Thread{

	MyThread(){
		super("Child thread");
		System.out.println("Child thread created...");
	}

	@Override
	public void run() {
		try{
			for(int i=10; i>0; i--) {
				System.out.println("Child Thread :" + i);
				Thread.sleep(1000);
			}
			System.out.println("Exiting child thread...");
		} catch(InterruptedException e){
			System.out.println("Child Thread InterruptedException:" + e);
		}
	}
}
