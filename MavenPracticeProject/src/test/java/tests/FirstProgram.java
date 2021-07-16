package tests;
	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
	 
	}