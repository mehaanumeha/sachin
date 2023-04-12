package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overviewpage {
	WebDriver ldriver;
	public Overviewpage (WebDriver driver)
	{
		ldriver= driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement CancelElement ;
	
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement FinishElement ;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuElement;
	
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutElement ;
	
	
	
	
	
	
	public void clickonfinishbutton() {
		FinishElement.click();
	}
	public void clickonmenubutton() {
		menuElement.click();
	}
	
	public void clickonlogoutbutton() {
		 logoutElement .click();
	}
	public void clickoncancelbutton() {
		CancelElement.click();
	}
	
}
