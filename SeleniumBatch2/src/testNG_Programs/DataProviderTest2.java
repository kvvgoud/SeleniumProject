package testNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG_OR.Facebook_OR;

public class DataProviderTest2 extends Base {

	Facebook_OR or = new Facebook_OR();

	@Test 
	public void Dataprovider_Test() throws Exception {

		driver.get("https://www.facebook.com");
		Thread.sleep(5000);

		PageFactory.initElements(driver, or);

		// Scenario#1: INVALID UN, INVALID Password.
		or.FB_UN.clear();
		or.FB_UN.sendKeys("INVALID Username");
		or.FB_Pwd.clear();
		or.FB_Pwd.sendKeys("INVALID Password");

		or.FB_LoginButton.click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		// Scenario#2: VALID UN, INVALID Password.
		or.FB_UN.clear();
		or.FB_UN.sendKeys("VALID Username");
		or.FB_Pwd.clear();
		or.FB_Pwd.sendKeys("INVALID Password");

		or.FB_LoginButton.click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		// Scenario#3: INVALID UN, VALID Password.
		or.FB_UN.clear();
		or.FB_UN.sendKeys("INVALID Username");
		or.FB_Pwd.clear();
		or.FB_Pwd.sendKeys("VALID Password");

		or.FB_LoginButton.click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		// Scenario#4: VALID UN, VALID Password.
		or.FB_UN.clear();
		or.FB_UN.sendKeys("VALID Username");
		or.FB_Pwd.clear();
		or.FB_Pwd.sendKeys("VALID Password");

		or.FB_LoginButton.click();
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

	}

}
