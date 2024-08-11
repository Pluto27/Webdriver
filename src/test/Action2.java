package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String URL = "https://demoqa.com/droppable/";
		 
		 driver.get(URL);
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	
		 Actions builder = new Actions(driver);
		 
		 WebElement from = driver.findElement(By.id("draggable"));
		 
		 WebElement to = driver.findElement(By.id("droppable")); 

		 //builder.dragAndDrop(from, to).perform();
		
		 int xOffset1 = from.getLocation().getX();
		 
		 int yOffset1 =  from.getLocation().getY();
			
		 System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);
		 
		 int xOffset = to.getLocation().getX();
			
		 int yOffset =  to.getLocation().getY();
		 
		 System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		 xOffset =(xOffset-xOffset1)+10;
		 yOffset=(yOffset-yOffset1)+20;
		 
		builder.dragAndDropBy(from, xOffset,yOffset).perform();
		 String textTo = to.getText(); 
		 if(textTo.equals("Dropped!")) {
			 System.out.println("PASS: Source is dropped to target as expected");
			 }else {
			 System.out.println("FAIL: Source couldn't be dropped to target as expected");
			 }
		 
		 driver.close();
	}

}
