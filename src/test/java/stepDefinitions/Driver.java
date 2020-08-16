package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static WebDriver chromeDriver;
	private  static Driver driver;
	
	private Driver() {
		
	}
	
	public static WebDriver getDriver() {
		if(driver==null) {
			driver = new Driver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Interview Questions\\Drivers\\chromedriver.exe");
			chromeDriver = new ChromeDriver();
			return chromeDriver;
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Interview Questions\\Drivers\\chromedriver.exe");
			chromeDriver = new ChromeDriver();
			return chromeDriver;
		}
			
	}
	
	

}
