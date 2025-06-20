package swaglabdemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addcart {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
     
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
		String[] items= {"Sauce Labs Backpack","xyz"};
		
	     List<WebElement> product=driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
	   
		for(int i=0;i<product.size();i++)
		{	
			
	               String name= product.get(i).getText();
	                System.out.println(name);
	               List itemsneeded=Arrays.asList(items);
	        if(itemsneeded.contains(name))
	        {
	    	driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"]")).click();
	   
	         }
	    
		}
	
	
		
	}

}
