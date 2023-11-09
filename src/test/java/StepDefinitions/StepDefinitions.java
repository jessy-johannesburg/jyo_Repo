package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import cucumber.api.java.After;


import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    public static WebDriver driver;
//    private static LoginPage loginPage;

    //    public StepDefinitions() {
//        loginPage = new LoginPage(driver);
//    }
    @Before
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("^User is on the login page$")
    public void userIsOnTheLoginPage() {
        driver.get("https://www.facebook.com/");
        System.out.println("Launched browser and entered URL");
    }

    @When("^User captures email and password \"([^\"]*)\",\"([^\"]*)\"$")
    public void UserCapturesEmailAndPassword(String email, String pwd) throws Throwable {
//        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("email")).sendKeys("srinika55@gmail.com");
        System.out.println("Entered email");
        driver.findElement(By.id("pass")).sendKeys("Sriraju.5");
        System.out.println("Entered password");
    }

    @Then("^User logged in successfully$")
    public void UserLoggedInSuccessfully() {
        driver.findElement(By.name("login")).click();
        System.out.println("user logged in successfully");

    }

    @Then("^User selects Allow button$")
    public void UserSelectsAllowButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("pass")).sendKeys("Sriraju.5");
        driver.findElement(By.name("login")).click();
        System.out.println("Clicked on login button");
        Thread.sleep(5000);
        String url = driver.getCurrentUrl();
        System.out.println(url);

    }


    @After

    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed");
    }
}