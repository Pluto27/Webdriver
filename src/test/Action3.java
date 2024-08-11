package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String URL = "https://demoqa.com/droppable/";
		
		 driver.get("http://demoqa.com/tooltip-and-double-click/"); 
		 
		 System.out.println("demoqa webpage Displayed"); 
		 

		 driver.manage().window().maximize(); 
		 

		 Actions actions = new Actions(driver); 
		 

		 WebElement element = driver.findElement(By.id("tooltipDemo")); 
		 

		 actions.moveToElement(element).perform(); 
		 
		 WebElement toolTip = driver.findElement(By.cssSelector(".tooltiptext")); 
		 

		 String toolTipText = toolTip.getText();
		 System.out.println("toolTipText-->"+toolTipText); 
		 
	
		 if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){ 
		 System.out.println("Pass* : Tooltip matching expected value");
		 }else{
		 System.out.println("Fail : Tooltip NOT matching expected value"); 
		 } 
		 
	
		 driver.close();

	}

}
