package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Selenium5 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		 
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String BaseURL="http://shop.demoqa.com/";
		driver.get(BaseURL);
		String Title=driver.getTitle();
		System.out.println("Title of the Page is"+Title);
		System.out.println("Length of the Title is"+Title.length());
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		BaseClass base=new BaseClass();
		if(ActualURL.equals(BaseURL))
		{
			System.out.println("The URL is Same");
		
		}
		else
		{
			System.out.println("The URL is not Same");
			
		}
		String pageSource=driver.getPageSource();
		System.out.println("The PageSource Length is"+pageSource.length());
	
	driver.close();
	}

}
