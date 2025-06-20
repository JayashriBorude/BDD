package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorspractice {
		WebDriver driver;
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/s?k=iphone14&crid=2KKGN7H0HFHD5&sprefix=iphone14%2Caps%2C356&ref=nb_sb_noss_2");
			System.out.println(driver.findElement(By.xpath("//*[text()=\"Apple iPhone 13 (128GB) - Blue\"]/parent::h2/parent::a//parent::div/following-sibling::div[@class=\"puisg-row\"]/child::div/descendant::span[@class=\"a-price-whole\"]")).getText());
	
			driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	Thread.sleep(3000);
	 List<WebElement> products=driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
	   for(int i=0;i<=products.size();i++)
	   {
		   String name=products.get(i).getText();
		   System.out.println(name);
		   	for(int j=6;j>=i;j--)
		   {driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"]")).click();
	       }
		}
	   driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
	   List<WebElement> prizes=driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
	   for(int k=0;k<=products.size();k++)
	   {
		   String prizevalue=prizes.get(k).getText();
		   System.out.println(prizevalue);
	   }
		   
	
	
	}

}
