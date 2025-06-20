package swaglabdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import swaglabdemo.Abstract.Abstract;

import java.util.List;
public class products extends Abstract {
	
WebDriver driver;

public products(WebDriver driver)
{
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//Page factory


	@FindBy(id ="add_btn")
	WebElement addbutton;//*[@id="add_btn"]
	
	@FindBy(xpath="(//*[@class=\"input-field\"])[2]")
	WebElement additem;
	
	@FindBy(xpath="(//*[@id=\"save_btn\"])[2]")
	WebElement save;
	
	public void add()
	{
		addbutton.click();
	
	}
		
	public void actions()
	{
		Actions a=new Actions(driver);
		a.moveToElement(additem).click().keyDown(Keys.SHIFT).sendKeys("burger").build().perform();
		a.moveToElement(save).click().build().perform();
	}




}







