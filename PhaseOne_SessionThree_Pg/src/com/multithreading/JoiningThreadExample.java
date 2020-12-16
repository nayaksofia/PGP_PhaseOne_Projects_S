package com.multithreading;

class MyRunnable implements Runnable {

	@Override
	public void run() {
	
		try {
			System.out.println(Thread.currentThread().getName() + "start.");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + "end.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
   
	
}
public class JoiningThreadExample {
	
	// add throws InterruptedException

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main threads execution starts...");
		
		MyRunnable runnable = new MyRunnable(); //Instantiate Runnable 
		// Eg1: 
        // Thread t1 = new Thread(runnable, "Thread-One "); //instantiate Thread 
        //	t1.start();
		
	   Thread t1 = new Thread (runnable, "Thread-one ");
	   Thread t2 = new Thread (runnable, "Thread-two ");
	   Thread t3 = new Thread (runnable, "Thread-three ");
	   t1.start();
	   // lets wait for t1 to die
	   t1.join();
	   t2.start();
	   // lets wait for 1s or t2 to die, whichever occur first 
	   t2.join(1000);
	   t3.start();
	   //Complete all threads before completing main thread 
	   t2.join();
	   t3.join();
	   System.out.println("Main Thread Executing Ends..");
	}

}
