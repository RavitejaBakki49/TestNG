package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports/report.html", "json:target/cucumber-reports/report.json",
		"junit:target/cucumber-reports/report.xml" }, monochrome = true)
public class TestsRunner extends AbstractTestNGCucumberTests {

}
