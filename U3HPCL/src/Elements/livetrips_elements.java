package Elements;

import java.net.http.WebSocket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class livetrips_elements {

	@FindBy (xpath = "//div[@class='grow w-full flex flex-col items-center space-y-2 py-2']/a[@href='/live-trips']")
	public static WebElement livetrips;
	
	@FindBy (xpath = "//input[@class='m-8fb7ebe7 mantine-Input-input']")	
	public static WebElement search;
	
	@FindBy (xpath = "(//td[@class='table-body'])[6]")
    public static WebElement gridtext;
	
	@FindBy (xpath = "//button[@class='mantine-focus-auto mantine-active font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public static WebElement button_filter;
	
	@FindBy (xpath = "//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input']")
	public static WebElement click_zone;
	
	@FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public static WebElement terminal_click;
	
	@FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[3]")
	public static WebElement triptype_click;
	
	@FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[3]")
	public static WebElement button_apply;
	
	@FindBy (xpath = "(//td[@class='table-body'])[5]")
	public static WebElement text_triptype;
	
	@FindBy (xpath = "(//td[@class='table-body'])[2]")
	public static WebElement text_zone;
	
	@FindBy (xpath = "(//td[@class='table-body'])[3]")
	public static WebElement text_terminal;
	
	@FindBy (xpath = "//span[@class='m-811560b9 mantine-Button-label']")
	public static WebElement button_clr;
	
	@FindBy (xpath = "//span[@class='m-811560b9 mantine-Button-label' and text()='Clear Filter']")
	public static WebElement button_clrfltr;
	

	

	
}
