package pjav;

public class ChildClassASuperKeyword extends ParentClassASuperKeyword{
	
	
	int a = 20;
	
	public void getData() {
		System.out.println("This method is from Child class A");
	}
	
	public void myMethod() {
		System.out.println(a);		//		prints value a from child class
		System.out.println(super.a);		//		prints value a from parent class because of the usage of super keyword
		getData();		//		prints the value of getData() method from child class
		super.getData();		//		prints the value of getData() method from parent class because of the usage of super keyword
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassASuperKeyword c = new ChildClassASuperKeyword();
		c.myMethod();
		
	}

}
