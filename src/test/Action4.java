package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String URL = "https://demoqa.com/keyboard-events-sample-form/";

	      driver.get(URL);
	 	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS); 
	 

	      WebElement userName = driver.findElement(By.id("userName"));
	      WebElement currAddr = driver.findElement(By.id("currentAddress"));
	      WebElement perAddr = driver.findElement(By.id("permanentAddress")); 
	      WebElement submitButton = driver.findElement(By.id("submit"));
	 

	      Actions actions = new Actions(driver);
	      actions.sendKeys(userName,"Mr.Jones").perform();

	      actions.click(currAddr).sendKeys("1205 OAK STREET,OLD FORGE,NEW YORK,11240").perform();
	 

	     actions.keyDown(currAddr,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); 
	     actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(perAddr,Keys.CONTROL).perform();
	 

	     actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	 

	     submitButton.click();
	 

	     driver.switchTo().alert().accept();
	     System.out.println("Submit Alert Accepted");
	 

	    driver.close(); 

	}

}
