package com.exceptions;

public class ExceptionDemoFive {
	
	//Note: Any particular method where is the chances of getting exception , we decorate that exception with throw keyword 
	
	public static void division(int num1 , int num2) throws ArithmeticException{
		
		System.out.println(num1/num2);
	}

	public static void main(String[] args) {
		try {
			division(100,0);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
