package  one;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadLessBrowserTest {				
		public static void main(String[] args) {
                     // Creating a new instance of the HTML unit driver
			WebDriver driver;
                     //WebDriver driver = new HtmlUnitDriver();
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
                      
           		     // Navigate to Google		
                     driver.get("http://www.google.com");					
          
					 // Locate the searchbox using its name		
                     WebElement element = driver.findElement(By.name("q"));	
                     
                    // Enter a search query		
                    element.sendKeys("Guru99");	
                   
		            // Submit the query. Webdriver searches for the form using the text input element automatically		
                    // No need to locate/find the submit button		
                    element.submit();			
                    
            		// This code will print the page title		
                    System.out.println("Page title is: " + driver.getTitle());		
                    
                    driver.quit();			
         }		
}