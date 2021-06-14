package testNG_Programs;

import org.testng.annotations.Test;
import testNG_OR.LoginPage_OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FirstTestNGProg extends Base{
	
	LoginPage_OR lnor = new LoginPage_OR();
	
  @Test ( priority = 1)
  public void Linkedin_test() throws Exception {
	  
	  PageFactory.initElements(driver, lnor);
	  
	  	driver.get(LinkedIn_URL);
	  	Thread.sleep(5000);
	  	lnor.Logintest("Sample@gmail.com", "Password");
		
	  	/*
	  	WebDriverWait  wait = new WebDriverWait(driver, 20); 
	  	
	  	wait.until(ExpectedConditions.visibilityOf(lnor.LN_UN));
	  	
	  	lnor.LN_UN.sendKeys("abcd@gmail.com");
	  	
	  	lnor.LN_Pwd.sendKeys("Password123");
	  	lnor.LN_LoginButton.click();
	  	*/
	  	
		
  }
  
 // @Test ( priority = 2 )
	public void Fb_test() throws Exception {
		
		driver.get("https://www.facebook.com/");
		
		WebElement FB_UN = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement FB_Pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		FB_UN.sendKeys("abcd@gmail.com");
		FB_Pwd.sendKeys("SamplePassword");
		LoginButton.click();
		Thread.sleep(6000);
	}

}
