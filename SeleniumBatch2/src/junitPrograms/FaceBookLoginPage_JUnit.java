package junitPrograms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FaceBookLoginPage_JUnit extends Base{

@Test
public void test1() throws Exception {
		
		driver.get("https://www.facebook.com/");
		
		WebElement FB_UN = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement FB_Pwd = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		FB_UN.sendKeys("abcd@gmail.com");
		FB_Pwd.sendKeys("SamplePassword");
		LoginButton.click();
		
		Thread.sleep(5000);
		System.out.println("\n Login button clicked: ");
		
		//List<WebElement> No = driver.findElements(By.tagName("button"));
		
		//System.out.println("Number Of Buttons = " + No.size());
		
	}

}
