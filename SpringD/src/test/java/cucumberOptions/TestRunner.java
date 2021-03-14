package cucumberOptions;

/*import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 

 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features = "src/test/java/features",
 * glue={"src/test/java/stepDefinition"} )
 * 
 * public class TestRunner {
 * 
 * }
 
*/

//import org.junit.runner.RunWith; // Runner file is converted into TestNG by AbstractTestNG*** class	

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", "junit:target/cucumber-reports/cucumber.xml",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json" }, 
features = "src/test/java/features", 
tags = "@Regression",
glue = "stepDefinitions")

public class TestRunner extends AbstractTestNGCucumberTests {
}	
