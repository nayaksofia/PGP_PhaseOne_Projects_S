package SortingDemonstrations;

import java.util.Arrays;
/*
 * Merge Sort 
 */
class MergeSort{
	public void sort(int[] array) {
		
		if(array.length < 2) {
			return;
		}
		
		//Divide the array into half
		int middle = array.length/2;
		
		// Left array
		int[] left = new int[middle];
		for(int i = 0; i < middle ; i++) {
			left[i] = array[i];
		}
		
		//Right array
		int[] right = new int[array.length - middle];
		for (int i = middle ; i < array.length ; i++) {
			right[i- middle] = array[i];
		}
		
		//Sort Each Half
		sort(left);
		sort(right);
		
		//Merge the result
		merge(left, right, array);
		
	}
	
	private void merge(int[] left, int[] right, int[] result) {
		int i = 0 , j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if(left[i] <= right[j])
				result[k++] = left[i++];
			else
				result[k++] = right[j++];
		}
		
		while (i < left.length)
			result[k++] = left[i++];
		
		while (j < right.length)
			result[k++] = right[j++];
	}
}


public class MergeSortExample {

	public static void main(String[] args) {
		int[] numbers = {4, 5, 2, 7, 8, 9 , 10, 20};
		MergeSort obj = new MergeSort();
		obj.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		}

}
