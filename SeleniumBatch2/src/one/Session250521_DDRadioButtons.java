package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Session250521_DDRadioButtons {

	public static void main(String[] args) throws Exception {

		WebDriver driver; 
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
		//driver = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver", "D:\\edgedriver\\msedgedriver.exe");
		//driver = new EdgeDriver();
		System.setProperty("webdriver.opera.driver", "D:\\operadriver\\operadriver.exe");
		driver = new OperaDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("FirstName");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("LastName");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("Emailid@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password1234");
		Thread.sleep(5000);
		
		// Select Values from DOB drop downs:
		
		Select dd_day = new Select(driver.findElement(By.id("day")));
		//dd_day.selectByIndex(21);
		//dd_day.selectByValue("15");
		dd_day.selectByVisibleText("15");
		Thread.sleep(5000);
		
		Select dd_month = new Select(driver.findElement(By.id("month")));
		dd_month.selectByValue("3");
		Thread.sleep(5000);
		
		Select dd_year = new Select(driver.findElement(By.id("year")));
		dd_year.selectByValue("1991");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
