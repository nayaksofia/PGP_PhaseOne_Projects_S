package com.exceptions;

class ArithmaticTesting{
	public void division(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			System.out.println("Finally will always excute...");
			System.out.println("Result : " + result);
		}
		System.out.println("Remaining Code after Exception Handling....");
	}
}

public class ExceptionDemoThree {

	public static void main(String[] args) {
		ArithmaticTesting obj = new ArithmaticTesting();
		obj.division(100, 0);

	}

}
