package DataStructure;

public class BigOThirdExample {
	
	public static void display(int[] numbers) {
		
		/*Time Complexity Of All Together:
		 * O(n^2) + O(n)
		 * O(n^2 + n)
		 * O(n)
		 */
		
		/* Quadratic Big O Notation 
		 * O(n * n)
		 * O(n^2) 
		 */
		for(int first : numbers) {  //O(n)
			for(int second : numbers) { //O(n)
				System.out.println(first + ":" + second);
			}
		}
		
		for (int num : numbers) { //O(n)
			System.out.println(num);
		}
		
		
		}

	public static void main(String[] args) {
		

	}

}
