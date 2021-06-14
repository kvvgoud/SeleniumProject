package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginPage {

	public static void main(String[] args) throws Exception {
		
		// Create WebDriver instance
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		// Open Chrome Browser
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Password");
		
		WebElement FB_UN = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement FB_Pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		FB_UN.sendKeys("abcd@gmail.com");
		FB_Pwd.sendKeys("SamplePassword");
		LoginButton.click();
		
		//driver.findElement(By.id("u_0_h_U4")).click();
		//driver.findElement(By.name("login")).click();
	
		Thread.sleep(5000);
		System.out.println("\n Login button clicked: ");
		
		driver.quit();
		
		//List<WebElement> No = driver.findElements(By.tagName("button"));
		
		//System.out.println("Number Of Buttons = " + No.size());
		
		//driver.quit();
	}

}
