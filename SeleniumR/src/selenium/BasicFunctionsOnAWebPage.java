package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctionsOnAWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("aamir sohail");
		driver.findElement(By.name("inputPassword")).sendKeys("12323");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.cssSelector("p[class='error']")).getText();
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("jack");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jack@gyq.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		System.out.println("Pass");
		
//		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		
		
//		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("aamir");
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
	}

}
