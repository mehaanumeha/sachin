package codecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Second {
	WebDriver driver;
	
	@Given("landing page is open")
	public void landing_page_is_open() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@When("enter username is {string} in usernamefield")
	public void enter_username_is_in_usernamefield(String string) {
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(string);
	}

	@When("enter password is {string} in passwordfield")
	public void enter_password_is_in_passwordfield(String string) {
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(string);
	}

	@When("click on button")
	public void click_on_button() {
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}

	@Then("home page will appear")
	public void home_page_will_appear() {
		System.out.println("my home is opening ");
		driver.close();
	    
	}

	@Then("User    should Stay on login Page")
	public void user_should_Stay_on_login_Page() {
		System.out.println("its still on the login page ");
		driver.close();
	}

	
	}



