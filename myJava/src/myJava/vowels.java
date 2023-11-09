package myJava;

public class vowels {

	public static void main(String[] args) {
		java.lang.String s = "Hello";

		if (s.toLowerCase().matches(".*[aeiou]")) {
			System.out.println("Vowel present");
		} else {
			System.out.println("Vowel not present");
		}
	}

}
