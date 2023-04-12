package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeproductpage {
	
	WebDriver ldriver;
	public Homeproductpage(WebDriver driver)
	{
		ldriver= driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement AddtocartElement ;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']")
	WebElement RemoveElement ;
	
	@FindBy(id="remove-sauce-labs-backpack")
	WebElement removeBackpack ;
	
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement CartlinkElement;
	
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement  filterElement ;
	
	
	@FindBy(xpath="//div[@class='header_secondary_container']")         
	WebElement nameElement;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menuElement;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutElement ;
	
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	WebElement allitemsElement ;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement aboutElement ;
	
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	WebElement resetappElement ;
	
	
	
	
	
	
	
	
	
	public void clickAddtocartbutton() {
		AddtocartElement.click();
	}
	public void clickcartlinkbutton() {
		CartlinkElement.click();
	}
	
	public void clickonmenubutton() {
		menuElement.click();
	}
	
	public void clickonlogoutbutton() {
		 logoutElement .click();
	}
	
	public void clickonremovebutton() {
		 RemoveElement.click();
	}
	
	public void clickonfilterbutton() {
		 filterElement.click();
	}
	
	public void clickonname() {
		nameElement.click();
	}
	
	public void clickonallitems() {
		allitemsElement.click(); 
	}
	
	
	public void clickonabout() {
		aboutElement.click();
	}
	
	public void clickonresetapp() {
	
	resetappElement.click();}
	
	public void clickonremoveBackpack() {
		if(removeBackpack.isDisplayed())
		{
		removeBackpack.click();
		}
	}
	
	
	
	
	
}
