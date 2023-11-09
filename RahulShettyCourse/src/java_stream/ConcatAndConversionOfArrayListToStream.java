package java_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatAndConversionOfArrayListToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Concatenating 2 Streams
		System.out.println("Concatenating 2 Streams and finding matching elements from it:");
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Steve");
		names1.add("Robert");
		names1.add("Fowler");
		
		
		List<String> names2 = Arrays.asList("Novak Djokovic", "Lewis Hamilton", "Roger Federer", "Ivan Perisic",  "Ranbir Kapoor", "Jesse Pinkman",
				"Charles Leclerc", "Allison Becker", "James Henderson");
		
		Stream<String> concatStream = Stream.concat(names1.stream(), names2.stream());		//	concats 2 streams
		concatStream.sorted().forEach(n->System.out.println(n));
		
		System.out.println();
		
		//	Converting Stream to List/ArrayList
		System.out.println("Converting Stream to List/ArrayList:");
		List<String> names3 = Arrays.asList("Lewis", "Novak", "Ivan",
				"Charles", "Naggel", "Klopp", "Newy", "Wolff");
		List<String> streamList = names3.stream().filter(n->n.startsWith("N")).collect(Collectors.toList());
		System.out.println(streamList.get(1));	// Getting the 2nd element from the List converted from Stream
		
	}

}
