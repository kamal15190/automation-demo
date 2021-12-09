package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "..\\features\\GetLatestLaunchDetails.feature",
		glue = {"stepDefinition"},
		monochrome = true
		)
public class TestRunner {

}
