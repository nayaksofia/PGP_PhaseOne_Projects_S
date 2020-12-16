package typecastingdemo;

public class TypeCastingDemoOne {

	public static void main(String[] args) {
//   Case 1
//		int myAge = 30;
//		int herAge = myAge;  //Type Casting : Not Required 
		
		
// 	 Case 2
//		byte myAge = 30;
//    	int herAge = myAge;  //Type Casting : Implicit (widening) 
		
		
// Case 3
    	int myAge = 30;
    	byte herAge = (byte)myAge; //Type Casting: Explicit (Narrowing) 
		
		System.out.println ("My Age: " + myAge);
		System.out.println ("Her Age: " + herAge);

	}

}
