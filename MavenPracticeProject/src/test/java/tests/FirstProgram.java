package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstProgram {

	WebDriver driver;

	@Test
	public void openMyBlog() throws Exception {
		driver.get("https://www.softwaretestingmaterial.com/");
		Thread.sleep(6000);
	}

	@BeforeClass
	public void beforeClass() {

		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
//		  WebDriverManager.firefoxdriver().setup();
//		  driver = new FirefoxDriver();

//		WebDriverManager.operadriver().setup();
//		driver = new OperaDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

}