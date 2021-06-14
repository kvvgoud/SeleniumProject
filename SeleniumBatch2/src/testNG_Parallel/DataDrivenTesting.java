package testNG_Parallel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataDrivenTesting extends BaseParallel{
	
	// POI stands For “Poor Obfuscation Implementation”
	// XSSF stands for XML Spread Sheet Format
	
	// https://www.softwaretestinghelp.com/data-driven-framework-selenium-apache-poi/
	
	//OR or = new OR();
	
	@Test
	public void DataDrivenTestingExample() throws Exception {
		
		//PageFactory.initElements(driver, or);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
		String src = "D:\\SampleProject\\SeleniumBatch2\\DataDrivenLoginEx.xlsx";
			//File src=new File("D:\\Sample Project\\SeleniumBatch2\\DataDrivenLoginEx.xlsx");
		
			 // Load the file.
		     FileInputStream finput = new FileInputStream(src);
		     // Load the workbook.
		     XSSFWorkbook workbook = new XSSFWorkbook(finput);
		     // Load the sheet in which data is stored.
		     XSSFSheet sheet= workbook.getSheetAt(0);
		     
		     int RowCount = sheet.getLastRowNum();
//		     int RowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		    		 
		     System.out.println("No of Rows: "+RowCount);
		     
		     for(int i=1; i<=RowCount; i++)
		     {
		    	 
		    	WebElement FB_UN = driver.findElement(By.xpath("//input[@type='text']"));
		  		WebElement FB_Pwd = driver.findElement(By.xpath("//input[@type='password']"));
		  		WebElement FB_LoginButton = driver.findElement(By.xpath("//button[text()='Log In']"));
		 		
		         // Import data for Email.
		    	 XSSFCell cell = sheet.getRow(i).getCell(1);
		    	 FB_UN.clear();
		    	 //FB_UN.sendKeys("");
		    	 FB_UN.sendKeys(cell.getStringCellValue());
		         
		         // Import data for password.
		         cell = sheet.getRow(i).getCell(2);
		         FB_Pwd.clear();
		         FB_Pwd.sendKeys(cell.getStringCellValue());
		         FB_LoginButton.click();
		         Thread.sleep(5000);
		         driver.navigate().back();
		         //driver.navigate().to("https://www.facebook.com/");
		         Thread.sleep(5000);
		        }
		     
		     /* Working with Notepad: Writing data to Notepad
		String FilePath = "D:\\BookingID\\BookingID.txt";
		FileWriter fr=new FileWriter(FilePath);
		BufferedWriter br=new BufferedWriter(fr);
		br.write(bookID);
		br.close();
		      */
		     /* Read Data from Excel Sheet:
		    String FilePath = "D:\\BookingID\\BookingID.txt";
			FileReader fr1=new FileReader(FilePath);
			BufferedReader br1= new BufferedReader(fr1);
			String BookingID = br1.readLine();
			br1.close();
		      */

	}
	
}
 