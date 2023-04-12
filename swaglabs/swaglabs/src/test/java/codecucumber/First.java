package codecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	WebDriver driver;
	@Given("page is open in landing")
	public void page_is_open_in_landing() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

	@When("enter username")
	public void enter_username() {
		WebElement Username=  driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("standard_user");

	}

	@When("enter password")
	public void enter_password() {
		WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
	}

	@When("yet another action")
	public void yet_another_action() {
	   
	}

	@Then("homepage should appear  |")
	public void homepage_should_appear() {
		System.out.println("home should appeared");
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
