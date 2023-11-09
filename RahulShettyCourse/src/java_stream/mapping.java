package java_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//	Mapping is the process of manipulation of streams as per the requirement

		//	Mapping - Changing all names ending with 'n' to Uppercase
		System.out.println("Uppercasing all names ending with 'n': ");
		Stream.of("Novak Djokovic", "Lewis Hamilton", "Roger Federer", "Ivan Perisic",  "Ranbir Kapoor", "Jesse Pinkman",
				"Charles Leclerc", "Allison Becker", "James Henderson").filter(n -> n.endsWith("n"))
				.map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

		
		System.out.println();
		
		
		//	Mapping - Changing all names ending with 'c' to lowercase
		System.out.println("Lowercasing all names ending with 'c': ");
		Stream.of("Novak Djokovic", "Lewis Hamilton", "Roger Federer", "Ivan Perisic",  "Ranbir Kapoor", "Jesse Pinkman",
				"Charles Leclerc", "Allison Becker", "James Henderson").filter(n->n.endsWith("c"))
				.map(n->n.toLowerCase()).forEach(n->System.out.println(n));
		
		
		System.out.println();
		
		
		//	Mapping - Applying sort in all names and then sorting them
		System.out.println("Sorting names: ");
		Stream.of("Novak Djokovic", "Lewis Hamilton", "Roger Federer", "Ivan Perisic",  "Ranbir Kapoor", "Jesse Pinkman",
				"Charles Leclerc", "Allison Becker", "James Henderson").sorted()
				.forEach(n->System.out.println(n));		//	sorted will sort elements of stream based alphabetically
		
		
		
		
	}

}
