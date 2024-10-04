package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class terminal_elements {

	@FindBy (xpath = "//div[@class='grow w-full flex flex-col items-center space-y-2 py-2']/a[@href='/terminals']")
	public static WebElement terminalmenu;
	
	@FindBy (xpath = "//input[@class='m-8fb7ebe7 mantine-Input-input']")
	public static WebElement search_field;
	
	@FindBy (xpath = "//td[@class='table-body font-medium']")
	public static WebElement gridtxt;
	
	@FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[1]" )
	public static WebElement button_filter;
	
	@FindBy (xpath = "//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input']")
	public static WebElement field_zone;
	
	@FindBy (xpath = "//td[@class='table-body font-medium']/a[@href='/terminals/354']")
	public static WebElement octtbutton;
	
	@FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[2]")
	public static WebElement button_managemapping;
	
	@FindBy (xpath = "(//div[@class='text-sm'])[1]")
	public static WebElement button_assets_mapping_details;
	
	@FindBy (xpath = "//span[@class='font-normal ']")
	public static WebElement button_truckdetails;
	
	@FindBy (xpath =  "(//span[@class='font-normal'])[1]")
	public static WebElement button_customer;
	
	@FindBy (xpath = "//span[@class='m-811560b9 mantine-Button-label']")
	public static WebElement button_geofences;
	
	@FindBy (xpath = "(//div[@class='gm-style-mtc'])[2]")
	public static WebElement satellite;
	
	@FindBy (xpath = "//button[@class='gm-control-active gm-fullscreen-control']")
	public static WebElement button_maximize;
	
	@FindBy (xpath = "(//button[@class='gm-control-active'])[3]")
	public static WebElement button_plus;
	
	@FindBy (xpath = "(//button[@class='gm-control-active'])[4]")
	public static WebElement button_minus;
	
    @FindBy (xpath = "//button[@class='gm-control-active gm-fullscreen-control']")
    public static WebElement button_minimize;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[2]")
    public static WebElement button_checkVTS;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[3]")
    public static WebElement button_submit;
    
    @FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-TextInput-input'])[1]")
    public static WebElement latitude;
    
    @FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-TextInput-input'])[2]")
    public static WebElement longitude;
    
    @FindBy (xpath = "//button[@class='mantine-focus-auto mantine-active m-220c80f2 m-606cb269 mantine-Drawer-close m-86a44da5 mantine-CloseButton-root m-87cf2631 mantine-UnstyledButton-root']")
    public static WebElement button_close;
    
    @FindBy (xpath = "(//span[@class='font-normal'])[2]")
    public static WebElement button_wallpddetails;
    
    @FindBy (xpath = "(//span[@class='font-normal'])[3]")
    public static WebElement button_Keyboxdetails;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[1]")
    public static WebElement button_manageshifttiming;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[2]")
    public static WebElement button_keybox;
	
    @FindBy (xpath = "//span[@class='m-811560b9 mantine-Button-label']")
    public static WebElement button_new_shift_timing;
    
    @FindBy (xpath =  "(//input[@class='m-468e7eda m-8fb7ebe7 mantine-Input-input mantine-TimeInput-input'])[1]")
    public static WebElement start_timing;
    
    @FindBy (xpath = "(//input[@class='m-468e7eda m-8fb7ebe7 mantine-Input-input mantine-TimeInput-input'])[2]")
    public static WebElement end_timing;
    
    @FindBy (xpath = "(//button[@class='mantine-focus-auto mantine-active m-8d3f4000 mantine-ActionIcon-root m-87cf2631 mantine-UnstyledButton-root'])[2]")
    public static WebElement button_back;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[2]")
    public static WebElement button_add_keybox;
    
    @FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
    public static WebElement field_keybox;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[5]")
    public static WebElement button_yes;
    
    @FindBy (xpath = "(//input[@class='m-8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
    public static WebElement dropdwn_keyboxtype;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[3]")
    public static WebElement button_unassign;
    
    @FindBy (xpath = "(//span[@class='m-811560b9 mantine-Button-label'])[5]")
    public static WebElement button_unassign1;
    
}
