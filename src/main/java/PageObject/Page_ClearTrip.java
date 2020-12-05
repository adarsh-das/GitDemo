package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_ClearTrip {
	
	public WebDriver driver;
	public Page_ClearTrip(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By rdRoundTrip= By.xpath("//strong[contains(text(),'Round trip')]/parent::label/input");
	By txtFrom= By.xpath("//strong[contains(text(),'From')]/parent::label/parent::dt/parent::dl/dd/span/input");
	By txtTo= By.xpath("//strong[contains(text(),'To')]/parent::label/parent::dt/parent::dl/dd/span/input");
	
	By txtDepartDate= By.xpath("//input[@id='DepartDate']");
	By txtReturnDate= By.xpath("//input[@id='ReturnDate']");
	
	By ddChildren= By.xpath("//select[@id='Childrens']");
	By btnSearchButton= By.xpath("//input[@id='SearchBtn']");
	
	//Second Page Element
	
	By chkNonstop= By.xpath("(//p[contains(text(),'Non-stop')]/parent::div/parent::div/parent::label/div)[1]");
	By lnkDepartureArrow= By.xpath("(//span[contains(text(),'Departure')])[2]");
	
	By btnBook= By.xpath("//span[contains(text(),'Details')]/parent::div/parent::div/parent::div/div[2]/button");
	By rdStatndardFair= By.xpath("(//div[starts-with(@class,'fareBlock__values ')])[1]");
	
	By btnContinue= By.xpath("//button[contains(text(),'Continue')]");
	
	//Third Page Element
	//User Details
	By txtMobieNumber= By.xpath("//input[@placeholder='Mobile number']");
	By txtEmailAddress= By.xpath("//input[@placeholder='Email address']");	
	By btnContinuesecond= By.xpath("//input[@placeholder='Email address']/parent::div/parent::div/parent::div/parent::div/div[7]/button");
	
	//Fourth Page Elements
	//Add Travel Details
	By txtFirstNameAdult= By.xpath("//input[@placeholder='First name']");
	By txtLastNameAdult= By.xpath("//input[@placeholder='Last name']");
	By ddGender= By.xpath("//div[contains(text(),'Gender')]");
	By lnkMale= By.xpath("//li[contains(text(),'Male')]");
	
	
	By txtFirstNameChild= By.xpath("(//input[@placeholder='First name'])[2]");
	By txtLastNameChild= By.xpath("(//input[@placeholder='Last name'])[2]");
	
	
	By txtDob= By.xpath("//input[@placeholder='DD / MM / YYYY']");
	By btnCotinuePayment= By.xpath("//button[contains(text(),'Continue to payment')]");
	//Extra
	
	By btnCotinueBooking= By.xpath("//input[@value='Continue booking']");
	By txtemail= By.xpath("//label[contains(text(),'Your email address')]/parent::dt/parent::dl/dd/div/input[2]");
	By btnContinueAgain= By.xpath("//input[@value='Continue']");
	By ddAdultTitle= By.xpath("//select[@id='AdultTitle1']");
	By ddChildTitle= By.xpath("//select[@id='ChildTitle1']");
	
	By ddDay= By.xpath("//select[@etitle='day']");
	By ddMonth= By.xpath("//select[@etitle='month']");
	By ddyear= By.xpath("//select[@etitle='year']");
	By txtMobile= By.xpath("//input[@id='mobileNumber']");
	By btnContinueafterfillup= By.xpath("(//input[@value='Continue'])[2]");
	
	By txtAdultNationality= By.xpath("//input[@placeholder='Nationality (e.g. India)']");
	By txtChildNationality= By.xpath("(//input[@placeholder='Nationality (e.g. India)'])[2]");
	
	
	
	
	
	
	
	
	public WebElement getRoundTripRadiobutton()
	{
		return driver.findElement(rdRoundTrip);
	}
	public WebElement getFromTextField()
	{
		return driver.findElement(txtFrom);
	}
	public WebElement getToTextField()
	{
		return driver.findElement(txtTo);
	}
	public WebElement getTextFieldDepartDate()
	{
		return driver.findElement(txtDepartDate);
	}
	public WebElement getTextFieldReturnDate()
	{
		return driver.findElement(txtReturnDate);
	}
	public WebElement getDropDownChildren()
	{
		return driver.findElement(ddChildren);
	}
	public WebElement getButtonSearchFlight()
	{
		return driver.findElement(btnSearchButton);
	}
	public WebElement getNonstopChechkBox()
	{
		return driver.findElement(chkNonstop);
	}
	public WebElement getDepartureArrow()
	{
		return driver.findElement(lnkDepartureArrow);
	}
	public WebElement getButtonBook()
	{
		return driver.findElement(btnBook);
	}
	public WebElement getradioStatndardFair()
	{
		return driver.findElement(rdStatndardFair);
	}
	public WebElement getContinueButton()
	{
		return driver.findElement(btnContinue);
	}
	
	public WebElement getMobileNumberField()
	{
		return driver.findElement(txtMobieNumber);
	}
	public WebElement getEmailAddressField()
	{
		return driver.findElement(txtEmailAddress);
	}
	public WebElement getContinueButtonsecond()
	{
		return driver.findElement(btnContinuesecond);
	}	
	public WebElement getFirstNameOfAdultField()
	{
		return driver.findElement(txtFirstNameAdult);
	}
	public WebElement getLastNameOfAdultField()
	{
		return driver.findElement(txtLastNameAdult);
	}
	public WebElement getGenderDropdown()
	{
		return driver.findElement(ddGender);
	}
	public WebElement getMaleLink()
	{
		return driver.findElement(lnkMale);
	}
	
	
	public WebElement getFirstNameOfChildField()
	{
		return driver.findElement(txtFirstNameChild);
	}
	public WebElement getLastNameOfChildField()
	{
		return driver.findElement(txtLastNameChild);
	}
	
	public WebElement getDOBFieldOfChild()
	{
		return driver.findElement(txtDob);
	}
	public WebElement getContinuePaymentButton()
	{
		return driver.findElement(btnCotinuePayment);
	}
	
	//extra
	public WebElement getContinueBookingButton()
	{
		return driver.findElement(btnCotinueBooking);
	}
	public WebElement setTextEmail()
	{
		return driver.findElement(txtemail);
	}

	public WebElement getTitleForAdult()
	{
		return driver.findElement(btnContinueAgain);
	}
	
	public WebElement getAdultTitleDropdown()
	{
		return driver.findElement(ddAdultTitle);
	}
	
	public WebElement getChildTitleDropdown()
	{
		return driver.findElement(ddChildTitle);
	}
	public WebElement getChildDay()
	{
		return driver.findElement(ddDay);
	}
	public WebElement getChildMonth()
	{
		return driver.findElement(ddMonth);
	}
	
	public WebElement getChildYear()
	{
		return driver.findElement(ddyear);
	}
	public WebElement setMobileNumber()
	{
		return driver.findElement(txtMobile);
	}
	public WebElement getContinueButtonafterDetailsFillup()
	{
		return driver.findElement(btnContinueafterfillup);
	}
	public WebElement setAdultNationality()
	{
		return driver.findElement(txtAdultNationality);
	}
	
	public WebElement setChildNationality()
	{
		return driver.findElement(txtChildNationality);
	}
	
	
	         
	   
	
	
}
