package relativelocatorsselenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		//	Getting Name text above name textfield
		WebElement nameTextField = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextField)).getText());
		
		
		//	Clicking the next input tagName below Date of Birth
		WebElement dateOfBirth = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();	//	Submit button will be recognized and not the date of birth textfield 
																						//	because it has a 'flex' in HTML which is not supported in Selenium 4
		
		
		//	Clicking the checkbox to the left of the textfield 'Check me out if you Love IceCreams!'
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		
		
		//	Getting text to the right of the radio button
		WebElement radioButton1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton1)).getText());
		
	}

}
