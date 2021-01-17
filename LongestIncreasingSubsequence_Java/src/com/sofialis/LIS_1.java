package com.sofialis;

public class LIS_1 {
	
	public int findIncreasingSeq(int[] arr) {
		
		return findIncreasingSeq(arr, Integer.MIN_VALUE, 0);
		
	}

	public int findIncreasingSeq(int[] arr, int previous, int currentPosition) {
		/*
		 * keep making a choice of selecting a number
		 * and keep track of maximum of the choices until
		 * current position reaches the end of the array
		 *  */
		if (currentPosition == arr.length) {
			return 0;
		}
		
		int choice = 0;
		
		if (arr[currentPosition] > previous) {
			
			choice = 1 + findIncreasingSeq(arr, arr[currentPosition], currentPosition + 1);
		}
		
		int otherChoice = findIncreasingSeq(arr, previous, currentPosition + 1);
		
		/* returning the max of choice versus other choice
		 * will return the length of the longest subsequence */
		
		return Math.max(choice, otherChoice);
	}
	
	public static void main(String[] args) {
		
		LIS_1 myNums = new LIS_1();

		int[] nums = { 1, 2, 3, 4, 10, 20, 30 ,40  };
		
		System.out.println("The longest increasing subsequence in the array is: "+ myNums.findIncreasingSeq(nums));

	}
	
}


