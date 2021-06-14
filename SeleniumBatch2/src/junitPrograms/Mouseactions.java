package junitPrograms;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions extends Base{
	
	@Test
	public void DragAndDropTest() throws Exception {
		
		driver.get("https://demoqa.com/droppable/");
		
		Thread.sleep(5000);
		
		WebElement dragObject = driver.findElement(By.id("draggable"));
		
		WebElement dropObject = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragObject, dropObject).build().perform();
		
		Thread.sleep(5000);
		
		act.contextClick(dropObject).build().perform();
		Thread.sleep(5000);
		
		//act.doubleClick(dragObject).build().perform();
		
	}
	
	@Test()
	public void MouseHoverTest() throws Exception {
		
		driver.get("https://www.guru99.com/");
		
		
		WebElement guru99Testing = driver.findElement(By.xpath("//span[text() = 'Testing']"));
		WebElement listSelenium = driver.findElement(By.xpath("//span[text() = ' Selenium']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(guru99Testing).build().perform();
		Thread.sleep(5000);
		
		listSelenium.click();
		Thread.sleep(5000);
		
	}
	
}
