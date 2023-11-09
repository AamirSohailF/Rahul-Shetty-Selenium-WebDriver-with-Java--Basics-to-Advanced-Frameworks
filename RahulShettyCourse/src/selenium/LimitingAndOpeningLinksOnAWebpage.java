package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LimitingAndOpeningLinksOnAWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("http://qaclickacademy.com/practice.php");
		
		// Getting total number of links on a webpage
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// Getting total number of links in the footer of a webpage
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		// Getting total number of links in one column of the footer of a webpage
		
		WebElement footerColumn = footerdriver.findElement(By.xpath("(//div/table/tbody/tr/td/ul)[1]"));
		
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		
		
	}

}
