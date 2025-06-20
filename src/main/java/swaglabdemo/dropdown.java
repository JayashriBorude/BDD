package swaglabdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	WebDriver driver;
	
	  public static void main(String[] args) throws InterruptedException {
	   
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
     
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		
		driver.findElement(By.xpath("//input[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"] ")).click();
		driver.findElement(By.xpath("//a[@value=\"PNQ\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value=\"AMD\"])[2]")).click();
		driver.findElement(By.xpath("//td[@class=\" ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT\"]"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
			
		
		
		
		

	}

}
