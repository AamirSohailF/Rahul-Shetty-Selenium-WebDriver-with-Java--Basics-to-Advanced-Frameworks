package basics;

public class MethodClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodClass1 o = new MethodClass1();
		o.celeb();
		String n = o.celebs();
		System.out.println(n);
		
		MethodsClass2 w = new MethodsClass2();
		w.favs();
		
		footballers();
	}

	
	public void celeb() {
		System.out.println("Dwayne Johnson");
		
	}
	
	
	public String celebs() {
		System.out.println("Dwayne Johnson");
		System.out.println("Lewis Hamilton");
		return "Lando Norris";
		
	}
	
	public static void footballers() {
		System.out.println("Bruno Fernandez");
		System.out.println("Kevin de Bruyne");
		System.out.println("Harry Kane");
	}
}
