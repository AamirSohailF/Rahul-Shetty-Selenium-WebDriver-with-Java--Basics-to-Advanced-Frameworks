package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Chrome Execution
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		Edge Execution
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/msedge.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
