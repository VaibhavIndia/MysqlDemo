package selenium_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in anchor tab
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten account?")).click();;

	}

}
