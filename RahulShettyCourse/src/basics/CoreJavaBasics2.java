package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> f1 = new ArrayList<String>();
		f1.add("Daniel Riccardo");
		f1.add("Sergio Perez");
		f1.add("Max Verstappen");
		f1.add("Lewis Hamilton");
		f1.add("Carlos Sainz");
		f1.add("Charles Leclerc");
		f1.add("Valteri Bottas");
		
//		Check if a value is present in an ArrayList
		System.out.println(f1.contains("Lewis Hamilton"));
		
		
		
//		Converting Array to ArrayList and checking if a value is present in an array
		String [] fav = {"Carlos Sainz", "Lewis Hamilton", "Toto Wolff", "Valteri Bottas"};
		List<String> f1Drivers = Arrays.asList(fav);
		System.out.println(f1Drivers.contains("Toto Wolff"));
		
		
		
		
	}

}
