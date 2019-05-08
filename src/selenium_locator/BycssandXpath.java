package selenium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BycssandXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("TEst");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		Thread.sleep(3000);
		String str = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(str);

	}

}
