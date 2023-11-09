package pjav;

public class LargestSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12,14, 436, 437, 9423, 94, 552, 82356, 36, 94, 89 };
		
		int largest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
	        
		
		System.out.println(largest);
		System.out.println(secondLargest);
		
	}

}
