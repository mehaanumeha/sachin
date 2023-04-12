package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Pages.Yourcart;
import Pages.Yourinformation;
import Utility.Base;

public class Cartinformcheck extends Base {
	
	
	
	
	
	@Test()
       void  verifywithblankinfo () throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 
	Homeproductpage p=new Homeproductpage(driver);
	p.clickAddtocartbutton();
	p .clickcartlinkbutton() ;
Thread.sleep(3000);
	Yourcart y=new Yourcart(driver);
			y.clickoncheckout() ;  
	Yourinformation info =new Yourinformation(driver);
	info.setfirstname("");
	info.setlastname("");
	info.setpostalcode("");
	info.clickoncontinuebutton();
	//p.clickonmenubutton();
	//p.clickonlogoutbutton();
	
	Thread.sleep(3000);
//	priority=1,dependsOnMethods ="verifywithblankinfo" )
	}
	@Test( )
	void verifywithonlysetfirstname() {
		driver.get("https://www.saucedemo.com/");
		
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Homeproductpage p=new Homeproductpage(driver);
	
	
	p .clickcartlinkbutton() ;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Yourcart y=new Yourcart(driver);
			y.clickoncheckout() ;  
	Yourinformation info =new Yourinformation(driver);
	info.setfirstname("use");
	info.setlastname("");
	info.setpostalcode("");
	info.clickoncontinuebutton();}
		
	@Test
	void verifywithonlysetlastname() {
		driver.get("https://www.saucedemo.com/");
		
		Loginpage login  = new Loginpage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homeproductpage p=new Homeproductpage(driver);
		
		
		p .clickcartlinkbutton() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Yourcart y=new Yourcart(driver);
				y.clickoncheckout() ;  
		Yourinformation info =new Yourinformation(driver);
		info.setfirstname("");
		info.setlastname("wankhade");
		info.setpostalcode("");
		info.clickoncontinuebutton();}
		
	@Test
	void verifywithonlysetpasscode() {	
		
driver.get("https://www.saucedemo.com/");
		
		Loginpage login  = new Loginpage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homeproductpage p=new Homeproductpage(driver);
		
		
		p .clickcartlinkbutton() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Yourcart y=new Yourcart(driver);
		y.clickoncheckout() ;  
		Yourinformation info =new Yourinformation(driver);
		info.setfirstname("");
		info.setlastname("");
		info.setpostalcode("abcd");
		info.clickoncontinuebutton();}
	
	
	@Test
	void verifywithsetthreevalue() {
		driver.get("https://www.saucedemo.com/");
		Loginpage login  = new Loginpage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homeproductpage p=new Homeproductpage(driver);
		p .clickcartlinkbutton() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Yourcart y=new Yourcart(driver);
		y.clickoncheckout() ;  
		Yourinformation info =new Yourinformation(driver);
		info.setfirstname("sachin");
		info.setlastname("wankhade");
		info.setpostalcode("abcd");
		info.clickoncontinuebutton();}
	
	@Test
	void verifywithrandomaddress() {
		driver.get("https://www.saucedemo.com/");
		Loginpage login  = new Loginpage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homeproductpage p=new Homeproductpage(driver);
		p .clickcartlinkbutton() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Yourcart y=new Yourcart(driver);
		y.clickoncheckout() ;  
		Yourinformation info =new Yourinformation(driver);
		info.setfirstname("rd");
		info.setlastname("h");
		info.setpostalcode("1");
		info.clickoncontinuebutton();}
		
		
	}
		
		
		
		
		
		
			
			
	
	
	
	
	
	
	
	
	
	
	
	


