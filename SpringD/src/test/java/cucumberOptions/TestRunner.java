package cucumberOptions;

import org.junit.runner.RunWith; // Runner file is converted into TestNG by AbstractTestNG*** class	

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
                  "junit:target/cucumber-reports/cucumber.xml",
                  "html:target/cucumber-reports/cucumber.html",
                  "json:target/cucumber-reports/cucumber.json"},
		features = "src/test/java/features",
		glue = "stepDefinitions",
		tags = "@Sanity")
public class TestRunner extends AbstractTestNGCucumberTests{
//public class TestRunner{
}
