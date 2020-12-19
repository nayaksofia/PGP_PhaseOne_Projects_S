package optionalKeyword;

import java.util.Optional;

public class OptionalDemoOne {

	public static void main(String[] args) {

		/*
		 * Optional is introduced in Java8.
		 * Optional help us to deal with NullPointerException in Java.
		 * 
		 */


		//Demo-1:
		/*
		 String[] names = new String[5];
		System.out.println(names[3]);
		String modifiedName = names[3].toUpperCase();
		System.out.println(modifiedName);
		 */


		//Demo-2:
		/*
	   String[] names = new String[5];
       names[3] = "King Kochhar";
       Optional<String> checkNullValues = Optional.ofNullable(names[3]);
       if(checkNullValues.isPresent()) {
    	   String modifiedName = names[3].toUpperCase();
    	   System.out.println(modifiedName);
       } else {
    	   System.out.println("Value is not present or null");
       }

		 */


		//Demo:3

		/*
        String[] names = new String[5];
	    names[3] = "King Kochar";
	    Optional<String> checkNullValues = Optional.ofNullable(names[3]);
	    checkNullValues.ifPresent(System.out::println);
		 */

		String name = null; //Assigned name ="Nayak" too 
		String modifiedName = Optional.ofNullable(name).orElseGet(()-> "Sofia");
		System.out.println(modifiedName);

	}

}
