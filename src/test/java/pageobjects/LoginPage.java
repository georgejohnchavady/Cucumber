package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[1]/td[2]/input")
	WebElement username;
	
	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[2]/td[2]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[4]/td[1]/input")
	WebElement submit;
	

}
