package org.akshay.multithread.usingRunnable;

public class MyRunnable implements Runnable{

	Thread t;
	
	public MyRunnable() {
		t = new Thread(this, "Child Thread ");
		System.out.println("creating child thread...");
	}

	@Override
	public void run() {
		try {
			for(int i=10; i>0; i--) {
				System.out.println(this.t.getName() + " :" + i);

				//Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("exiting child thread...");

	}
}
