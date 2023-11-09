package java_stream;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebTableUsingSeleniumJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		//	Comparing if the name passed in the searchbox have equal number of results as displayed after the filteration is done

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredList = veggies.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), filteredList.size());
		
	}

}
