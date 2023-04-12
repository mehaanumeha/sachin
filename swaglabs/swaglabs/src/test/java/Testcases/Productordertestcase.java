package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Pages.Overviewpage;
import Pages.Yourcart;
import Pages.Yourinformation;
import Utility.Base;

public class Productordertestcase extends Base{
	
	
	
	@Test()

	void  verifyproductorder() throws InterruptedException {
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
    p.clickonremoveBackpack();
	p.clickAddtocartbutton();
	p .clickcartlinkbutton() ;

	Yourcart y=new Yourcart(driver);
	y.clickoncheckout();
	Yourinformation info =new Yourinformation(driver);
	info.setfirstname("Sachin");
	info.setlastname("Wankhade");
	info.setpostalcode("abcd");
	info.clickoncontinuebutton();

Overviewpage finish=new Overviewpage(driver);
finish.clickonfinishbutton();
Thread.sleep(3000);
finish.clickonmenubutton();
finish.clickonlogoutbutton();
	
	}

	@Test(priority=1)
	void verifyordercancel() {
		driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Loginpage login  = new Loginpage(driver);
login.setUserName("standard_user");
login.setPassword("secret_sauce");
login.clickLoginButton(); 

Homeproductpage p=new Homeproductpage(driver);
p.clickAddtocartbutton();
p .clickcartlinkbutton() ;
 
Yourcart y=new Yourcart(driver);
y.clickoncheckout();
Yourinformation info =new Yourinformation(driver);
info.setfirstname("Sachin");
info.setlastname("Wankhade");
info.setpostalcode("abcd");
info.clickoncontinuebutton();

Overviewpage finish=new Overviewpage(driver);
		finish.clickoncancelbutton();
	}
	
	
	@Test(priority=2)
	void verifycontinueshopping() {
		driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Loginpage login  = new Loginpage(driver);
login.setUserName("standard_user");
login.setPassword("secret_sauce");
login.clickLoginButton(); 
Homeproductpage p=new Homeproductpage(driver);
	p.clickcartlinkbutton();
	
	Yourcart y=new Yourcart(driver);
	y.clickoncontinue();	
	}
	
	
	
	
	
}





