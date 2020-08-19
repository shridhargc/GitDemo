package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.spicejet;
import resources.Base;
 
	
	
public class testSpiceJet extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void driverinvoke() throws IOException
	{
		driver= driverinfo();
		
	}
	
	@Test
	public void spiceJet()
	{
		driver.get("https://www.spicejet.com/");
		spicejet sp=new spicejet(driver);
		sp.sourceClick().click();
		sp.sourceSelect().sendKeys("MUM");
		sp.sourceSelect().click();
		sp.destnation().sendKeys("UDR");
		sp.destnation().click();
		sp.travelDate().click();
		sp.passengerSelect().click();
		
		Select s=new Select(sp.AdultPassenger());
		s.selectByIndex(4);
		
		Select cur= new Select(sp.currencyType());
		cur.selectByValue("USD");
		
		}
	
	@AfterTest
	public void closedriver()
	{
		driver.close();
	}
}
