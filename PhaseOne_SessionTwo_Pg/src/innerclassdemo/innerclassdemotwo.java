package innerclassdemo;

class Outer1{
	void outer_method() {
		int data = 100;
		class Inner1 {
			void inner_method() {
				System.out.println(data);
			}
		}
		
		Inner1 inn = new Inner1();
		inn.inner_method();
	}
}


public class innerclassdemotwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1 obj = new Outer1();
		obj.outer_method();
		

	}

}
