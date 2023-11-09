package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();

		String parentWid = driver.getWindowHandle();

		Set<String> windowIds = driver.getWindowHandles();
		windowIds.remove(parentWid);

		for (String windowId : windowIds) {
			driver.switchTo().window(windowId);
			String mailText = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
			String [] mailTexts =mailText.split("at ");
			String[] mailTextss = mailTexts[1].split("with");
			String mailToGrab = mailTextss[0].trim();
//			String mail = mailToGrab;
			driver.switchTo().window(parentWid);
			driver.findElement(By.id("username")).sendKeys(mailToGrab);
			}
		
		
		
	
		
		
	}

}
