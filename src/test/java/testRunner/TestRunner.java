package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="Features/", tags = "@regression", plugin = {"pretty", 
		"html:target/cucumber/html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},
		glue = {"stepDefinitions"})
public class TestRunner {

}
