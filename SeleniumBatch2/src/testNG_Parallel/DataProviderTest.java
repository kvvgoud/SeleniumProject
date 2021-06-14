package testNG_Parallel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG_OR.Facebook_OR;

public class DataProviderTest extends BaseParallel {
	
	Facebook_OR or = new Facebook_OR();

	@Test(dataProvider = "DP_test")
	public void Dataprovider_Test(String Username, String Password) throws Exception {

		driver.get(Facebook_URL);
		Thread.sleep(5000);
		PageFactory.initElements(driver, or);

		or.FB_UN.clear();
		or.FB_UN.sendKeys(Username);
		or.FB_Pwd.clear();
		or.FB_Pwd.sendKeys(Password);

		or.FB_LoginButton.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	@DataProvider(name = "DP_test")
	public Object[][] getData(){
		return new Object[][] 
		    	{
		            { "Guru99", "India" },
		            { "Krishna", "UK" },
		            { "Bhupesh", "USA" }
		        };
	}

}
