package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test4 {

	@Test(timeOut=5000)
	public void WebCarLoan() {
		System.out.println("Web Car Loan 4");
	}
	
	@Test(groups= {"Group1"})
	public void MobileCarLoan() {
		System.out.println("Mobile Car Loan 4");
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("Before Class 4");
	}
	
	@AfterClass
	public void aclass() {
		System.out.println("After Class 4");
	}
	
	@Test
	public void APICarLoan() {
		System.out.println("API Car Loan 4");
	}
}
