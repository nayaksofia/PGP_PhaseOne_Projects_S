package com.exceptions;

// Working with Multiple Catch Blocks

class Arithmatic {
	int array[] = {10,20,30,40};
	int num1 = 100;
	int num2 = 10;
	
	public void calculate() {
		
		try {
			System.out.println( num1/num2 );
			System.out.println("Fourth element of array : " + array[3]);
			System.out.println("Fifth element of array : " + array[4]); //no fifth element are there
				
		} catch(ArrayIndexOutOfBoundsException ex) {  //if you are dammed sure the exception name then write 
			System.out.println("Array Exception : " + ex);
		} catch(ArithmeticException ex) {
			System.out.println("Arithmatic Exception " + ex);
		} catch (Exception ex) { //Write this default exception catch in the end if you not sure about above exception
			System.out.println("Exception : " + ex);
		}
		
	}
  }
   public class ExceptionDemoTwo {

	public static void main(String[] args) {
		//calling the method 
		Arithmatic obj = new Arithmatic();
		obj.calculate();

	}

}
