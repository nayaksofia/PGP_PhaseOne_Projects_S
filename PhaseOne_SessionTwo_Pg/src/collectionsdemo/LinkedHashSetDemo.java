package collectionsdemo;
import java.util.LinkedHashSet;
//import java.util.*; 

public class LinkedHashSetDemo {

	//no random order output 
	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		set.add("Core java");
		set.add("Advance Java");
		
		set.add("Core java");
		set.add(null);
		set.add(null);
		
		System.out.println("Size is: " + set.size());
        System.out.println(set);

	}

}
