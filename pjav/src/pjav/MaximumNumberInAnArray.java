package pjav;

public class MaximumNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 4, 4, 8 }, { 6, 3, 14 }, { 5, 24, 8 } };

		int max = a[0][0];
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
			}
		}
		
		System.out.println(max);

	}

}
