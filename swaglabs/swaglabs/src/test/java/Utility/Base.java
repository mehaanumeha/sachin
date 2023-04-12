package Utility;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static ReadConfigFile read=new ReadConfigFile();
	public static String global_username=read.getUsername();
	public static String global_password=read.getPassword();
	public static String url=read.getUrl();
	public static String browser=read.getBrowser() ;
	public static Logger log;
	 public static  WebDriver driver;
	 

@BeforeTest
   public void setup() {
  if (browser.equals("chrome"))
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	log=Logger.getLogger("swaglabs");
	PropertyConfigurator.configure("logfile.properties");
}
if (browser.equals("firefox"))
	
{    System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.32.2-win32\\geckodriver.exe");

          driver = new FirefoxDriver();
	//WebDriverManager.firefoxdriver().setup();
	//driver= new FirefoxDriver();}
         log=Logger.getLogger("swaglabs");
   PropertyConfigurator.configure("logfile.properties");
}}
	
@AfterTest
public void teardown()
{
	driver.quit();
}

}
