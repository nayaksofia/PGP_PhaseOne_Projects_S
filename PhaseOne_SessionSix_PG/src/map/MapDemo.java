package map;
import java.util.Map;
import java.util.HashMap;


public class MapDemo {

	public static void main(String[] args) {
		/*
		 * Map is an interface that stores the elements in Key-Value pair.
		 */
		
		/*
		 * HashMap is generally used, how data is store is dictionary format in data interface
		 */
		Map <Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(2, "kritika");
		map.put(3, "Shreya");
		map.put(4, "Gopal");
		map.put(5, "James");
		
		/* Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer , String> entry = (Map.Entry<Integer,String>)iterator.next(); //typeCasting 
			System.out.println(entry.getKey() + ":" + entry.getValue());
		} */ 
		
		//(or)
		
		// Using For Each loop , Without typeCasting 
		for (Map.Entry<Integer , String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for (Integer key : map.keySet()) {
			System.out.println(key);
		}
	    
		for(String value : map.values()) {
			System.out.println(value);
		}
	}

}
