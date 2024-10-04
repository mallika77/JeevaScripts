package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.apache.poi.ss.usermodel.Cell;

public class Base {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void VERIFY_THAT_U3_URL_LAUNCHED_SUCCESSFULLY()throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeev\\eclipse-workspace\\U3HPCL\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();  
		}
		catch (Exception e) {	
		System.out.println(e);	
		}
		String urlname = Excelinput("URL");
        if (driver != null) {
            driver.get(urlname);  // Now driver is properly initialized
            driver.manage().window().maximize();
            System.out.println("Current URL: " + urlname);
            System.out.println("U3 URL launched successfully");
            Thread.sleep(5000);
        } 
		}
    public String Excelinput(String expkey) throws IOException {
	        String excelPath = "C:\\Users\\rajeev\\eclipse-workspace\\workbook\\U3inputs.xlsx";
	        FileInputStream fis = new FileInputStream(excelPath);	
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheetAt(0);
// HashMap to store key-value pairs from Excel
	        HashMap<String, String> map = new HashMap<>();

	        // Use DataFormatter to format cell values as they appear in Excel
	        DataFormatter formatter = new DataFormatter();

	        for (Row row : sheet) {
	            Cell headerColumn = row.getCell(0);  // Key (Header)
	            Cell inputColumn = row.getCell(1);   // Value (Input)

	            // Ensure both cells are not null
	            if (headerColumn != null && inputColumn != null) {
	                String headerValue = formatter.formatCellValue(headerColumn);
	                String inputValue = formatter.formatCellValue(inputColumn);

	                map.put(headerValue, inputValue);  // Store in HashMap
	            }
	        }

	        // Close resources
	        workbook.close();
	        fis.close();

	        // Return the value associated with the given key
	       return map.getOrDefault(expkey, "Key not found");
	    }
    
    public void clickElement(WebElement clickfunction) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(clickfunction)).click();
		Thread.sleep(2000);
	}
    
				
	
    @AfterMethod
    public void tearDown() {
      	
    }}
		
		

		

	
	


