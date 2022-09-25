package Runner;


//import com.cucumber.listener.ExtentProperties;
import base.BaseClass;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.lang.System.getProperty;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},
        tags = "@Login",
        dryRun = false,
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentReport.html", "pretty", "json:target/reports/cucumber.json",},
        monochrome = true)

public class Runner {


    public static void setup() {
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
        String userDir = System.getProperty("user.dir");
        extentProperties.setReportPath(userDir + "/target/cucumber-reports/WebReports/Web_" + timeStamp + ".html");

    }

    @AfterClass
    public static void teardown() {
//        Reporter.loadXMLConfig(new File(getProperty("user.dir") + "/extent-web-config.xml"));
        Reporter.setSystemInfo("User Name", "Jyothsna Talasani");
        Reporter.setSystemInfo("Application Name", "Online Shopping");
        Reporter.setSystemInfo("Operating System Type", getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "QA");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
        setup();
    }
}
