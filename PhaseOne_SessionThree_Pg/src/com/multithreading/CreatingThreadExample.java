package com.multithreading;
//By extending Thread Class

  class FirstThread1 extends Thread{

	@Override
	public void run() {
		System.out.println("First Thread is running....!!!!");
	}
	  
  }
   
public class CreatingThreadExample {

	public static void main(String[] args) {
		FirstThread1 t1 = new FirstThread1();
		t1.start();

	}

}
