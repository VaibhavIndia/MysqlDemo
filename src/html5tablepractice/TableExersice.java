package html5tablepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers\\chrome\\cc\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22427/rsaw-vs-pakw-2nd-odi-icc-championship-match-pakistan-women-tour-of-south-africa-2019");
		System.out.println();
		WebElement table1 = driver.findElement(By.xpath("//div[@id=\"innings_1\"]/div"));
		System.out.println(table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size());
		int totalplayer = table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size() - 3;
		int totalscore = 0;
		for (int i =0 ; i<totalplayer;i++)
		{
			
		String value = table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int score1= Integer.parseInt(value);
		totalscore = totalscore + score1;
		
		}
		
		String ExtraRun = table1.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div")).getText();
		int extra = Integer.parseInt(ExtraRun);
		totalscore = totalscore + extra;
		
		
		String TotalRun = table1.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div")).getText();
		int lasttotalscore = Integer.parseInt(TotalRun);
		
		if(lasttotalscore==totalscore)
		{
			System.out.println("Scores are correct");
		}
		else
		{
			System.out.println("Something seems wrong");
		}
		
		System.out.println(ExtraRun);
		System.out.println(TotalRun);
	}

}
