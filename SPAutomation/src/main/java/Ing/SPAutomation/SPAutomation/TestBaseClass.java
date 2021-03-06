package Ing.SPAutomation.SPAutomation;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseClass extends SPAutomationProperties {

	public static WebDriver driver = null;

	public void StartApplication() {
		try {

			Init();
			System.setProperty("webdriver.chrome.driver", "C:\\Browers\\chromedriver.exe");

			driver = new ChromeDriver();
String aa=Params.getProperty("url");
System.out.println(aa);
			driver.get(Params.getProperty("url"));
		} catch (Exception e) {
			System.out.println("Appication is not able to Start " + e.getMessage());
		}
		maxBrowser();
	}

	public void StopApplication() {
		try {
			driver.close();
		}

		catch (Exception e) {
			System.out.println("Application is not able to Close" + e.getMessage());
		}
	}

	public void maxBrowser()
	{
		try
		{
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			System.out.println("Issue in Max. browser"+e.getMessage());
		}
	}
	public WebElement getElementByXpath(String xpath)
	{
	 WebElement element=null;
	 
	 try
	 {
		element=driver.findElement(By.xpath(xpath)); 
	 }
	 catch(Exception e)
	 {
		 System.out.println("Issue in GetElementByXPath Function"+e.getMessage());
	 }
	 return element;
		
	}
	
	
	public WebElement getElementByLink(String Link)
	{
		 WebElement element=null;
		 
		 try
		 {
		 element=driver.findElement(By.linkText(Link));
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Issue in Link Function"+e.getMessage());
		 }
		 return element;
			
	}

	public void info(String msg)
	{
		
log.info("info: "+msg);	
	}

	public void debug(String msg1)
	{
		
log.debug("debug: "+msg1);	
	}
}
