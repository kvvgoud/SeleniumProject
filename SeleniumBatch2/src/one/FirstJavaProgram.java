package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJavaProgram {

	public static void main(String[] args) throws Exception {
		
		// Create WebDriver instance
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		// Open Chrome Browser
		driver = new ChromeDriver();
		
		// Pass Application URL
		driver.get("https://www.linkedin.com/home");
		
		Thread.sleep(5000);
		
		// Enter User name
		driver.findElement(By.id("session_key")).sendKeys("abcd@gmail.com");
		Thread.sleep(5000);
		// Enter Password
		
		driver.findElement(By.id("session_password")).sendKeys("Password");
		
		Thread.sleep(5000);
		// Click on Sign In button
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		// Click on Forgot Password link
		
		driver.findElement(By.linkText("Forgot password?")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
