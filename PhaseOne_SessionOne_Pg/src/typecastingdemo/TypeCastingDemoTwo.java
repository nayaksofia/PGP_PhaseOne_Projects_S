package typecastingdemo;

public class TypeCastingDemoTwo {

	public static void main(String[] args) {

	// Case 1
//       int num1 = 100;
//       int num2 = 200;
//       int result = num1 + num2 ;
       
		
//		Case 2
         byte num1 = 10;
         byte num2 = 20;
//       int result = num1 + num2 ;  
         byte result = (byte) (num1 + num2) ;
// Note : byte, short, char are the types that convert implicitly into integer at the time of operation         
       
       System.out.println(num1);
       System.out.println(num2);
       System.out.println(result);
       
	}

}
