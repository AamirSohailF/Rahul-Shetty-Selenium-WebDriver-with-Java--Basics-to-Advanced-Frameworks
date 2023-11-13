package pjav;

public class thisKeyword {

	
	int a = 2;		//		global variable
	
	public void getData() {
		
		int a = 3;		//		local variable
		
		System.out.println(a);		//		refers to local variable
		System.out.println(this.a);			//		refers to global variable because of this keyword usage
		System.out.println(this.a + a); 	//		if sum of global and local variable is to be printed
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeyword tk = new thisKeyword();
		tk.getData();
		
	}

}
