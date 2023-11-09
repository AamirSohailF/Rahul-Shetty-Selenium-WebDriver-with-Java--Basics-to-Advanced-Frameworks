package relativelocatorsselenium4;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleWindowsOrTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");	//	Parent Window/Tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rahulshettyacademy.com/");	//	Child Window/Tab
		
		Set<String> windowHandles = driver.getWindowHandles();

		
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		
		driver.switchTo().window(childWindow);
		String course = driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/p/core-java-for-automation-testers-interview-programs'])[2]")).getText();
					//	Fetching the 1st course name from the page of the child window/tab -- "https://rahulshettyacademy.com/angularpractice/"
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys(course);
					//	Pasting the fetched course name from child window/tab -- "https://rahulshettyacademy.com/angularpractice/" -- in the Name textfield of the parent window/tab -- "https://rahulshettyacademy.com/angularpractice/"
		
	}

}
