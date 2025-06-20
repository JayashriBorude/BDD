package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	ChromeDriver driver;
	
	@When("User entered correct login id")
	public void user_entered_correct_login_id() throws Throwable {
		WebElement userID=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));			
		userID.sendKeys("standard_user");
	}

	@When("User entered correct password")
	public void user_entered_correct_password() throws Throwable {
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("secret_sauce");
	}

	@And("User clicked on login button")
	public void user_clicked_on_login_button() throws Throwable {
		WebElement login=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		login.click();
	}

	@Then("user able to login")
	public void user_able_to_login() throws Throwable {

	}
	
	@Given("lauch browser and url")
	public void lauch_browser_and_url() throws Throwable {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
     

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/v1/");
	}
}
