package assistedpractice3_5;

//Writing a program in Java to demonstrate the finally keyword

// finally keyword is always execute and followed by try....catch block i.e [try....catch...finally ] 
public class FinallyBlockDemo {
    public static void main(String[] args)
    {
        int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }

}
