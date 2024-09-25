package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.Base_class;
import Elements.livetrips_elements;

public class livetrips_testcase extends Base_class {

	@BeforeTest 
	public void beforetest()
	{
		PageFactory.initElements(driver,livetrips_elements.class);
	}
	
	
	@Test (priority = 1)
	public void verify_user_able_to_navigate_to_livetrips()
	{
		click_the_webelement(livetrips_elements.livetrips);
	}
	
	
	@Test(priority = 2)
	public void Verify_that_the_searched_value_matches_the_values_shown_in_the_grid()throws InterruptedException
	{
		click_the_webelement(livetrips_elements.search);
		send_keys_to_webelement(livetrips_elements.search,"TN36AP9119");
		Thread.sleep(2000);
		verify_the_text(livetrips_elements.gridtext,"TN36AP9119");
		System.out.println(livetrips_elements.gridtext.getText());
		clear_the_text_using_keyboardkeys(livetrips_elements.search);
	}
	

	@Test (priority = 3)
	public void Verify_that_the_user_is_able_to_select_a_value_from_the_filter_option()
	{
		click_the_webelement(livetrips_elements.button_filter);
		click_the_webelement(livetrips_elements.click_zone);
		List<WebElement> zonelist =  driver.findElements(By.xpath("//div[@role='option']"));
		String dsredvalue = "OLDZone";
		for(WebElement option : zonelist)
		{
			if(option.getText().contains(dsredvalue))
			{
				option.click();
				break;
			}
		}
			click_the_webelement(livetrips_elements.terminal_click);
			List<WebElement> terminal_list = driver.findElements(By.xpath("//div[@role='option']"))	;
			String desredvalue = "COIMBATORE DEPOT";
			for(WebElement option : terminal_list)
			{
				if(option.getText().contains(desredvalue))
				{
					option.click();
					break;
				}
			}
			click_the_webelement(livetrips_elements.triptype_click);
			List<WebElement> triptype_list = driver.findElements(By.xpath("//div[@role='option']"));
			String desredtype = "Single Load";
			for (WebElement option : triptype_list)
			{
				if(option.getText().contains(desredtype))
				{
					option.click();
					break;
				}
			}
		
		click_the_webelement(livetrips_elements.button_apply);
		verify_the_text(livetrips_elements.text_triptype, "SingleLoad");
		System.out.println(livetrips_elements.text_triptype.getText());
		verify_the_text(livetrips_elements.text_zone, "OLDZone");
		verify_the_text(livetrips_elements.text_terminal, "COIMBATORE DEPOT");
		click_the_webelement(livetrips_elements.button_clr);
		click_the_webelement(livetrips_elements.button_clrfltr);
	}
	
	
}
