package selNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\HP\\eclipse-workspace\\selNew\\webDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("naveen");
		WebElement value = driver.findElement(By.name("pass"));
		value.sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		
					
	}
}
	
	
	

