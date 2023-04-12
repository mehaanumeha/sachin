package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourcart {
	
	WebDriver ldriver;


	public Yourcart (WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);
		}
		
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutElement ;
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continueElement ;
	
	
	public void clickoncheckout() {
		checkoutElement.click();
	}
   public void clickoncontinue() {
	   continueElement.click();
   }

	 
	
	
	
	
	
	
	
	
	}


