package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("button1")).click();
		}
		
		action.keyUp(Keys.CONTROL);
		
		Set<String> windowIDs = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		windowIDs.remove(parentWindow);
		
		for (String windowid : windowIDs) {
			driver.switchTo().window(windowid);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
			
		}
		
		driver.quit();
		
		
	}
	
	
}
