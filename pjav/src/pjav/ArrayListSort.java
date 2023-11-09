package pjav;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("mercedes");
		cars.add("redbull");
		cars.add("alfa romeo");
		cars.add("ferrari");
		cars.add("aston martin");
		
		Collections.sort(cars);
		System.out.println(cars.get(4));
	}

}
