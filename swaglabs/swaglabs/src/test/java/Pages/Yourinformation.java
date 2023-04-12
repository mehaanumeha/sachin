package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourinformation {
	
	WebDriver ldriver;
    public Yourinformation  (WebDriver driver)
		{
		    ldriver= driver;
			PageFactory.initElements(driver, this);}
			
			
    @FindBy(xpath="//input[@id='first-name']")
	WebElement firstnameElement;
	
    @FindBy(xpath="//input[@id='last-name']")
    WebElement lastnameElement;
    @FindBy(xpath="//input[@id='postal-code']")
    WebElement postalcodeElement;
    @FindBy(xpath=" //input[@id='continue']")
    WebElement continuebuttonElement;
    
    
    public void setfirstname(String firstname) {
    	firstnameElement.sendKeys(firstname);  }
    public void setlastname(String lastname)
    {
    	lastnameElement.sendKeys(lastname);
    	
    }
    
    public void setpostalcode(String code ) {
    postalcodeElement.sendKeys(code);
       }
    
  //input[@id='postal-code']
    
    public void clickoncontinuebutton() {
    	continuebuttonElement.click();
    	
    }
	
			
			
			
		}


		


