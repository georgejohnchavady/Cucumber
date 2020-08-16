package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.out.println("1");
		driver = Driver.getDriver();
		
	}

	@When("I open home page")
	public void i_open_home_page() throws InterruptedException {
		System.out.println("2");
		
		driver.get("http://localhost:8080/login.do");
		
	}

	@Then("I validate the logo present on home page")
	public void i_validate_the_logo_present_on_home_page() {
		System.out.println("3");
		boolean remember = driver.findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[3]/td[2]/input")).isDisplayed();
		Assert.assertEquals(true, remember);
	}
	
	@Then("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) {
		System.out.println("4");
		LoginPage loginPage = new LoginPage(driver);
	    loginPage.getUsername().sendKeys(username);
	    loginPage.getPassword().sendKeys(password);
	    loginPage.getSubmit().click();
	}


	@Then("I logout")
	public void i_logout() {
		System.out.println("5");
		HomePage homePage = new HomePage(driver);
		String homeText = homePage.getHome().getText();
		assertEquals("Home", homeText);
		homePage.getLogout_button().click();
	    
	}

	@Then("close browser")
	public void close_browser() {
		System.out.println("6");
		
		driver.quit();
		driver = null;
		
	}

	
	

}
