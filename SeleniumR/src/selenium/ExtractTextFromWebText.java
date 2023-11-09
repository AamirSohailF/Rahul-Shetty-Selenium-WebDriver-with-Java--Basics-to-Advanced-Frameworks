package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractTextFromWebText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
//				Optional Step {Selenium Manager will be turned ON if not used}

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("kevin");

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.xpath("//form/p")).getText();
		
		String[] p1 = passwordText.split("'");
		
		String password = p1[1];
		return password;
	}

}
