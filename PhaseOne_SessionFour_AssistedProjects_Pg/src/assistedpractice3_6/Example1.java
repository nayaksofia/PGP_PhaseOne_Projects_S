package assistedpractice3_6;

//Writing a program in Java to demonstrate exception handling

class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	
	   String str1;
	   
	   MyException(String str2) {  //constructor 
		 str1=str2;
	   }
	   
	   public String toString(){ 
		return ("MyException Occurred: "+ str1) ;
	   }
	}

  public class Example1 {
	   public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new MyException("This is My error Message");
			}
			catch(MyException exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }


}
