package Amazon;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Page_Amazon;
import Resources.Base;


public class Action_Amazon extends Base {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void getIntialinfo() throws IOException, InterruptedException
	{
		driver =intializeDriver();
		driver.get(po.getProperty("amazontesturl"));	
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void homePageNavigation() throws IOException, InterruptedException
	{
		
		Page_Amazon pg = new Page_Amazon(driver);
		
		pg.getSearchField().sendKeys("A brief history of everyone who ever lived");
		Thread.sleep(5000);
		pg.getSearchLink().click();
		Thread.sleep(5000);
		pg.getBookLink().click();
		Thread.sleep(10000);
		//Going to next window
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		}
		pg.getPaperBackLink().click();		
		Thread.sleep(5000);
		pg.getBuyNowButton().click();
		Thread.sleep(5000);
		
		
		
	}

	@AfterMethod
	public void closeDriver()
	{
		driver.quit();
	}
	


}
