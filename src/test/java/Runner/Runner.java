package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/Features"},
        glue = {"StepDefinitions"},
        tags = "@Login",
        dryRun = false,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentReport.html", "pretty", "json:target/reports/cucumber.json",},
        monochrome = true)

public class Runner {


}

