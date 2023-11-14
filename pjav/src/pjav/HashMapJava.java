package pjav;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "United States");
		hm.put(1, "Canada");
		hm.put(2, "France");
		hm.put(21, "England");
		hm.put(80, "Spain");
		hm.put(4, "England");
		hm.put(98, "Germany");
		hm.put(55, "Switzerland");
		hm.put(109, "Australia");
		hm.remove(80);
		System.out.println(hm.get(21));
		System.out.println(hm.get(1));
		System.out.println(hm.get(80));
		System.out.println(hm.get(4));
		System.out.println(hm.get(55));
		
		System.out.println("----------------------");

		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
