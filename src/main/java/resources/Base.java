package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
public WebDriver driverinfo() throws IOException
{
	Properties prop= new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\resources\\\\data");
	prop.load(fis);
	String browserName= prop.getProperty("browser");
	System.out.println(browserName);
	
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");	
	  driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 return driver;
	 
		
}
}
