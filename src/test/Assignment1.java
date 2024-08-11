package test;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String BaseURL="https://www.toolsqa.com/automation-practice-form/";
		
		driver.get(BaseURL);
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		wait.until(ExpectedConditions.visibilityOf((driver.findElement(By.partialLinkText("Partial")))));
		
		WebElement partialText=driver.findElement(By.partialLinkText("Partial Link"));
		//js.executeScript("arguments[0].scrollIntoView(true);", partialText);
		
		partialText.click();
		//wait.until(ExpectedConditions.visibilityOf((partialText)));
		
		WebElement linkTest=driver.findElement(By.linkText("Link Test"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.partialLinkText("Partial")));
		
		wait.until(ExpectedConditions.visibilityOf((linkTest)));
		
		linkTest.click();
		driver.navigate().back();
		
		WebElement firstName= driver.findElement(By.name("firstname"));
		firstName.sendKeys("Pranjal");
		
		WebElement lastName=driver.findElement(By.id("lastname"));
		lastName.sendKeys("Kasar");
		
		WebElement submitButton=driver.findElement(By.xpath("//*[@id='buttonwithclass']"));
		submitButton.click();
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.partialLinkText("Partial")));
		WebElement maleRadioButton=driver.findElement(By.id("sex-0"));
		maleRadioButton.click();
		Assignment1.checkSinglevalue(driver,"Years of Experience","2");
		
		
		WebElement datePicker=driver.findElement(By.id("datepicker"));
		datePicker.sendKeys("27/06/1994");
		
		Assignment1.checkSinglevalue(driver,"Profession","Automation Tester");
		
		WebElement chooseFile=driver.findElement(By.id("photo"));
		chooseFile.sendKeys("D:\\qqq.txt");
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("photo")));
		
		WebElement downloadSelenium=driver.findElement(By.partialLinkText("Selenium Automation"));
		WebElement downloadTestFile=driver.findElement(By.partialLinkText("Test File"));
		downloadSelenium.click();
		downloadTestFile.click();
		
		Assignment1.checkMultiplevalue(driver,"Automation Tool","Selenium IDE","QTP");
		
		Select continent1= new Select(driver.findElement(By.name("continents")));
		continent1.selectByVisibleText("Australia");
		
		Select continent2= new Select(driver.findElement(By.id("continentsmultiple")));
		continent2.selectByVisibleText("Australia");
		continent2.selectByVisibleText("North America");
		
		Select seleniumCommands= new Select(driver.findElement(By.name("selenium_commands")));
		seleniumCommands.selectByVisibleText("Browser Commands");//*[@id="content"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[29]/text()[3]
		
		driver.close();
	}
	
		public static void checkSinglevalue(WebDriver driver,String label,String name)
		{
			WebElement yearsOfExperience=driver.findElement(By.xpath("//label[text()='"+label+"']/parent::strong/following-sibling::input[@value='"+name+"']"));
			yearsOfExperience.click();
			
		}
		public static void checkMultiplevalue(WebDriver driver,String label,String itemToClick,String secondItemToClick)
		{
			WebElement tools=driver.findElement(By.xpath("//label[text()='"+label+"']/parent::strong/following-sibling::input[@value='"+itemToClick+"']"));
			tools.click();
			WebElement tools1=driver.findElement(By.xpath("//label[text()='"+label+"']/parent::strong/following-sibling::input[@value='"+secondItemToClick+"']"));
			tools1.click();
		}

}
