package NitikaTestSauceLabs.SauceIntegration;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestGoogle 
{

	public static final String USERNAME = "oauth-testingonfloify-ff6b8";

	  public static final String ACCESS_KEY = "8fbf4176-fe11-45d4-8df3-515dff6ac44c";

	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	  
	  public static void main(String[] args) throws Throwable 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		

		caps.setCapability("platform", "Windows 11");

		caps.setCapability("version", "106");
		//WebDriver driver;

		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);

		//WebDriverManager.chromedriver().setup();
		
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Input the URL");
		driver.get("http://google.com");
		System.out.println("Application is Started");
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
	}

}
