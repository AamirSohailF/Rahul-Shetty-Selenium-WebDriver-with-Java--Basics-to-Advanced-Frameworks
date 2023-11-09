package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		driver.findElement(By.xpath("(//input[@class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"])[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Kempegowda International Airport']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Lucknow']")).click();
		
		
		driver.close();
		
		
		
	}

}
