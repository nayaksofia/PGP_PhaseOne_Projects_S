package innerclassdemo;
//import java.util.*;

public class innerclassdemo {
		private int data =100;
	   class Inner {
		   void display() {
			   System.out.println("Data: " + data);
		   }
	   }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		innerclassdemo out = new innerclassdemo();
		innerclassdemo.Inner in = out.new Inner();
		in.display();
 
	}
}

