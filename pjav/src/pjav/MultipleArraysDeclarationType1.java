package pjav;

public class MultipleArraysDeclarationType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] [] = new int [2][3];
		
		a[0][0] = 17;
		a[0][1] = 48;
		a[0][2] = 8;
		a[1][0] = 92;
		a[1][1] = 39;
		a[1][2] = 4;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}

}
