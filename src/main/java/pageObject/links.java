package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class links {
	public WebDriver driver;
	
	By links= By.tagName("a");
	By footer=By.id("gf-BIG");
	
	public links(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public List<WebElement> links()
	{
		return driver.findElements(links);
	}
	
	public WebElement FooterSection()
	{
		return driver.findElement(footer);
		 
	}
}
