package assistedpractice3_4;

// Writing a program in Java to demonstrate try and catch

public class MyClass {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[3];
	        
	        try 
	        {
	            array[7] = 3; // Write the line of code whose chances of getting exception is high
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	        	//Note: Whatever you write here will always excute 
	            System.out.println("The array is of size " + array.length);
	        }
	    }
	}



