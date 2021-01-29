package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"stepDefinitions"},
		tags = "@jobBoardActivity4",
		plugin = {"html: Projectreports/json_report.html"},
		monochrome = true
		)

public class ActivitiesRunner {

}
