package html5tablepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\cc\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		int rowcount = table.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int columncount = (table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
		System.out.println(columncount);
		WebElement secondElemet = table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
		for(int i =1; i<=columncount;i++)
		{
			String s = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td["+i+"]")).getText();
			System.out.println(s);
		}
	}

}
