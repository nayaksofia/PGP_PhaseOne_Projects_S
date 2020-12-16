package regexdemo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
// 1st Way:
//		System.out.println(pattern.matches(".s" , "as"));
//		System.out.println(pattern.matches(".s" , "ad"));
		
// 2nd Way
//		Pattern p = Pattern.compile(".s");
//		Matcher m = p.matcher ("as");
//		boolean result = m.matches();
//		System.out.println(result);

// 3rd Way 
		boolean result = Pattern.compile(".s").matcher("as").matches();
		System.out.println(result);
		

	}

}
