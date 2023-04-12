package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Homeproductpage;
import Pages.Loginpage;
import Utility.Base;
import Utility.ExcelUtility;

public class Logintestcases extends Base
{
	
	@DataProvider
	Object readData() throws IOException {
		
        String loc="C:\\Users\\HP\\eclipse-workspace\\swaglabs\\resources\\data.xlsx";
		ExcelUtility read =new ExcelUtility(loc);
		int rows=read.getRowCount("Sheet1");
		int cols=read.getCellCount("Sheet1", rows);

	
	Object[][]data =new Object[rows][cols];
		
		for(int i=1;i<=rows;i++) 
		{  for (int j=0;j<cols;j++)
			
		{
		    data[  i-1][j]=read.getCellData("Sheet1", i, j);}
		
		}
		return data ;
	}
	
	
	
	
	
	
	@Test(dataProvider="readData")
	void verifyUser(String user ,String pass  )
	{
		System.out.println(user);   
		System.out.println(pass);
		
		driver.get("https://www.saucedemo.com/");
	   
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Loginpage login  = new Loginpage(driver);
		login.setUserName("standard_user");
		log.info("checkusernme");
		login.setPassword("secret_sauce");
		log.info("check pass");
		login.clickLoginButton(); 
		Homeproductpage p=new Homeproductpage(driver);
		p.clickonmenubutton();
		log.info("check menu");
		p.clickonlogoutbutton();
		 log.info("check logout");
	}
}