package test;
import org.testng.annotations.Test;
import baseclass.Base;
import page.Dashboard_elements;
import page.Users_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Users_TC extends Base{
	Users_elements elementsclick;
	
	 @BeforeClass
	  public void beforeClass() {
		 elementsclick = PageFactory.initElements(driver,Users_elements.class); 
	  }
	 
     @Test
     public void verify_that_able_to_select_manageusers_under_users_module_and_view_the_grid_page_successfully() throws InterruptedException {
	  clickElement(elementsclick.clickusers);
	  clickElement(elementsclick.clickmanageusers);
	  WebElement search = driver.findElement(By.xpath("//input[@class='m-8fb7ebe7 mantine-Input-input']"));
	  search.sendKeys("9361655612");
	  
	  
	  
     }
  
  
  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

 

}
