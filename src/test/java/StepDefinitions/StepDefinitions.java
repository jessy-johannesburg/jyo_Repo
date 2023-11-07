package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import cucumber.api.java.After;


import java.util.concurrent.TimeUnit;

public class StepDefinitions  {
    public static WebDriver driver;
//    private static LoginPage loginPage;

//    public StepDefinitions() {
//        loginPage = new LoginPage(driver);
//    }
@Before
public void launchBrowser(){
    System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}
    @Given("^User is on the login page$")
    public void userIsOnTheLoginPage() {
        driver.get("https://www.amazon.in/");
        System.out.println("Lauched browser and entered URL");
    }

    @When("^User captures MobileNumber and password \"([^\"]*)\",\"([^\"]*)\"$")
    public void UserCapturesMobileNumberAndPassword(String mobnum, String pwd) throws Throwable {
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("9966477626");
        System.out.println("Entered mobnum");
        driver.findElement(By.id("continue")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("ap_password")).sendKeys("Sriraju.5");
        Thread.sleep(5000);


    }

    @Then("^User logged in successfully$")
    public void UserLoggedInSuccessfully() {
        driver.findElement(By.id("signInSubmit")).click();
        System.out.println("user logged in siccessfully");

    }

    @Then("^User selects Electronic option$")
    public void UserSelectsElectronicOption() throws InterruptedException {
        driver.findElement(By.linkText("Electronics")).click();
        System.out.println("selected electronics");
        Thread.sleep(3000);
    }


@After

    public void closeBrowser() {
        driver.quit();
    System.out.println("Browser closed");
    }
}