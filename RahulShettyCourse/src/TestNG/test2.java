package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

	@Parameters({"URL", "Password"})
	@Test
	public void TestC(String url, String pwd) {
		System.out.println("Ciao!");
		System.out.println(url);
		System.out.println(pwd);
	}
	
	@Test(dataProvider="getData")
	public void TestD(String un, String pw) {
		System.out.println("Running Test with 3 set of data");
		System.out.println(un);
		System.out.println(pw);
	}
	
	@DataProvider
	public Object getData() {
		
		Object[][] data = new Object[3][2];
		
		// 1st set of data
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		// 2nd set of data
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		// 3rd set of data
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
	}
	
}
