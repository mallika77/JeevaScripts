package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.Base_class;
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
	
	
	
	
}
