package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class goibibo {
	
	public WebDriver driver;
		 
	By From= By.id("gosuggest_inputSrc");
	By destination =By.id("gosuggest_inputDest");
	By calender=By.id("departureCalendar");
	By month=By.xpath("//div[@class='DayPicker-Caption']");
	By nextMonth=By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
	By day=By.xpath("//div[@class='DayPicker-Day']");
	
	public goibibo(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	public WebElement From()
	{  
		return driver.findElement(From);
	}
	public WebElement destination()
	{
		return driver.findElement(destination);
	}
	public WebElement calender()
	{
		return driver.findElement(calender);
	}
	public WebElement Month()
	{
		return driver.findElement(month);
	}
	public WebElement NextMonth()
	{
		return driver.findElement(nextMonth);
	}
	public List<WebElement> Day()
	{
		return driver.findElements(day);
	}
}
