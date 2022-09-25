package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public BaseClass() {

    }
    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @Before
    public void launchBrowserAndURL() throws IOException {
        setupWebDriver("chrome");
        driver.navigate().to("https://www.investec.com/");
    }
    public WebDriver setupWebDriver(String browserName) throws IOException {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/Drivers/msedgedriver");
            driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    @After
    public void closeBrowser() throws IOException {
      driver.quit();
    }

}