package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div/button[1]")
	WebElement home;
	
	@FindBy(xpath = "//*[@id=\"logout\"]/a")
	WebElement logout_button;

	public WebElement getHome() {
		return home;
	}

	public WebElement getLogout_button() {
		return logout_button;
	}

}
