package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = "Bruno";
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		System.out.println(alert.getText());
		alert.dismiss();
		
		
	}

}
