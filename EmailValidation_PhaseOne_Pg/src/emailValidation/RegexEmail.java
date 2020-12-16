package emailValidation;

//import packages
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexEmail {
	
	// Regular Expression:
	// private static final String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
	//A-Z characters, a-z characters, 0-9 digits,Underscore(_), dash(-), and dot(.) are permitted, Other characters are not permitted
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	public static void main(String[] args) {
	
		 //adding  email to an array list
		
	       ArrayList<String> emails = new ArrayList<String>();
	       
	      // valid email addresses
	       emails.add("sofia@gmail.com");
	       emails.add("nayak.sofi@ex.co.in");
	       emails.add("sofi1@example.do.org");
	       emails.add("shagun_sofi@example.com");
	       emails.add("sofi-sh@example.com");
	       
	       
	       //invalid email addresses
	       emails.add("@gmail.com");
	       emails.add("shagun&ag.com");
	       emails.add("raghu#@example.us.org");

	       //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);

	       //searching for occurrences of regex
	       for (String value : emails) {
	        Matcher matcher = pattern.matcher(value);
	        System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
	        System.out.println("-----------------------------------------------------");
	        
//	    	boolean result = Pattern.compile(regex).matcher(value).matches();
//	    	System.out.println(result);
	       }

	}

}
