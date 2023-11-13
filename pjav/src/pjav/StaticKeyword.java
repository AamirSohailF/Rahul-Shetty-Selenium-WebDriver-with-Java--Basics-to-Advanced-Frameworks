package pjav;

public class StaticKeyword {

	
	String name;
	String address;
	static String city = "Manchester";		//		once a variable is defined as static it means it can be utilised with any object created
	static int i = 0;		//		this variable is used in common for all objects created since it is static
	
	StaticKeyword(String name, String address){
		this.name = name;
		this.address = address;
		
	}
	
	public void getDetails() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		i++;
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticKeyword sk = new StaticKeyword("Ron", "Sky Road");
		StaticKeyword sk1 = new StaticKeyword("James", "MainLand 72");
		StaticKeyword sk2 = new StaticKeyword("Becky", "Beverly Hills");
		sk.getDetails();
		sk1.getDetails();
		sk2.getDetails();
	}

}
