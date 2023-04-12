package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Utility.Base;

public class Logoutbutton extends Base {
	
	
	
	
	@Test
void verifylogout() {
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Loginpage login  = new Loginpage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton(); 
	//System.out.println("Script runn till hereeeeeeeeeeeeeeeeeeeeeee");
	Homeproductpage p=new Homeproductpage(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	p.clickonmenubutton();
	p.clickonlogoutbutton();

	
	if(driver.getTitle().equals("Swag Labs"))
	{
		Assert.assertTrue(true);
		System.out.println("VERIFIED THIS IS THE HOME PAGE ");
	}
	else
	{
		Assert.assertTrue(false);
		System.out.println("Its nottttttttttttt okkkkkkkkkkkkkkkkkkkkkkkkkkk");
	}
	
	
	
	}
}
