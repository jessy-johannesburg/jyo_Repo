package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions  {
    public static WebDriver driver;
//    private static LoginPage loginPage;

//    public StepDefinitions() {
//        loginPage = new LoginPage(driver);
//    }

    @Given("^User is on the login page$")
    public void userIsOnTheLoginPage() {
        System.setProperty("webdriver.edge.driver", "src/test/resources/Drivers/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println("Lauched browser and entered URL");
    }

    @When("^User captures username and password \"([^\"]*)\",\"([^\"]*)\"$")
    public void user_captures_username_and_password(String uname, String pwd) throws Throwable {
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        System.out.println("Entered Keys");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        Thread.sleep(5000);
        System.out.println(" clicked on search button");
    }

    @Then("^Standard User logged in successfully$")
    public void standardUserLoggedInSuccessfully() {

    }

    @Then("^Locked Out User not logged in successfully and error displayed$")
    public void lockedOutUserNotLoggedInSuccessfullyAndErrorDisplayed() throws InterruptedException {

    }

    @Then("^Problem User logged in successfully and backpack image not displayed$")
    public void problemUserLoggedInSuccessfullyAndBackpackImageNotDisplayed() {

    }

    @Then("^Performance User logged in successfully$")
    public void performanceUserLoggedInSuccessfully() {
    }
}


