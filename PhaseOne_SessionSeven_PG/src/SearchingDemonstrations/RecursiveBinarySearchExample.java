package SearchingDemonstrations;

class RecursiveBinarySearch {
	
	public int searchElement(int[] array, int target, int left ,int right) {
		
		if (right<left)
			return -1;
		
		int middle = (left + right)/2;
		if (array[middle] == target)
			return middle;
		if (target < array[middle])
			return searchElement(array, target, left, middle - 1);
		return searchElement(array, target, middle +1 , right); //This line is executed if non of the if line executed
		
	}
}

public class RecursiveBinarySearchExample {

	public static void main(String[] args) {
		
		int [] numbers = {1, 3, 4, 6, 7}; //Input list to be Sorted
		RecursiveBinarySearch search = new RecursiveBinarySearch(); //Instantiate object of class RecursiveBinarySearch
		var index = search.searchElement(numbers,  6,  0,  numbers.length -1);
		System.out.println("The element found in index : " + index);

	}

}
