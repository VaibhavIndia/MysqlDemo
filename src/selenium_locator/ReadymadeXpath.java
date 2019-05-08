package selenium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadymadeXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("abczxc");
		driver.findElement(By.xpath("//*[@value=\'Log In\']")).click();
		
	}

}
