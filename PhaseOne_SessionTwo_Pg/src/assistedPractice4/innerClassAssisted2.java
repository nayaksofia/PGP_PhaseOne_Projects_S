package assistedPractice4;

public class innerClassAssisted2 {

private String msg="Inner Classes";

//Inside method we create inner class 
 void display(){  
	 class Inner{  
		 void msg(){ //Inner method
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
 
public static void main(String[] args) {
	innerClassAssisted2  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}


