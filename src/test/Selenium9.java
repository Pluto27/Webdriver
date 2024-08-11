package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.partialLinkText("Demo")));
		driver.findElement(By.id("button1")).click();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		for(String handle1 :handles)
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
			System.out.println("Title:"+driver.getTitle());
		}
	//driver.close();
	driver.quit();
	}

}
