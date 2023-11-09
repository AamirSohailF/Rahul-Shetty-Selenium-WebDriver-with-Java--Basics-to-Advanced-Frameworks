package udemycourse_rs.SeleniumFrameworkDesign;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.id("login")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@class, 'mb-3')]")));
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(@class, 'mb-3')]"));
		
		WebElement prod = products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("adidas original")).findFirst().orElse(null);
		prod.findElement(By.xpath("//*[text()=' Add To Cart']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("#toast-container")));
//		prod.findElement(By.xpath("//button[text()=' Add To Cart']")).click();
	}

}
