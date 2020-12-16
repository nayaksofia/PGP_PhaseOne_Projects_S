package calculatorproject;

import java.util.Scanner; //Import Package For Scanner 


public class Calculator1 {

	public static void main(String[] args) {
		
		  double num1;
	      double num2;
	      double res;
	      char op;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter two numbers: ");
	      num1 = scan.nextDouble();
	      num2 = scan.nextDouble();
	      
	      System.out.print("\nEnter an operator (+, -, *, /): ");
	      
	      op = scan.next().charAt(0);
	      
	      switch(op) {
	         case '+': res = num1 + num2;
	            break;
	         case '-': res = num1 - num2;
	            break;
	         case '*': res = num1 * num2;
	            break;
	         case '/': res = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      
	      System.out.print("\nThe result is:\n");
	      System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
	      
	   }

	}


