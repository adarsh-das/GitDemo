package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Amazon {
	public WebDriver driver;
	public Page_Amazon(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txtsearchbox= By.xpath("//input[@id='twotabsearchtextbox']");
	By lnkSearch= By.xpath("//span[@id='nav-search-submit-text']");
	By lnkofbook= By.xpath("//span[contains(text(),'A Brief History of Everyone Who Ever Lived: The Stories in Our Genes')]");
    By lnkPaperback= By.xpath("//span[contains(text(),'See all  formats and editions')]/parent::a/parent::div/div[2]/ul/li[2]/span/span/span/a");
    By btnBuyNow= By.xpath("(//span[contains(text(),'Buy Now')])[1]/parent::span/parent::span/parent::div");
    
	public WebElement getSearchField()
	{
		return driver.findElement(txtsearchbox);
	}
	public WebElement getSearchLink()
	{
		return driver.findElement(lnkSearch);
	}

	public WebElement getBookLink()
	{
		return driver.findElement(lnkofbook);
	}

	public WebElement getPaperBackLink()
	{
		return driver.findElement(lnkPaperback);
	}
	public WebElement getBuyNowButton()
	{
		return driver.findElement(btnBuyNow);
	}


}
