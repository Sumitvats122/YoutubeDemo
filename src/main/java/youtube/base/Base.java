package youtube.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;


public  Base()
{
	try
	{
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\admin\\Desktop\\Automation\\youtube\\src\\main\\java\\resources\\Config.properties");
    prop.load(ip);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}



public void launch_browser(String browser) throws Exception
{
	if(browser.equalsIgnoreCase("Chrome"))
	{
	     WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
	}

   else if(browser.equalsIgnoreCase("Firefox"))
       {
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
       }

   else if(browser.equalsIgnoreCase("Edge"))
   	   {
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
   	   }

  else
  	  {
	//If no browser passed throw exception
	   throw new Exception("Browser is not correct");
  	  }
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	

}}

	


