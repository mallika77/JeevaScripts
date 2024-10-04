package Testcases;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Common.Base_class;
import Elements.Login_Elements;

public class Login_Testcases extends Base_class {

	
	@BeforeTest
	public void BeforeTest()throws InterruptedException
	{
		    driver.get("https://u3hpcl.sternaemlock.com/login");
            Thread.sleep(7000);
            PageFactory.initElements(driver, Login_Elements.class);
	}
	
	
	/*@Test (priority = 1)
	public void verify_able_to_navigate_to_truckstatus_page()
	{
		Login_Elements.truckStatusLink.click();	
	}
	
    @Test (priority = 2)
	public void verify_the_search_field() throws InterruptedException
	{
		click_the_webelement(Login_Elements.searchfieldclick);
		send_keys_to_webelement(Login_Elements.searchfieldclick, "UP94B1285");
		Thread.sleep(2000);
		verify_the_text(Login_Elements.gridtext,"UP94B1285");
		System.out.println(Login_Elements.gridtext.getText());
		clear_the_text_using_keyboardkeys(Login_Elements.searchfieldclick);
	}
	
	@Test(priority = 6,enabled = true)
	public void select_the_zone()
	{
		click_the_webelement(Login_Elements.filterbutton);
		click_the_webelement(Login_Elements.zoneoption);
		List<WebElement> zonelst = driver.findElements(By.xpath("//div[@role='option']"));
		String dsredzone = "ZoneOCT";
		for (WebElement option : zonelst) {
			if (option.getText().contains(dsredzone)) {
				option.click();		
				System.out.println("zone found");
				break;	}		
	}
	
	}
	
		 @Test(priority = 7,enabled = true)
	     public void select_the_terminal()
	     {
			click_the_webelement(Login_Elements.terminaloption);
			List<WebElement> termlst = driver.findElements(By.xpath("//div[@role='option']"));
			String dsredterm = "OCTTT";
					for (WebElement option : termlst)
					{
						if(option.getText().contains(dsredterm))
						{option.click();
						System.out.println("terminal found");
						break;
						}
					}
			click_the_webelement(Login_Elements.fltrapplybtn);
	      }
	 
		
	@Test(priority = 8,enabled = true)
	public void verify_the_filtered_value_matched_the_gridValue()throws InterruptedException
	{
		System.out.println("13");
		Thread.sleep(3000);
		verify_the_text(Login_Elements.zonetxt,"ZoneOCT");
		System.out.println(Login_Elements.zonetxt.getText());
	     verify_the_text(Login_Elements.termtxt,"OCTTT(6023)");
	     System.out.println(Login_Elements.termtxt.getText());
	     click_the_webelement(Login_Elements.clrbutton);
	   click_the_webelement(Login_Elements.button_clear);
	}
	
	@Test(priority = 3)
	public void verify_the_scroll_bar_is_working() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement k =driver.findElement(By.xpath("(//th[@class='border border-primary-100 whitespace-nowrap bg-primary-50 px-4 py-1.5 uppercase text-slate-800 text-xs+ lg:px-5'])[9]"));
	js.executeScript("arguments[0].scrollIntoView(true);",k);
	System.out.println("horizontalcscroll is working");
	
	}
	
	@ Test(priority = 4,enabled = true) 
	public void verify_the_pagination_and_showing_from_is_working_correctly() throws InterruptedException 
	{
		for(int p=1; p<4;p++)
		{
			if(p>1)
		
		  {
			WebElement pagination =driver.findElement(By.xpath("//div[@class='m-4081bf90 mantine-Group-root']//*[text()="+p+"]"));
			pagination.click();
			Thread.sleep(2000);
			VerticalScroll(pagination);
		  }
	    }
	}
	
	@Test(priority = 5)
	public void verify_action_buton_is_working_correctly()
	{
		driver.findElement(By.xpath("//div[@class='m-4081bf90 mantine-Group-root']//*[text()='1']")).click();
	    click_the_webelement(Login_Elements.actionbtn);
	    click_the_webelement(Login_Elements.Xbutton);
	}*/
	
}
	

