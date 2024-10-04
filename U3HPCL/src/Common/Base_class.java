package Common;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;





public class Base_class {
	
	public static WebDriver driver;
	public static WebDriverWait webdriverwait;
	@BeforeSuite
	public void Starting_Setup()
	{
		// WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		webdriverwait=new WebDriverWait(driver, Duration.ofSeconds(20)); 

	}

	public static void click_the_webelement(WebElement webElement)
	  {
		  try 
		  { 
		  (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).click();
		  }
		  catch(StaleElementReferenceException e)
		  {
		  (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).click();
		  }
	  }
	  
	  public static void send_keys_to_webelement(WebElement webElement,String valuesToBeSend)
	  {
		  try
		  {
		  (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).sendKeys(valuesToBeSend);
		  }
		  catch(StaleElementReferenceException e)
		  {
		  (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).sendKeys(valuesToBeSend);  
		  }
	  }
	  
	  public static void verify_the_text(WebElement webElement,String expected_output)
	  {
		  try
		  {
		  Assert.assertEquals(webdriverwait.until(ExpectedConditions.visibilityOf(webElement)).getText().trim(),expected_output);
		  }
		  catch(StaleElementReferenceException e)
		  {
		  Assert.assertEquals(webdriverwait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(webElement))).getText().trim(),expected_output);
		  }
	  }
	  
	  public static void clear_the_text_using_keyboardkeys(WebElement webElement)
	  {
		  try
		  {
	      (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		  webdriverwait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(Keys.chord(Keys.DELETE));
		  }
		  catch(StaleElementReferenceException e)
		  {
		  (webdriverwait).until(ExpectedConditions.visibilityOf(webElement)).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		   webdriverwait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(Keys.chord(Keys.DELETE));
		  }
	  }
	  
	  public void VerticalScroll(WebElement element) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", element);
	  }
	  
}
	
	
	
	

