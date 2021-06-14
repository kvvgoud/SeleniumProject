package testNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testNG_OR.LoginPage_OR;

public class SampleTest extends Base{
	
	LoginPage_OR or = new LoginPage_OR();
	
	@Test
	public void WindowScroll_test() throws Exception {
		
		PageFactory.initElements(driver, or);
		
		driver.get("https://www.guru99.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("About Us")).click();
		//Thread.sleep(5000);
		//or.Logintest("SampleTestUser@gmail.com", "Password1234");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		//Scroll down the page up to 2000 pixels
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		
		//Scroll up the page up to 2000 pixels
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
		
		/*
		// Scroll right up to 2000 pixels
		js.executeScript("window.scrollBy(2000,0)");
		Thread.sleep(5000);
		
		// Scroll left up to 2000pixels
		js.executeScript("window.scrollBy(-2000,0)");
		Thread.sleep(5000);
		*/
	}
	
	@Test
	public void alert_test() throws Exception {
		//https://www.guru99.com/alert-popup-handling-selenium.html
		driver.get(LinkedIn_URL);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		js.executeScript("alert('It is sample Alert:');");
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
	}
	
	@Test
	public void browserCommands_test() throws Exception {
		driver.get(LinkedIn_URL);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

}
