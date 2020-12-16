package assistedpractice3_5;

//Writing a program in Java to demonstrate the throw keyword

public class ThrowDemo {
	
	public static void division() {
		
		int a=45,b=0,rs;
		if(b==0)        
            throw new ArithmeticException("Can't divide by zero."); //throw key word is used in the line of code with new key
        else
        {
            rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
	}
	
    public static void main(String[] args)
    {

        try {
        	division();
        }
       
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");
    }

}
