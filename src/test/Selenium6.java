package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String BaseURL="https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.get(BaseURL);
		driver.navigate().to("https://www.jiosaavn.com/search/bhula%20diya");
		driver.close();
		
	}

}
