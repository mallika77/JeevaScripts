package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class exception_elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/div[1]")
	public WebElement clickexception;
	
	@FindBy(xpath = "(//div[@class='flex cursor-default select-none items-center rounded-sm py-1.5 px-2 text-sm font-medium outline-none focus:bg-slate-100 data-[state=open]:bg-slate-100 dark:focus:bg-slate-700 dark:data-[state=open]:bg-slate-700'])[1]")
	public WebElement clickterminalexception;
	
	@FindBy(xpath = "//div[@class='relative flex cursor-default select-none items-center rounded-sm py-1.5 px-2 text-sm font-medium outline-none focus:bg-slate-100 data-[disabled]:pointer-events-none data-[disabled]:opacity-50 dark:focus:bg-slate-700']")
	public WebElement clickviewallexception_terminalexception;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickfilter_under_terminalexception;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
	public WebElement clickzonefilter_under_terminalexceptionfilter;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public WebElement clickterminalfilter_under_terminalexceptionfilter;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickapply_under_terminalexception_filter;
	
	@FindBy(xpath = "(//div[@class='flex cursor-default select-none items-center rounded-sm py-1.5 px-2 text-sm font-medium outline-none focus:bg-slate-100 data-[state=open]:bg-slate-100 dark:focus:bg-slate-700 dark:data-[state=open]:bg-slate-700'])[2]")
	public WebElement clicktripexception;
	
	@FindBy(xpath = "(//div[@class='relative flex cursor-default select-none items-center rounded-sm py-1.5 px-2 text-sm font-medium outline-none focus:bg-slate-100 data-[disabled]:pointer-events-none data-[disabled]:opacity-50 dark:focus:bg-slate-700'])[1]")
	public WebElement clickviewallexception;
	
	@FindBy(xpath = "//input[@class='m-8fb7ebe7 mantine-Input-input']")
	public WebElement clicksearchbox;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickfilter;
	
	@FindBy(xpath = "(//div[@class='m-6c018570 mantine-Input-wrapper mantine-Select-wrapper'])[1]")
	public WebElement clickzone;
	
	@FindBy(xpath = "(//div[@class='m-6c018570 mantine-Input-wrapper mantine-Select-wrapper'])[2]")
	public WebElement clickterminal;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickapply;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickclearfilters;
	
	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-1/2 text-gray-500 m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
	public WebElement clickclearfilters2;
	
	@FindBy(linkText = "Replan Trip")
	public WebElement clickreplantrip;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
	public WebElement clickreplantype;
	
	@FindBy(xpath = "(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[1]")
	public WebElement click_replantype_as_exception;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public WebElement clickexceptiontype;
	
	@FindBy(xpath = "(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[70]")
	public WebElement select_exceptiontype_as_keylost;
	
	@FindBy(xpath = "(//div[@class='m-6c018570 mantine-Input-wrapper mantine-Select-wrapper'])[3]")
	public WebElement clickzone_in_replantrip_page;
	
	@FindBy(xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[4]")
	public WebElement clickterminal_in_replantrip_page;
	
	
	

}
