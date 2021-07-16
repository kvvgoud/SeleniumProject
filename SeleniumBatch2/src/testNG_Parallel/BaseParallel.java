package testNG_Parallel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseParallel {
	
	public static WebDriver driver; 
	
	String LinkedIn_URL = "https://www.linkedin.com/home";
	String Facebook_URL = "https://www.facebook.com/";
	
	@BeforeTest
	@Parameters("browser")
	  public void beforeTest(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  }

	  @AfterTest(alwaysRun = true)
	  public void afterTest() {
		  //driver.close();
		  driver.quit();
	  }

}
