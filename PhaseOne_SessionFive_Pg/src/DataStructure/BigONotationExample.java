package DataStructure;

public class BigONotationExample {

	public static void display(int[] number) {
		//Constant Big O Notation 
		//Time complexity of two display method: O(1) + O(1) = O(2) = O(1);
		
	  //Time complexity is of line no 10 is O(1), Because it execute once. 
		System.out.println(number[0]);	
		
	  //O(1)
		System.out.println(number[1]);
		
		
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		display(numbers);
	}

}
