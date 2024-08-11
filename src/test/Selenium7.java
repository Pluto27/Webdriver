package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium7 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String BaseURL="https://www.toolsqa.com";
		driver.get(BaseURL);
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-navigation-commands/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id='page']/div[4]/div/div[2]/ol/li[1]/a")).click();
		//driver.navigate().back();
		//driver.navigate().to("https://www.jiosaavn.com");
		driver.navigate().refresh();
	}

}
