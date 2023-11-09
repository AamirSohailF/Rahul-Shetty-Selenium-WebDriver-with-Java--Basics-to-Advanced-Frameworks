package oops_java_section17;

import org.testng.annotations.Test;

public class PS1 extends PS {

	int a = 3;
	
	@Test
	public void testRun() {
		PS2 ob1 = new PS2(a);
		myMethod();
		System.out.println(ob1.increment());
		System.out.println(ob1.multiplyByTen());
		System.out.println(ob1.decrement());
	}
	
	
	
	
}
