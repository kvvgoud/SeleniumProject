package junitPrograms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewJUnitClass extends Base{
	
	@Test
	public void FB_test() throws Exception {
		
		driver.get("https://www.facebook.com/");
		
		WebElement FB_UN = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement FB_Pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		FB_UN.sendKeys("abcd@gmail.com");
		FB_Pwd.sendKeys("SamplePassword");
		LoginButton.click();
		Thread.sleep(6000);
	}
	
	@Test
	public void LI_test() throws Exception {

		driver.get("https://www.linkedin.com/home");
		Thread.sleep(5000);
		// Enter User name
		driver.findElement(By.id("session_key")).sendKeys("abcd@gmail.com");
		Thread.sleep(5000);
		// Enter Password
		driver.findElement(By.id("session_password")).sendKeys("Password");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void guru99test() throws Exception {
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		Thread.sleep(5000);
	}

}
