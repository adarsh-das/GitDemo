package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public Properties po;
	public WebDriver intializeDriver() throws IOException
	{
		
		po = new Properties();
		FileInputStream fis = new FileInputStream("E:\\AUTOMATION TESTING 2020\\Workspace\\OneTrustAssignment\\src\\main\\java\\Resources\\data.properties");
		po.load(fis);
		String browsername =po.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION TESTING 2020\\Selenium_SETUP\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			
			
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			
			
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	

	public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
}
