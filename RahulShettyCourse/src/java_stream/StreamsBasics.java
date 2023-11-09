package java_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//	Get names starting with "J"
		//	Method 1: Without using Streams
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jacob");
		names.add("Walter");
		names.add("Saul");
		names.add("Mike");
		names.add("Jade");
		names.add("Lewis");
		names.add("Jordan");
		names.add("Sebestian");
		names.add("Jesse");
		
		int count = 0;
		
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("J")) {
				count++;
			}
		}
		
		System.out.println("Getting count of names starting with J without using Streams: " + count);
		
		
		
		//	Get names starting with "J"
		//	Method 2: Using Streams
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("Jacob");
		names2.add("Walter");
		names2.add("Saul");
		names2.add("Mike");
		names2.add("Jade");
		names2.add("Lewis");
		names2.add("Jordan");
		names2.add("Sebestian");
		names2.add("Jesse");
		
		long count1 = names2.stream().filter(n->n.startsWith("J")).count();
		System.out.println("Getting count of names starting with J using Streams Method 1:" + count1);
		
		
		//	Get names starting with "J"
		//	Method 3: Using Streams {Most Efficient}
		
		//	ArrayList can also be defined using Stream.of like below:
		long count2 = Stream.of("Jacob", "Walter", "Saul", "Janardhan", "Mike", "Jade", "Lewis", "Jordan", "Sebestian", "Jesse")
		.filter(n->n.startsWith("J")).count();
		
		System.out.println("Getting count of names starting with J using Streams Method 2 {Most Efficient/Optimized Method}:" + count2);
		
		
		
		//	Print all names of the ArrayList having characters > 4"
		System.out.println();
		System.out.println("Printing all names from predefined ArrayList having characters greater than 4");
		names.stream().filter(n->n.length()>4).forEach(n->System.out.println(n));		//	forEach iterates over all elements after filteration is done
		
		
		System.out.println();
		System.out.println("Using limit to limit the results generated after filteration of the streams");
		names.stream().filter(n->n.length()>4).limit(2).forEach(n->System.out.println(n));	//	limit results in limiting the results after the filteration of streams is done
		
	}

}	
