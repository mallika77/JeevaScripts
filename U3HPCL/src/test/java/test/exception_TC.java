package test;
import org.testng.annotations.Test;
import baseclass.Base;
import page.exception_elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class exception_TC extends Base{
exception_elements elementsclick;

@BeforeClass
	  public void beforeClass() {
		elementsclick = PageFactory.initElements(driver, exception_elements.class);
}
@Test(priority = 0)
public void verify_able_to_select_and_view_the_gridpage_in_viewallexception_under_terminalexceptionpage() throws InterruptedException {
	clickElement(elementsclick.clickexception);
	clickElement(elementsclick.clickterminalexception);	
	clickElement(elementsclick.clickviewallexception_terminalexception);	
}
@Test(priority = 1)
public void verify_all_filters_should_working_fine_under_terminalexception_filter() throws InterruptedException {
	clickElement(elementsclick.clickfilter_under_terminalexception);
	clickElement(elementsclick.clickzonefilter_under_terminalexceptionfilter);
	List<WebElement> Options1 = driver.findElements(By.xpath("//div[@role='option']"));
	String desiredzone = "ZoneOCT";
	for (WebElement Option : Options1) {
		if (Option.getText().contains(desiredzone)) {
			Option.click();
			System.out.println("zone selected Successfully in terminal exception filter");
			break; // Exit the loop once the desired option is found and clicked
}}
	clickElement(elementsclick.clickterminalfilter_under_terminalexceptionfilter);
	List<WebElement> Options2 = driver.findElements(By.xpath("//div[@role='option']"));
	String desiredTerminal = "OCTTT";
	for (WebElement Option : Options2) {
		if (Option.getText().contains(desiredTerminal)) {
			Option.click();
			System.out.println("Terminal selected Successfully in terminal exception filter");
			break; // Exit the loop once the desired option is found and clicked
}}
	clickElement(elementsclick.clickapply_under_terminalexception_filter);

}




@Test (priority = 2, enabled = false)
  public void verify_able_to_select_and_view_the_gridpage_in_viewallexception_under_tripexceptionpage() throws InterruptedException {
	clickElement(elementsclick.clickexception);
	clickElement(elementsclick.clicktripexception);	
	clickElement(elementsclick.clickviewallexception);	
}
@Test(priority = 3, enabled = false)
public void verify_All_filters_should_workingfine_in_TripExceptionpage() throws InterruptedException {	
clickElement(elementsclick.clickfilter);
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
	List<WebElement> Options1 = driver.findElements(By.xpath("//div[@role='option']"));
	String desiredTerminal = "OCTTT";
	for (WebElement Option : Options1) {
		if (Option.getText().contains(desiredTerminal)) {
			Option.click();
			System.out.println("Terminal selected Successfully");
			break; // Exit the loop once the desired option is found and clicked
}}

	clickElement(elementsclick.clickapply);
	Thread.sleep(2000);
	clickElement(elementsclick.clickclearfilters);
	clickElement(elementsclick.clickclearfilters2);
	
	
}
@Test (priority = 4, enabled = false)
public void verify_user_able_to_replan_the_trip_in_tripexception_page() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	clickElement(elementsclick.clickexception);
	clickElement(elementsclick.clicktripexception);
	clickElement(elementsclick.clickreplantrip);
	Thread.sleep(1000);
	clickElement(elementsclick.clickreplantype);
	clickElement(elementsclick.click_replantype_as_exception);
	Thread.sleep(1000);
	clickElement(elementsclick.clickexceptiontype);
	clickElement(elementsclick.select_exceptiontype_as_keylost);
	Thread.sleep(1000);
	clickElement(elementsclick.clickzone_in_replantrip_page);
	List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
	String desiredzone = "ZoneOCT";
	for (WebElement Option : Options) {
		if (Option.getText().contains(desiredzone)) {
			Option.click();
			System.out.println("zone selected Successfully in replantrip");
			break;
}}
	clickElement(elementsclick.clickterminal_in_replantrip_page);
	List<WebElement> Options1 = driver.findElements(By.xpath("//div[@role='option']"));
	String desiredTerminal = "OCTTT";
	for (WebElement Option : Options1) {
		if (Option.getText().contains(desiredTerminal)) {
			Option.click();
			System.out.println("Terminal selected Successfully in replantrip");
			break; // Exit the loop once the desired option is found and clicked
}}
	

}


	

	


	

	




	







  @AfterMethod
  public void afterMethod() {
	
  }
}
