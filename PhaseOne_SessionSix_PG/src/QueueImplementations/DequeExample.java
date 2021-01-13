package QueueImplementations;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		/**
		 * Deque: An Interface for linear collection
		 * Deque: Double Ended Queue
		 * Deque: Extends queue interface
		 */
		
		//Creating Deque Interface 
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Kartik");
		deque.add("John");
		deque.add("Smith");
		deque.offerFirst("Sofia");
		
		for(String str : deque) {
			System.out.println(str);
		}
		System.out.println("------------------------------------");
		//deque.poll(); //poll and pollFirst removes the element from front
		//deque.pollFirst(); 
		deque.pollLast(); //pollLast remove the element from the last.
		for(String str : deque) {
			System.out.println(str);
		}
		}	

}
