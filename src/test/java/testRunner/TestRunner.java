package testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions.Driver;


@RunWith(Cucumber.class)
@CucumberOptions(features ="Features/", tags = "@regression", plugin = {"pretty", 
		"html:target/cucumber/html-report.html", "json:target/cucumber/cucumber.json", "junit:target/cucumber/cucumber.xml"},
		glue = {"stepDefinitions"})
public class TestRunner {
	
	@BeforeClass
	public static void beforeClass() {
		
	}

	@AfterClass
	public static void afterClass() {
		
	}
}
