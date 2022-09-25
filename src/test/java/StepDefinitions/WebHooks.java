package StepDefinitions;

import base.BaseClass;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import org.junit.After;
import org.junit.Before;


import java.io.IOException;

public class WebHooks extends BaseClass {

    @Before
    public void BeforeScenarios() throws IOException {
      launchBrowserAndURL();
    }

    @After
    public void AfterScenarios(){
        driver.quit();
    }
}
