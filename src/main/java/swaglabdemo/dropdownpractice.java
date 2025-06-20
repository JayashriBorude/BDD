package swaglabdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.org.apache.xpath.internal.operations.Div;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Division;

public class dropdownpractice {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[text()=\"one way\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"1 Adult\"]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//*[text()=\"1 Adult\"]")).getText());
for(int i=1;i<3;i++)
	{
		driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
	}	
driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]")).click();
driver.findElement(By.xpath("//*[text()=\"INR\"]")).click();

	
	}
}
