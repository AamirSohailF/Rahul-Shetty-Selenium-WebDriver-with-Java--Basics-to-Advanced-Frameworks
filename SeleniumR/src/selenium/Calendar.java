package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		
		String month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
		
		while (!month.contains("June ")) {
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
			Thread.sleep(2000);
		}
		
//		Thread.sleep(15000);
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dayContainer']/span[contains(@class, 'flatpickr-day ')]"));
		
		for (int i = 0; i < dates.size(); i++) {
			if (dates.get(i).getText().equals("23")) {
				dates.get(i).click();
			}
		}
		
		
		
	}

}
