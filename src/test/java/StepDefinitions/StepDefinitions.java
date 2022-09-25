package StepDefinitions;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjectsAndActions.LoginPage;

public class StepDefinitions extends BaseClass {

    private static LoginPage loginPage;

    public StepDefinitions() {
        loginPage = new LoginPage(driver);
    }

    @Given("^User is on the login page$")
    public void userIsOnTheLoginPage() {
        loginPage.applicationLogoDispalyed();
    }

    @When("^User captures username and password \"([^\"]*)\",\"([^\"]*)\"$")
    public void user_captures_username_and_password(String uname, String pwd) throws Throwable {
        loginPage.captureUsername(uname);
        loginPage.capturePassword(pwd);
        loginPage.clickLoginButton();
    }

    @Then("^Standard User logged in successfully$")
    public void standardUserLoggedInSuccessfully() {
        loginPage.homePageProductTextDisplayed();
        loginPage.backPackImageDisplayed();
    }

    @Then("^Locked Out User not logged in successfully and error displayed$")
    public void lockedOutUserNotLoggedInSuccessfullyAndErrorDisplayed() throws InterruptedException {
        loginPage.lockedOutUserErrorDisplayed();
    }

    @Then("^Problem User logged in successfully and backpack image not displayed$")
    public void problemUserLoggedInSuccessfullyAndBackpackImageNotDisplayed() {
        try {
            if (loginPage.imageBackPack.isDisplayed()) {
                System.out.println("Back pack displayed and test failed");
            }
        } catch (Exception e) {
            System.out.println("Back pack not found And Test passed");
        }
    }

    @Then("^Performance User logged in successfully$")
    public void performanceUserLoggedInSuccessfully() {
        loginPage.homePageProductTextDisplayed();
        loginPage.backPackImageDisplayed();
        System.out.println("Working as standard user");
    }
}


