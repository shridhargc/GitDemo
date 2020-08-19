package Academy;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.links;
import resources.Base;

public class testLinks extends Base{

	@BeforeTest
	public void driverinvoke() throws IOException
	{
		driver= driverinfo();
	}
	
	@Test
	public void QAacademy()
	{
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		links l=new links(driver);
		System.out.println(l.links().size());
		
		
	
		
	}
}
