package pjav;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("Canada");
		hs.add("Canada");
		hs.add("Australia");
		hs.add("New Zealand");
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
