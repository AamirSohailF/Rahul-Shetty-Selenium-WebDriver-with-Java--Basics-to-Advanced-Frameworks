package pjav;

public class FindMinimumNumberInArrayAndThenMaximumNumberInThatColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the minimum number in an array and then find the maximum number in the
		// column of that minimum number

		int a[][] = { { 4, 8, 7 }, { 2, 3, 5 }, { 10, 7, 8 } };

		int min = a[0][0];
		int minimumCol = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minimumCol = j;
				}
			}
		}
		
		int max = a[0][minimumCol];
		int k = 0;
		while (k<3) {
			if (a[k][minimumCol]>max) {
				max = a[k][minimumCol];
			}
			k++;
		}
		
		System.out.println(max);

	}

}
