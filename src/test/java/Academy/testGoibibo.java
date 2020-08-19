package Academy;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.goibibo;
import resources.Base;

public class testGoibibo extends Base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void driverInvoke() throws IOException
	{
		driver=driverinfo();
	}
	
	@Test
	public void Goibibo()
	{
		 WebDriverWait wait=new WebDriverWait(driver,15);
		 
		driver.get("https://www.goibibo.com/");
		goibibo go=new goibibo(driver);
		
		go.From().click();
		go.From().sendKeys("BLR");
		wait.until(ExpectedConditions.visibilityOfAllElements(go.From()));
		go.From().sendKeys(Keys.ARROW_DOWN);
		go.From().sendKeys(Keys.ENTER);
		
		go.destination().sendKeys("UDR");
		wait.until(ExpectedConditions.visibilityOfAllElements(go.destination()));
		go.destination().sendKeys(Keys.ARROW_DOWN);
		go.destination().sendKeys(Keys.ENTER);
		
		go.calender().click();
		while(!go.Month().getText().contains("November"))
		{
			go.NextMonth().click();
		}
		
		int days=go.Day().size();
		
		for(int i=0;i<days;i++)
		{
			String date=go.Day().get(i).getText();
			
		if(date.equalsIgnoreCase("16"))
		{
			go.Day().get(i).click();
		
		}
		}
	}
}
