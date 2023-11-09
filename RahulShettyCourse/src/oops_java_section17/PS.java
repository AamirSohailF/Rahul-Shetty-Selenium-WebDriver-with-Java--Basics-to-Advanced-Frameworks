package oops_java_section17;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PS {
	
	
	public void myMethod() {
		System.out.println("This is a method from PS class");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("This is a before test step");
	}
	
	@AfterTest
	public void at() {
		System.out.println("This is a after test step");
	}
}
