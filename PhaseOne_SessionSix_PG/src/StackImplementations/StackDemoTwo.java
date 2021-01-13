package StackImplementations;

/* Stack is a implementation
 * Stack used array or linked list for memory allocate 
 * 
 */
class Stack {
	
	// properties 
	int top;
	int maxSize = 5;
	int[] stack_array = new int[maxSize];
	
	public Stack() {  //Constructor
		this.top = -1; //Means stack is empty
	}
	
	public void push(int item) {
		if(top == maxSize-1) {
			System.out.println("Stack Overflow!!!");
			return;
		} else {
			top++ ;
			stack_array[top] = item;
			return;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack UnderFlow!!!");
			return;
		} else {
			System.out.println("Item Popped Out is : " + stack_array[top--]); //the element that present on that index (n-1)
			return;
		}
	}
	
	public void display() {
		System.out.println("Printing Stack Elements");
		for(int i = top; i >= 0 ; i--) {
			System.out.println(stack_array[i]);
		}
	}
	
	
}

public class StackDemoTwo {

	public static void main(String[] args) {
		Stack stack = new Stack(); //Instantiate 
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		stack.pop();
		
	}

}
