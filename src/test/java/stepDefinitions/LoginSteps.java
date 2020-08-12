package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Interview Questions\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@When("I open home page")
	public void i_open_home_page() {
		
		driver.get("http://localhost:8080/login.do");
		
	}

	@Then("I validate the logo present on home page")
	public void i_validate_the_logo_present_on_home_page() {
		
		boolean remember = driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[3]/td[2]/input")).isDisplayed();
		Assert.assertEquals(true, remember);
	}

	@Then("close browser")
	public void close_browser() {
		
		driver.quit();
		
	}

	
	

}
