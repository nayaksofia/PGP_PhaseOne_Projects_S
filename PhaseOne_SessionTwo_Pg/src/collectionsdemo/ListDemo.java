package collectionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("King");
		list.add(1,"Nayak");
		list.add("John");
		list.add("Smith");
		//list.remove(0);
		
		 System.out.println("------------------------");
			
			for (String name: list ) {
				System.out.println(name);
			}
		
		 list.add("Sofia");
		 list.add("Radhika");
		 list.add("Govinda");
		 list.add("Krishna");
		 list.add("Laxmi");
         System.out.println("--------------------------");

		Iterator<String> iter = list.iterator();
	     while(iter.hasNext()) {
			System.out.println(iter.next());
         }
		
		System.out.println("Size of ArrayList: " + list.size());
		
		if(list.contains("Sofia")) {
			System.out.println("Your Name Exists");
		}else {
			System.out.println("Your Name Does Not Exist");
		}
		
	  list.clear();
		
	}
	
}
		


