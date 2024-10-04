package Elements;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Login_Elements {

	@FindBy(xpath  ="//div[@class='grow w-full flex flex-col items-center space-y-2 py-2']/a[@href='/truck-status']" )
	public static WebElement truckStatusLink;
	
	@FindBy(xpath ="//input[@class='m-8fb7ebe7 mantine-Input-input']")
	public static WebElement searchfieldclick;
	
	@FindBy(xpath = "(//div[@class='m-82577fc2 mantine-Input-section'])[2]")
	public static WebElement searchclearbutton;
	
	@FindBy(xpath = "//td[@class='table-body-active']")
	public static WebElement gridtext;
	
	@FindBy(xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[1]")
	public static WebElement filterbutton;
	
	@FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
	public static WebElement zoneoption;
	
	@FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public static WebElement terminaloption;
	
	@FindBy (xpath = "(//span[@class='m-80f1301b mantine-Button-inner'])[13]")
	public static WebElement fltrapplybtn;
	
	@FindBy (xpath = "(//td[@class='table-body'])[2]")
	public static WebElement zonetxt;
	
	@FindBy (xpath ="(//td[@class='table-body'])/a[@href='/terminals/354']")
	public static WebElement termtxt;
	
	@FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[1]")
	public static WebElement clrbutton;
	
	
	@FindBy (xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 text-gray-500 font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public static WebElement clearfilter;
	
	@FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[2]")
	public static WebElement actionbtn;
	
	@FindBy (xpath = "//button[@class='mantine-focus-auto mantine-active m-220c80f2 m-606cb269 mantine-Drawer-close m-86a44da5 mantine-CloseButton-root m-87cf2631 mantine-UnstyledButton-root']")
	public static WebElement Xbutton;
	
	@FindBy (xpath =  "//span[@class='m-811560b9 mantine-Button-label' and text()='Clear Filter']")
	public static WebElement button_clear;
}

