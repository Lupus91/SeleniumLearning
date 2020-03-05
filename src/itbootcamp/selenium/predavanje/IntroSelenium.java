package itbootcamp.selenium.predavanje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wolf\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // navigate and menage interface su nam bitni
		
		driver.get("https://google.com");
		
		driver.navigate().to("https://www.youtube.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.findElement(By.id("search")).sendKeys("Drzavni posao");
		driver.findElement(By.id("search-icon-legacy")).click(); // ==  driver.findElement(By.id("search")).sendKeys(Keys.ENTER)
		
		
		
		
	}

}
