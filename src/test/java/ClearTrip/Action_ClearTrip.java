package ClearTrip;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Page_ClearTrip;
import Resources.Base;

public class Action_ClearTrip extends Base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Log.class.getName());
	
	@BeforeMethod
	public void getIntialinfo() throws IOException, InterruptedException
	{
		driver =intializeDriver();		
		driver.get(po.getProperty("cleartriptesturl"));				
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void homePageNavigation() throws IOException, InterruptedException
	{
		
		Page_ClearTrip pg = new Page_ClearTrip(driver);
		
		pg.getRoundTripRadiobutton().click();
		Thread.sleep(5000);
		pg.getFromTextField().clear();
		Thread.sleep(5000);
		pg.getFromTextField().sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");;
		Thread.sleep(5000);
		pg.getToTextField().clear();
		Thread.sleep(5000);
		pg.getToTextField().sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
		Thread.sleep(5000);
		pg.getTextFieldDepartDate().clear();
		Thread.sleep(4000);
		pg.getTextFieldDepartDate().sendKeys("20/12/2020");
		Thread.sleep(5000);
		pg.getTextFieldReturnDate().clear();
		Thread.sleep(5000);
		pg.getTextFieldReturnDate().sendKeys("21/12/2020");
		Thread.sleep(5000);
		//Select one child
		Select Children = new Select(pg.getDropDownChildren());
		Children.selectByValue("1");
		Thread.sleep(5000);
		pg.getButtonSearchFlight().click();
		Thread.sleep(30000);
		
		
		//Second Page 
		pg.getNonstopChechkBox().click();
		Thread.sleep(3000);
		//time
		pg.getDepartureArrow().click();
		Thread.sleep(2000);
		pg.getDepartureArrow().click();
		Thread.sleep(2000);
		
		pg.getButtonBook().click();
		Thread.sleep(20000);
		//go to next tab
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
		}
		String myurl = driver.getCurrentUrl();
		System.out.println(myurl);
		Thread.sleep(10000);
	
		pg.getradioStatndardFair().click();
		Thread.sleep(5000);
		pg.getContinueButton().click();
		Thread.sleep(8000);
		//Add Contact Details
		pg.getMobileNumberField().sendKeys("8659845685");
		Thread.sleep(2000);
		pg.getEmailAddressField().sendKeys("john.adarsha.27@gmail.com");
		Thread.sleep(2000);
		pg.getContinueButtonsecond().click();
		Thread.sleep(2000);
		//add traveller details
		pg.getFirstNameOfAdultField().sendKeys("Adarsh");
		Thread.sleep(2000);
		pg.getLastNameOfAdultField().sendKeys("Das");
		Thread.sleep(2000);
		pg.getGenderDropdown().click();
		Thread.sleep(2000);
		pg.setAdultNationality().sendKeys("India");
		Thread.sleep(2000);
		pg.getMaleLink().click();
		Thread.sleep(2000);
		pg.getFirstNameOfChildField().sendKeys("Suresh");
		Thread.sleep(2000);
		pg.getLastNameOfChildField().sendKeys("Das");
		Thread.sleep(2000);
		pg.setChildNationality().sendKeys("India");
		pg.getGenderDropdown().click();
		Thread.sleep(2000);
		pg.getMaleLink().click();
		Thread.sleep(2000);
		
		pg.getDOBFieldOfChild().sendKeys("12/05/2015");
		Thread.sleep(3000);
		pg.getContinuePaymentButton().click();
		
	
		
	}
	
	
	
	@AfterMethod
	public void closeDriver()
	{
		driver.quit();
	}
	
	

}
