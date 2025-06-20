package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target/report.html"},
		features = "src/test/resources/FeatureScenario",
        glue = "stepdefs"
        )

public class LoginTestRunner {
	
	
}
