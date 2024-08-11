package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://toolsqa.com/automation-practice-table");
	        
	        //Here we are storing the value from the cell in to the string variable
	        
	        String cellValue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	        System.out.println(cellValue);
	        
	        //Here we are clicking on a link for first row and last column
	        driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
	        System.out.println("Linked has been clicked otherwise there would be an exception");
	        driver.close();
	}

}
