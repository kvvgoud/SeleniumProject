package testNG_Programs;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;

	String LinkedIn_URL = "https://www.linkedin.com/home";
	String Facebook_URL = "https://www.facebook.com/";

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "D:\\geckodriver\\geckodriver.exe");
		// driver = new FirefoxDriver();

//			System.setProperty("webdriver.edge.driver","D:\\edgedriver\\msedgedriver.exe");
//			driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
