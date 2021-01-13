package QueueImplementations;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueDemoOne {

	public static void main(String[] args) {
		//Queue is an interface 
		Queue<Integer> queue = new ArrayDeque<Integer>(); 
		//Dequeue: Deletion from front of the queue 
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		if(queue.isEmpty())
			System.out.println("Queue is Empty.");
		else
			System.out.println("Queue is not Empty");
		
		System.out.println("The queue elements are : " + queue);
		System.out.println("Queue Size Is : "+ queue.size());
		System.out.println("Front Element Is: " + queue.peek());
		System.out.println( "Front Value Removed : " + queue.remove());
		System.out.println("Now the queue elements are: " + queue);
		
		


	}

}
