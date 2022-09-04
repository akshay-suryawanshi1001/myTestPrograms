package org.akshay.multithread.usingRunnable;

public class RunnableExample {
	
	public static void main(String args[]) throws InterruptedException {
		/*Thread current = Thread.currentThread();
		System.out.println(current);
		current.setName("Main thread ");
		for(int i=10; i>0; i--) {
			System.out.println(current.getName() + " :" + i);
			Thread.sleep(1000);
		}
		System.out.println("exiting main thread...");  */
		
		MyRunnable current = new MyRunnable();
		current.t.start();
		
		for(int i=10; i>0; i--) {
			System.out.println("Main thread :" + i);
			Thread.sleep(1000);
		}
		System.out.println("exiting main thread...");
	}

}
