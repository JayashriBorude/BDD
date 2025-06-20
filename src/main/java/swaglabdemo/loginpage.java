package swaglabdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import swaglabdemo.Abstract.Abstract;

public class loginpage extends Abstract {
	
WebDriver driver;

public loginpage(WebDriver driver) 
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//Page factory
	//WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	//WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	//WebElement loginbutton = driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	public void gotourl()
	{
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");
	}

	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="submit")
	WebElement loginbutton;
	
	public void loginactions(String email,String password)
	{
		userName.sendKeys(email);
		passWord.sendKeys(password);
		loginbutton.click();
		
	}
}







