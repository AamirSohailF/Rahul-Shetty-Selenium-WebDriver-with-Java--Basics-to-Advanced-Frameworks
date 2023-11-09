package java_stream;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AamirSohail\\Downloads\\Browser Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		
		//	Comparing if the Original Order of elements is same as it's Sorted Order

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");		//	Click to sort Veg/fruit name by alphabetical order
		
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));	//	Getting all elements from the Veg/fruit name column
		
		List<String> originalOrder = elementsList.stream().map(v->v.getText()).collect(Collectors.toList());	//	Fetching text of all elements from the Veg/fruit name column and storing it into a list
		
		List<String> sortedOrder = originalOrder.stream().sorted().collect(Collectors.toList());	//	Sorting all elements from the Veg/fruit name column and storing it into a list
		
		
		Assert.assertTrue(originalOrder.equals(sortedOrder));	//	Comparing if the original order matches sorted order
		
		
		
		
		//	Getting the price of a Veg/fruit after matching name is found
		
		List<String> price;
		
		do {
			elementsList = driver.findElements(By.xpath("//tr/td[1]"));		//	Defined again to avoid Stale Element Reference Exception
			price = elementsList.stream().filter(p->p.getText().contains("Orange"))
					.map(p->getPrice(p)).collect(Collectors.toList());

			price.forEach(a->System.out.println(a));

			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			
		} while (price.size()<1);
		

		
	}
	
	private static String getPrice(WebElement p) {
//		String price = p.findElement(By.xpath("../td[2]")).getText();
//		OR
		String price = p.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
