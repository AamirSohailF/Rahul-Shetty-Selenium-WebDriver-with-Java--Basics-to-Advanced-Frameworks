package java_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(3, 2, 6, 1, 5, 6, 9, 4, 8, 0, 5, 3, 8);
		List<Integer> sortedDistinctnums = nums.stream().distinct().sorted().collect(Collectors.toList());	//	Storing sorted distinct numbers from Stream to List
		System.out.println(sortedDistinctnums.get(3));
	}

}
