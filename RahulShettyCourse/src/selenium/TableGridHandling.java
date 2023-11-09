package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableGridHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Sum the total of all the values present in the Amount Column
		
		
		List<WebElement> tableValues = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"));
		
		int total = 0;
		
		for (WebElement value : tableValues) {
			int fetchedValue = Integer.parseInt(value.getText());
			total = total + fetchedValue;
		}
		
		System.out.println("Total of all the table values is: " + total);
		
		
		// Check if the total of all the values is equal to the Total Amount Collected displayed on the webpage
		
		String amountString = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		String []amountArray = amountString.split(": ");
		System.out.println("Amount fetched from the table: " + amountArray[1]);
		
//		int amountDisplayed = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());
		
		int amountFetched = Integer.parseInt(amountArray[1]);		//	Converting String to integer
		
//		if (v == amountFetched) {
//			System.out.println("Values are equal");
//		}	
//		else {
//			System.out.println("Values aren't equal");
//		}
		
		Assert.assertEquals(total, amountFetched);
		
		
		driver.close();
	}

}
