package runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\vishal mittal\\workspace\\CucumberTestagain\\src\\test\\java\\features\\WikiPage.feature"
	,glue={"stepDefinition"})
	public class TestRunner {

	}


