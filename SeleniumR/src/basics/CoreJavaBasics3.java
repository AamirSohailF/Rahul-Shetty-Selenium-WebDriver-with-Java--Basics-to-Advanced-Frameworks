package basics;

import java.util.Iterator;

public class CoreJavaBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Define String - Method 1 - String Literal
		String s1 = "Azerbaijan Grand Prix Circuit";
		String s2 = "Azerbaijan Grand Prix Circuit";		// s2 will point to s1 since both values are exactly the same and it won't allocate new memory for s2
		
		
//		Define String - Method 2 - Using new keyword
		String s3 = new String("Miami Grand Prix Circuit");
		String s4 = new String("Miami Grand Prix Circuit");	// s4 and s3 both will create new memory in java since we are using new keyword no matter if values match exactly
		
		
//		Performing different actions on the String
		String s = "Albert Park Circuit";
		
//		Converting String to array based on spacing " "
		String [] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
//		Converting String to array based on characters
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
//		Reversing a String
		for (int i = s.length()-1; i >=0 ; i--) {
			System.out.println(s.charAt(i));
		}
		
	}

}
