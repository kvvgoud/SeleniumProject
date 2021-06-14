package testNG_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_OR {
	
	@FindBy(id = "session_key")
	public WebElement LN_UN;
	
	@FindBy(id = "session_password")
	public WebElement LN_Pwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement LN_LoginButton;
	
	
	public void Logintest( String UN, String Pwd) throws Exception {
		
		LN_UN.sendKeys(UN);
		Thread.sleep(5000);
		LN_Pwd.sendKeys(Pwd);
		Thread.sleep(5000);
		LN_LoginButton.click();
		Thread.sleep(5000);
		
	}

}
