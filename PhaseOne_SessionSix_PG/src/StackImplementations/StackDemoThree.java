package StackImplementations;
import java.util.Stack;

/*
 * Reversing a String Using Stack 
 */
class StringReverser{
	public String reverse(String input) {

		Stack<Character> stack = new Stack<Character>();

		/*Type:1
		 * 
		  for (int i = 0; i< input.length(); i++) {
			stack.push(input.charAt(i));
		 }

		 */	

		for (char ch : input.toCharArray() ) {
			stack.push(ch);
		}

		String reversed = "" ;
		while(!stack.empty()) {
			reversed += stack.pop();
		}
		return reversed.toString();  //String needs to be type casting 
	}
}
public class StackDemoThree {

	public static void main(String[] args) {

		String str_value = "abcd";
		StringReverser obj = new StringReverser();
		System.out.println("Reversed String: " + obj.reverse(str_value));

	}

}
