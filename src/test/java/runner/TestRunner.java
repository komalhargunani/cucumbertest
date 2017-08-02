package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"stepDefination"}
		,plugin={"html:target/reports","json:target/cucumber.json"}
		)

public class TestRunner {

}
