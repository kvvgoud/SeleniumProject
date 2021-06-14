package testNG_Programs;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.testng.annotations.Test;		

public class MultipleWindowTest extends Base{				


	@Test
	public void multipleWindows_test() throws Exception {
        	
        		
        //Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");			
                	
        String MainWindow=driver.getWindowHandle();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();			
        System.out.println("Parent Window Title"+driver.getTitle());		
        
        // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();
        
      // Iterator will check whether the window is a parent window or not. If it is Parent window then it will not do anything.  
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    
                    Thread.sleep(5000);
                    
                    System.out.println("Child window Title"+driver.getTitle());

                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                                           
                       driver.findElement(By.name("btnLogin")).click();	
                       
                       Thread.sleep(5000);
                                 
			// Closing the Child Window.
                        driver.close();		
                        
            }		
        }		
        // Switching to Parent window i.e Main Window.
        Thread.sleep(5000);
            driver.switchTo().window(MainWindow);		
            Thread.sleep(5000);
    }
}	