package relativelocatorsselenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameTextField = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		
		System.out.println("Height of Name textfield: " + nameTextField.getRect().getDimension().getHeight());
		System.out.println("Width of Name textfield: " + nameTextField.getRect().getDimension().getWidth());
		
	}

}
