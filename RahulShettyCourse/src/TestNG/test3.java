package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	
	@Parameters({"URL"})
	@Test
	public void WebHomeLoan(String url) {
		System.out.println("Web Home Loan 3");
		System.out.println(url);
	}
	
	@BeforeTest
	public void bTest() {
		System.out.println("I will execute before test");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("I will execute after test");
	}
	
	@Test(enabled=false)
	public void MobileHomeLoan
	() {
		System.out.println("Mobile Home Loan 3");
	}
	
	@Parameters({"URL", "Password"})
	@Test(groups= {"Group1"})
	public void APIHomeLoan(String url, String pwd) {
		System.out.println("API Home Loan 3");
		System.out.println(url);
		System.out.println(pwd);
	}
	
}
