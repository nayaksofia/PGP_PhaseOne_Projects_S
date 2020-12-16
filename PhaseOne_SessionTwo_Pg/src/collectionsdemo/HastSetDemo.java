package collectionsdemo;
import java.util.HashSet;

public class HastSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("Core java");
		set.add("Advance Java");
		
		set.add("Core java");
		set.add(null);
		set.add(null);
		
		System.out.println("Size is: " + set.size());
        System.out.println(set);
	}

}

