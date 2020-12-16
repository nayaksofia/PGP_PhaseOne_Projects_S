package com.exceptions;

class ArithmaticTest{
	public void division(int num1, int num2) {
	//Type:1
//		int result = num1/num2;
//		System.out.println("Result : " + result);
		
		// Exception Handling 
		try {
			int result = num1/num2;
            System.out.println("Result : " + result);
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
	}
}

public class ExceptionDemoOne {

	public static void main(String[] args) {
		ArithmaticTest obj = new ArithmaticTest();
		obj.division(100, 0);

	}

}
