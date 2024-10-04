package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.net.InetAddresses.TeredoInfo;

import Common.Base_class;
import Elements.Login_Elements;
import Elements.livetrips_elements;
import Elements.terminal_elements;

public class terminal_testcase extends Base_class{
	
	
	@BeforeTest
	public void beforetest()
	{
		PageFactory.initElements(driver,terminal_elements.class);
	}
	
     
	@Test(priority = 1)
	public void verify_the_user_able_to_navigate_to_terminalmenu()
	{
		click_the_webelement(terminal_elements.terminalmenu);
	}
	
	@Test (priority = 3)
	public void verify_the_search_field_is_working_correctly() throws InterruptedException
	{
		click_the_webelement(terminal_elements.search_field);
		send_keys_to_webelement(terminal_elements.search_field, "OCTT");
		Thread.sleep(2000);
		verify_the_text(terminal_elements.gridtxt,"OCTTT");
		System.out.println(terminal_elements.gridtxt);
	clear_the_text_using_keyboardkeys(terminal_elements.search_field);
		//click_the_webelement(terminal_elements.octtbutton);
		
	}		
	
	
	
	@Test(priority = 2)
	public void Verify_that_the_user_is_able_to_select_a_value_from_the_filter_option() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         click_the_webelement(terminal_elements.button_filter);
	     click_the_webelement(terminal_elements.field_zone);
	     List<WebElement> zoneOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));
	    String desiredZone = "ZoneOCT";
	    for (WebElement option : zoneOptions) {
	        try {
	            if (option.getText().contains(desiredZone)) {
	                option.click();
	                WebElement applyFilterButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='m-811560b9 mantine-Button-label' and text()='Apply Filter']")));
	                applyFilterButton.click();
	                WebElement clearFilterButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='m-811560b9 mantine-Button-label' and text()='Clear Filters']")));
	                clearFilterButton.click();
	                WebElement ninthButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='m-811560b9 mantine-Button-label'])[9]")));
	                ninthButton.click();
	                break; 
	            }
	        } catch (StaleElementReferenceException e) {
	            zoneOptions = driver.findElements(By.xpath("//div[@role='option']"));
	        }
	    }
	}
	
	@Test(priority = 4)
	public void verify_able_to_view_the_dasboard_widgetsand_truckdeatils()throws InterruptedException
	{
		click_the_webelement(terminal_elements.search_field);
		send_keys_to_webelement(terminal_elements.search_field, "OCTTT");
		Thread.sleep(2000);
		verify_the_text(terminal_elements.gridtxt,"OCTTT");
		click_the_webelement(terminal_elements.button_managemapping);
		click_the_webelement(terminal_elements.button_assets_mapping_details);
		click_the_webelement(terminal_elements.button_truckdetails);
	}
	
	
	@Test(priority = 5)
	public void verify_customer_menu_is_working_correctly()throws InterruptedException
	{
		click_the_webelement(terminal_elements.button_assets_mapping_details);
		click_the_webelement(terminal_elements.button_customer);
		click_the_webelement(terminal_elements.button_geofences);
		click_the_webelement(terminal_elements.satellite);
		click_the_webelement(terminal_elements.button_maximize);
		for(int i=0;i<3;i++)
		{
			click_the_webelement(terminal_elements.button_plus);
			Thread.sleep(500);
		}
		for(int i = 0;i<=2;i++)
		{
			click_the_webelement(terminal_elements.button_minus);
			Thread.sleep(500);
		}
		click_the_webelement(terminal_elements.button_minimize);
		click_the_webelement(terminal_elements.button_checkVTS);
		VerticalScroll(terminal_elements.button_submit);
		click_the_webelement(terminal_elements.latitude);
		send_keys_to_webelement(terminal_elements.latitude, "10.8577");
		click_the_webelement(terminal_elements.longitude);
		send_keys_to_webelement(terminal_elements.longitude, "77.035388");
		click_the_webelement(terminal_elements.button_submit);
		click_the_webelement(terminal_elements.button_close);
    }
	
	@Test(priority = 6)
	public void verify_wallpd_menu_is_working_correctly()
	{
		click_the_webelement(terminal_elements.button_assets_mapping_details);
		click_the_webelement(terminal_elements.button_wallpddetails);
	}
	
	@Test(priority = 7)
	public void verify_keyboxdetails_menu_is_working_correctly()throws InterruptedException
	{
		click_the_webelement(terminal_elements.button_assets_mapping_details);
		click_the_webelement(terminal_elements.button_Keyboxdetails);
		click_the_webelement(terminal_elements.button_manageshifttiming);
		click_the_webelement(terminal_elements.button_new_shift_timing);
		click_the_webelement(terminal_elements.start_timing);
		send_keys_to_webelement(terminal_elements.start_timing, "08:25:PM");
		click_the_webelement(terminal_elements.end_timing);
		send_keys_to_webelement(terminal_elements.end_timing, "09:24:PM");
	    terminal_elements.end_timing.sendKeys(Keys.TAB,Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='m-811560b9 mantine-Button-label'])[3]")).click();
	    click_the_webelement(terminal_elements.button_yes);
	    click_the_webelement(terminal_elements.button_back);
	    click_the_webelement(terminal_elements.button_add_keybox);
	    click_the_webelement(terminal_elements.field_keybox);
	    List<WebElement> keyoption= driver.findElements(By.xpath("//div[@role='option']"));
	    String dsrdkeybox ="4455";
	    for (WebElement option : keyoption)
	    {
	    	if (option.getText().contains(dsrdkeybox))
	    	{
	    		option.click();
	    	}
	    }
	    terminal_elements.field_keybox.sendKeys(Keys.TAB);
	    List<WebElement> keysoption = driver.findElements(By.xpath("//div[@role='option']"));
	    String dsredkeys = "1.126";
	    for( WebElement options : keysoption)
	    {
	    	if(options.getText().contains(dsredkeys))
	    	{
	    		options.click();
	    		
	    	}
	    }
	    driver.findElement(By.xpath("//div[@class='m-b5489c3c m-5a7c2c9 mantine-Drawer-header']")).click();
	    click_the_webelement(terminal_elements.dropdwn_keyboxtype);
	    List<WebElement> keybxtype = driver.findElements(By.xpath("//div[@role='option']"));
	    String dsretype = "Swipe In";
	    for(WebElement option : keybxtype) 
	    {
	    	if(option.getText().contains(dsretype))
	    	{
	    		option.click();
	    	}
	    }
	    terminal_elements.dropdwn_keyboxtype.sendKeys(Keys.TAB,Keys.ENTER);
	    
	    click_the_webelement(terminal_elements.button_add_keybox);
	    click_the_webelement(terminal_elements.field_keybox);
	    List<WebElement> keyoption1= driver.findElements(By.xpath("//div[@role='option']"));
	    String dsrdkeybox1 ="7418";
	    for (WebElement option : keyoption1)
	    {
	    	if (option.getText().contains(dsrdkeybox1))
	    	{
	    		option.click();
	    	}
	    }
	    terminal_elements.field_keybox.sendKeys(Keys.TAB);
	    List<WebElement> keysoption1 = driver.findElements(By.xpath("//div[@role='option']"));
	    String dsredkeys1 = "1.127";
	    for( WebElement options : keysoption1)
	    {
	    	if(options.getText().contains(dsredkeys1))
	    	{
	    		options.click();
	    		
	    	}
	    }
	    driver.findElement(By.xpath("//div[@class='m-b5489c3c m-5a7c2c9 mantine-Drawer-header']")).click();
	    click_the_webelement(terminal_elements.dropdwn_keyboxtype);
	    List<WebElement> keybxtype1 = driver.findElements(By.xpath("//div[@role='option']"));
	    String dsretype1 = "Swipe Out";
	    Thread.sleep(3000);
	    for(WebElement option : keybxtype1) 
	    {
	    	if(option.getText().contains(dsretype1))
	    	{
	    		option.click();
	    	}
	    }
	    terminal_elements.dropdwn_keyboxtype.sendKeys(Keys.TAB,Keys.ENTER);
	    click_the_webelement(terminal_elements.button_unassign1);
	    click_the_webelement(terminal_elements.button_unassign);
	        }
	    
	}

	
	

