package constructordemo;

//Constructor Chaining Inheritance in multiple classes
  
class Per {
	
	String name;
	int age;
	
	public Per(String name, int age) {
		System.out.println("Parameterized Constructor with two parameters");
		this.name =name;
		this.age = age;
	}
	
	void displayDetails() {
		System.out.println(this.name + ":" + this.age);
	}

}
	
	class Emp extends Per{
		
		float salary;

		public Emp(String name, int age, float salary) {
			super(name, age);
			this.salary = salary;
		}	
		
		void displayDetails() {
	        super.displayDetails();
			System.out.println(this.salary);
		}
	
}

  public class ConstructorDemoThree {
	  public static void main(String[] args) {
		Emp obj =new Emp("King",38, 2000); //from the child class we create object 
		obj.displayDetails();	
	}
  }

