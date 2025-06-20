package swaglabdemo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Endtoendtest {
	private static final WebDriver WebDriver = null;
	WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
     
		WebDriver driver = new ChromeDriver();
		
		loginpage logpage=new loginpage(driver);
		logpage.gotourl();
		//logpage.loginactions("student","Password123");
		
		products productitems=new products(driver);
		productitems.add();
		String Text=productitems.waitToConfirmMsg();
		System.out.println(Text);
		Assert.assertEquals(Text,"Row 2 was added");
		productitems.actions();
		driver.close();
		
		
		
		
		
		
		
		
	}
	}


