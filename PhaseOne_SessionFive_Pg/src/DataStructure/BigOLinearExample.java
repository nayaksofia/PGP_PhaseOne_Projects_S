package DataStructure;

public class BigOLinearExample {

	public static void  display(int[] number , String[] names) {

		/*
		 // Time Complexity is O(n) [Worst Case Running Time]
		 // because it depends on nth time 
		   
		 for (int i = 0 ; i < number.length; i++) {
			System.out.println(number[i]);
		}
		 */

		// Time complexity is O(1) i.e constant 
		System.out.println(1); 

		/* Logic 1
		 * O(1+1+n)
		 * O(2+n)
		 * O(n)
		 */


		/* Logic 2
		 * O(n) +O(n)
		 * O(2n)
		 * O(n)
		 */

		/* Logic 3
		 * O(n) + O(m)
		 * = O(n+m)
		 * = O(n)
		 * Because O(n) is linear and whatever we add with n become n .
		 */
		//O(m), but it become O(n) too
		for (String name : names) {
			System.out.println(name);
		}

		// O(n)
		for(int num : number) {
			System.out.println(num);
		}

	}


	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		// display(numbers);

	}

}
