package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Users_elements {
WebDriver driver;

@FindBy (xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/div[2]")
public WebElement clickusers;

@FindBy(xpath = "(//div[@class='relative flex cursor-default select-none items-center rounded-sm py-1.5 px-2 text-sm font-medium outline-none focus:bg-slate-100 data-[disabled]:pointer-events-none data-[disabled]:opacity-50 dark:focus:bg-slate-700'])[1]")
public WebElement clickmanageusers;

}
