package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"stepDefinitions"},
		tags = "@activity1_2",
		//tags = "@activity1_1 or @activity1_2",
		plugin = {"html: reports/json_report.html"},
		monochrome = true
		)

public class ActivitiesRunner {}
