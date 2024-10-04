package test;

import org.testng.annotations.Test;

import baseclass.Base;
import page.Dashboard_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Dashboard_TC extends Base{
	Dashboard_elements elementsclick;
	
	@BeforeClass
	  public void beforeclass() {
		elementsclick = PageFactory.initElements(driver, Dashboard_elements.class);
	  }
	
  @Test(priority = 1)
  public void Verify_that_User_able_view_the_dashboard_page_initially_after_QRcode_scanning() {
	  System.out.println("dashboard page displayed successfully");
 }
  
  @Test(priority = 2)
  public void verify_that_All_filters_should_workingfine_on_dashborad_page() throws InterruptedException {
	  clickElement(elementsclick.clickfilterbutton_in_dasboard);
	  clickElement(elementsclick.clickzone);
	  List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredzone = "ZoneOCT";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredzone)) {
				Option.click();
				System.out.println("zone selected Successfully");
				break; // Exit the loop once the desired option is found and clicked
	}}
		
		clickElement(elementsclick.clickterminal);
		  List<WebElement> Options2 = driver.findElements(By.xpath("//div[@role='option']"));
			String desiredterminal = "OCTTT";
			for (WebElement Option : Options2) {
				if (Option.getText().contains(desiredterminal)) {
					Option.click();
					System.out.println("terminal selected Successfully");
					break; // Exit the loop once the desired option is found and clicked
		}}
			clickElement(elementsclick.clickdatefilter);
			List<WebElement> Options3 = driver.findElements(By.xpath("//div[@role='option']"));
			String desireddate = "Month Till Date";
			for (WebElement Option : Options3) {
				if (Option.getText().contains(desireddate)) {
					Option.click();
					System.out.println("date filtered Successfully");
					break; // Exit the loop once the desired option is found and clicked
		}}	
		
			clickElement(elementsclick.clickapply);	
			Thread.sleep(2000);
  }
  @Test(priority = 3)
  public void verify_that_scroll_function_should_workingfine() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("(//div[@class='flex space-x-4'])[4]"));	
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			System.out.println(element.getText());
			Thread.sleep(3000);
			WebElement element2 = driver.findElement(By.xpath("(//div[@class='w-1/2 flex flex-col space-y-6'])[1]"));
			js.executeScript("arguments[0].scrollIntoView(true);", element2);
			System.out.println(element2.getText());	
			Thread.sleep(2000);
			clickElement(elementsclick.clickclearfilter);
			clickElement(elementsclick.clickclearfilter2);
	    }
	  
	  
	  
  
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

  

}
