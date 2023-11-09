package pjav;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sakkett";
		
		int count = 0 ;
		
		char [] chars = str.toCharArray();
		
		int i;
		int j;
		
		for (i = 0; i < str.length(); i++) {
			for (j = i+1; j < str.length(); j++) {
				if (chars[i]==chars[j]) {
					System.out.println(chars[j]);
					count++;
					
				}
			}
		}
		System.out.println(count);
		
	}

}
