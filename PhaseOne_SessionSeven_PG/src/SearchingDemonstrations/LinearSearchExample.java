package SearchingDemonstrations;

class LinearSearch {
	
	public int searchElement(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
}


public class LinearSearchExample {

	public static void main(String[] args) {
		
		int[] numbers = {7, 1, 8 , 3 , 6, 8};
		LinearSearch search = new LinearSearch(); //Instantiate object of Linear search class 
		var index = search.searchElement(numbers, 70); //Call the searcElement()
		System.out.println("The element is found at index : " + index);

	}

}
