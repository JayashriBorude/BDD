package practice;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13533544747528119642&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class=\"nav-a  \"]"))).contextClick().keyDown(Keys.SHIFT).click().build().perform();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		int pincode=411018;
		a.moveToElement(driver.findElement(By.xpath("//*[@placeholder=\"Enter an Indian pincode\"]"))).click().sendKeys(String.valueOf(pincode));
		a.moveToElement(driver.findElement(By.xpath("//div[@class=\"a-column a-span4 a-span-last\"]//span//span//input"))).click().build().perform();
		
}
}
