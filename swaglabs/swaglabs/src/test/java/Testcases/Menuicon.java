package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Utility.Base;

public class Menuicon extends Base {
	
	
	
	
	@Test
	void verifymenuicon() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
	p.clickonmenubutton();
		
	}
	
	@Test
	void verifyallitems() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
	p.clickonmenubutton();
	p.clickonallitems();
	}
	
	@Test
	void verifyaboutbutton() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
	p.clickonmenubutton();
	p.clickonabout();
	}
	
	@Test
	void verifyresetapp() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
	p.clickonmenubutton();
	p.clickonresetapp();
	}
	@Test
	void verifylogoutbutton() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 

	Homeproductpage p=new Homeproductpage(driver);
	p.clickonmenubutton();
	p.clickonlogoutbutton();}
}
