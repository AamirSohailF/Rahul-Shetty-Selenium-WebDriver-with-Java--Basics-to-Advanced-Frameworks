package basics;

import java.util.ArrayList;
import java.util.Iterator;

public class CoreJavaBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 10;
		String website = "www.netflix.com";
		char a ='r';
		double dec = 5.99;
		boolean value = false;
		
		
		System.out.println(num + " is the number stored");
		System.out.println(website);
		System.out.println(a);
		System.out.println(dec);
		System.out.println(value);
		
//		Array
//		Defining array - Type 1
		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 12;
		
		System.out.println(arr[3]);
		
		
//		Defining array - Type 2
		int [] arr1 = {1, 2 ,4, 10, 12, 40, 9, 92};
		
		System.out.println(arr1[4]);
		
		
//		Looping through an array of int
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
//		Multiples of 2 from the array
		System.out.println("Multiples of 2 from the array-------------------");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println(arr1[i]);
			}
		}
		
		
		
		
//		String Array
		String [] name = {"Lewis Hamilton", "Pierre Gasly", "Checko Perez", "Daniel Riccardo", "Charles Leclerc", "Carlos Sainz", "Lando Norris"};

		System.out.println("Simplified For Loop result-------------------");
//		Looping through an array of String
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		System.out.println();
		System.out.println("Enhanced For Loop result-------------------");
		
//		Enhanced For Loop
		for (String s : name) {
			System.out.println(s);
		}
		
		
//		ArrayLists
		ArrayList<String> n = new ArrayList<String>();
		n.add("Google");
		n.add("Netflix");
		n.add("Amazon");
		n.add("Hotstar");
		n.remove(3);
		System.out.println(n.get(2));
		
		
		System.out.println();
		System.out.println("ArrayList Iteration using Simplified For Loop ---------------------");
		for (int i = 0; i < n.size(); i++) {
			System.out.println(n.get(i));
		}
		
		
		System.out.println();
		System.out.println("ArrayList Iteration using Enhanced For Loop ---------------------");
		for (String val : n) {
			System.out.println(val);
		}
		
		
		
	}

}
