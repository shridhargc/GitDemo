package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class spicejet {
	
	public WebDriver driver;

	By sourceclick= By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By Selectsource= By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='UDR']");
	By dessource= By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='KNU']");
	By date = By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active");
	By passanger=By.id("divpaxinfo");
	By adult = By.id("ctl00_mainContent_ddl_Adult");
	By currency= By.id("ctl00_mainContent_DropDownListCurrency");
	
	public spicejet(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement sourceClick()
	{
		return driver.findElement(sourceclick);
	}
	public WebElement sourceSelect()
	{
		return driver.findElement(Selectsource);
	}
	public WebElement destnation()
	{
		return driver.findElement(dessource);
	}
	public WebElement travelDate()
	{
		return driver.findElement(date);
	}
	public WebElement passengerSelect()
	{
		return driver.findElement(passanger);
	}
	public WebElement AdultPassenger()
	{
		return driver.findElement(adult);
	}
	public WebElement currencyType()
	{
		return driver.findElement(currency);
	}









}
