package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstScriptMaven {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/"); // it will open  the page
						
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
  		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
  		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
  	
  		username.sendKeys("standard_user");
 		password.sendKeys("secret_sauce");
 		login.click();
 		
 		Thread.sleep(3000);
 		driver.close();
	}

}
