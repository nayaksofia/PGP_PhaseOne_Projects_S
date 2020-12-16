package methodDemo;

class Calculation {
	
	// Create Method of data type : int 
	
	int addition(int num1, int num2) {
		return num1 + num2; 
	}
	
	//no. of parameters different
	
	int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	//types of parameters
	float addition (float num1, float num2) {
		return num1 + num2;
	}
	
     //Factorial 
	int factorial(int n) {
		if( n!= 0)
			return n * factorial(n-1);
		else
			return 1;
	}
}



public class MethodDemoOne {

	public static void main(String[] args) {
		// Object creation
		Calculation calc = new Calculation();
		
//		int result = calc.addition(100,200);	
//		System.out.println("Result: " + result);

		System.out.println("Addition Result: " + calc.addition(1000,2000));
		System.out.println("Addition Result:" + calc.addition(50F, 200F));
		System.out.println("Addition Result: " + calc.addition(100,200,200));
        System.out.println("Factorial: " + calc.factorial(5));
	}

}
