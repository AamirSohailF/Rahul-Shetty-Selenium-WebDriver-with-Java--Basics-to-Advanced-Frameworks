package TestNG;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test1 {

	@Test()
	public void TestA() {
		System.out.println("Hello");
	}
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("I'll execute before suite");
	}
	
	@AfterSuite
	public void asuite() {
		System.out.println("I'll execute after suite");
	}
	
	
	@Test(groups= {"Group1"})
	public void TestB() {
		System.out.println("Test B");
	}
	
	@BeforeMethod
	public void bmethod() {
		System.out.println("I'll execute before every method in class test1");
	}
	
	@AfterMethod
	public void amethod() {
		System.out.println("I'll execute after every method in class test1");
	}

}
