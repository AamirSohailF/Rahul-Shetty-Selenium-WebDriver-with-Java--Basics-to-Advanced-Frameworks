package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;



public class VariableUsageInWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "kevin";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello " + name + ",");

		
		
	}

}
