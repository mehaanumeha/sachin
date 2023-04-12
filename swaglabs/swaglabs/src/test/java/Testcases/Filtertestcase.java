package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Utility.Base;

public class Filtertestcase extends Base {
	
	
	
	
	@Test
	void verifyfilter() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 
         
	Homeproductpage p=new Homeproductpage(driver);
	p.clickonfilterbutton();
	p.clickonname();
	
	}

}
