package testNG_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook_OR {
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement FB_UN;  // = driver.findElement(By.xpath("//input[@type='text']"));
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement FB_Pwd;     //  = driver.findElement(By.xpath("//input[@type='password']"));
	
	@FindBy(xpath = "//button[text()='Log In']")
	public WebElement FB_LoginButton; // = driver.findElement(By.xpath("//button[text()='Log In']"));

}
