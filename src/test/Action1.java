package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		   System.out.println("demoqa webpage displayed");
			
		   driver.manage().window().maximize();
			 
		   Actions actions = new Actions(driver);
			 
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");	 
		
		 WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
		   elementOpen.click(); 
			
		   driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
		  WebElement btnElement1 = driver.findElement(By.id("doubleClickBtn")); 

		   actions.doubleClick(btnElement1).perform(); 
		   
		   System.out.println("Button is double clicked"); 
		   
		   driver.switchTo().alert().accept(); 
		   System.out.println("Double click Alert Accepted"); 
			 
		   // Close the main window 
		   //driver.close();
	}

}
