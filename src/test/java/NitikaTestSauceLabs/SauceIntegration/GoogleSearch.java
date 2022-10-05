package NitikaTestSauceLabs.SauceIntegration;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch 

{
   public static WebDriver driver;
	
	public static final String USERNAME = "oauth-testingonfloify-ff6b8";

	  public static final String ACCESS_KEY = "8fbf4176-fe11-45d4-8df3-515dff6ac44c";

	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	  @BeforeTest
	  
public  static void search() throws MalformedURLException

{
		  DesiredCapabilities caps = new DesiredCapabilities();

		  caps.setCapability("browserName", "chrome");

			caps.setCapability("platform", "Windows 11");

			caps.setCapability("version", "106");
		//https://oauth-testingonfloify-ff6b8:8fbf4176-fe11-45d4-8df3-515dff6ac44c@ondemand.us-west-1.saucelabs.com:443/wd/hub		
	
	try 
	{
		driver=new RemoteWebDriver(new java.net.URL(URL), caps);
		//driver = new RemoteWebDriver(new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} 
	catch (MalformedURLException e) 
	{
		e.printStackTrace();
	}
	
}	
	
		@Test
	  public void login()
		{

			System.out.println("Input the URL");
			driver.get("http://google.com");
			System.out.println("Application is Started");
			System.out.println(driver.getTitle());
		}
				
	  
	  @AfterTest
	public void close()
	{
		driver.close();
	}
	
	
	
	
}

