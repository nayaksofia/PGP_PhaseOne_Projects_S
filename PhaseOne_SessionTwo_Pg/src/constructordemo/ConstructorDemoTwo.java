package constructordemo;

//Constructor Chaining 

class Person {
	String name;
	   int age; 
	   
	   public Person() { //Default Constructor 
		   this(34);
		   System.out.println("Default Constructor Called");
		   this.name = "Unknown"; 
		   this.age = 15;
	   }
	   
	   public Person(String name, int age) { // Parameterized Constructor 
		   this();
		   System.out.println("Parameterized Constructor with two parameters called");
		   this.name = name;
		   this.age = age;
	   }
	   
	   public Person (int age) {
		   System.out.println("Parameterized Constructor with One Parameter Called");
		   this.age = age;
	   }
	   
	   
	 void displayDetails() {
		 System.out.println(this.name + ":" + this.age);
	 }
}

public class ConstructorDemoTwo {

	public static void main(String[] args) {
		Person obj = new Person ("King",23);
		obj.displayDetails();

	}

}
