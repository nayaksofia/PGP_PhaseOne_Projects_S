package com.exceptions;

// Working with throw keyword:

public class ExceptionDemoFour {

	static void validate(int age) throws AgeException {
		
		if(age < 18) {
			// throw new ArithmeticException("Not Valid to Vote...");
			throw new AgeException();
		} else {
			System.out.println("You are valid to vote...");
		}
	}
	
	public static void main(String[] args) {
	
		try {
			validate(2); // call the method whose chances are high to get exception 
			
		} catch (ArithmeticException | AgeException ex) {  //instead of writing two catche, we  replace it like the line 22 too 
			System.out.println(ex);
		}	

//		catch (AgeException ex) {  //notice demo changes...
//			System.out.println(ex);
//		}
		
     System.out.println("Rest Of the code here....");
     
	}

}
