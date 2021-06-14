package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session250521_LInks {

	public static void main(String[] args) throws Exception {

		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Cancel")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
