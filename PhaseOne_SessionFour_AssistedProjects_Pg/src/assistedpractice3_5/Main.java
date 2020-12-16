package assistedpractice3_5;

//Writing a program in Java to demonstrate custom exceptions

class MyException extends Exception 
{ 
    public MyException(String s) //constructor 
    { 
        super(s); 
    } 
} 


public class Main {
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 

}
