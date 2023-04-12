package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
   WebDriver ldriver;


	public  Loginpage (WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
			
		@FindBy(id="user-name")
		WebElement usernameElement;
		

		@FindBy(id="password")
		WebElement passElement;

		

		@FindBy(id="login-button")
		WebElement LoginBtnElement;
		
		
		public void setUserName(String username)
		{
			usernameElement.sendKeys(username);
		}
		
		
		public void setPassword(String password)
		{
			passElement.sendKeys(password);
		}
		
		
		public  void clickLoginButton()
		 {
			LoginBtnElement.click();
		 }
		

}
