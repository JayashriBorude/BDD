package swaglabdemo.Abstract;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {

		WebDriver driver;
	
		public Abstract(WebDriver driver) 
		{
		this.driver=driver;
		
		}
		@FindBy(id="confirmation")
		WebElement confirmationmsg;
		
		public String waitToConfirmMsg()
		{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		String Text=wait.until(ExpectedConditions.visibilityOf(confirmationmsg)).getText();
		return Text;
		
		}
}
