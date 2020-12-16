package typecastingdemo;

public class TypeConversionDemoThree {
	
	public static void main(String[] args) {
//     Type conversion from Integer to String
		
//		int num = 100;
//		System.out.println("Number(int): " + num);
//		
//		String data = String.valueOf(num);
//		System.out.println("Number(String): " + data);
		
		
		
//		Type conversion from String to Integer 
		String data = "100";
		System.out.println("Number(String): " + data);
		
		int num = Integer.parseInt(data);
		System.out.println("Number(int): " + num);
		
	}

}
