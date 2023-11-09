package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWhileLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://spicejet.com");
		
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")).click();
		Thread.sleep(2000);
		//div[@data-testid='Adult-testID-plus-one-cta']
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText());
		
		int i = 1;
		while (i<5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
			
			
		}
//		for (int i = 1; i < 5; i++) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//		}
		
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText());
		
		driver.close();
	}

}
