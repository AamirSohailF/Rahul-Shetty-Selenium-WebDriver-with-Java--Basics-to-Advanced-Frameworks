package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GreenKartAddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		//	Using Implicit Timeout
		
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));		//		Explicit Timeout new Syntax
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		int j=0;
		
		List<WebElement> veggies = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		String [] itemsToFind = {"Cucumber", "Carrot", "Brocolli"};
		
		List<String> items = Arrays.asList(itemsToFind);
		
		
		for (int i = 0; i < veggies.size(); i++) {
			String[] vegetable = veggies.get(i).getText().split("-");
			String formattedVeggie = vegetable[0].trim();
			
			
			if (items.contains(formattedVeggie)) {
				
				j++;
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if (j==itemsToFind.length) {
					break;
				}
				
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));		//	Using Explicit Timeout

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

}
