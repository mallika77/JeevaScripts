package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickfilterbutton_in_dasboard;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
	public WebElement clickzone;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public WebElement clickterminal;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[3]")
	public WebElement clickdatefilter;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickapply;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickclearfilter;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 text-gray-500 font-medium m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickclearfilter2;

}
