package relativelocatorsselenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebelementPartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//	Taking screenshot of the name textfield after the data has been entered
		
		WebElement nameTextField = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		nameTextField.sendKeys("Core java for Automation Testers + Interview Programs");
		
		File file= nameTextField.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("name.png"));
		
	}

}
