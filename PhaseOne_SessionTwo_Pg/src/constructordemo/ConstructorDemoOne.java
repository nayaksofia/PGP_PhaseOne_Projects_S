package constructordemo;

class Employee {
	
	String name;
	int age;
	
	//Default constructor 
	public Employee() {   // Note:Constructor Name is Same as Class Name
	   this.name = "Sofia";
	   this.age = 30;
	}
	
	
	//Parameterized Constructor 
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayDetails() {  // This is method name 
		System.out.println(this.name + ":" + this.age);
	}
}



public class ConstructorDemoOne {
	
	public static void main(String[] args) {
		
		//Creating Object To Access Method 
		
		//object one as emp1
		Employee emp1 = new Employee();
		emp1.displayDetails();
		
		//object two as emp2
		Employee emp2 = new Employee("Rosa",34);
		emp2.displayDetails();
		
		
		
	}
	

}
