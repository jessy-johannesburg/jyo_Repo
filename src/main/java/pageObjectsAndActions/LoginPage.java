package pageObjectsAndActions;

import base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//*[@class='login_logo']")
    public WebElement logo;

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement homePageProducts;

    @FindBy(xpath = "//*[text()='Epic sadface: Sorry, this user has been locked out.']")
    public WebElement lockedOutUserError;

    @FindBy(xpath = "//*[@src='/static/media/sauce-backpack-1200x1500.34e7aa42.jpg']")
    public WebElement imageBackPack;

    @FindBy(xpath = "(//*[@src='/static/media/sl-404.168b1cce.jpg'])[1]")
    public WebElement dogImage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void applicationLogoDispalyed(){
        logo.isDisplayed();
        System.out.println("Application logo displayed");
    }

    public void captureUsername(String uname){
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        username.sendKeys(uname);
//        System.out.println("Captured username");
    }

    public void capturePassword(String pwd){
//        password.sendKeys(pwd);
//        System.out.println("Captured password");
    }

    public void clickLoginButton(){
//        loginBtn.click();
//        System.out.println("Clicked login button");
    }

    public void homePageProductTextDisplayed(){
//        homePageProducts.isDisplayed();
//        String homePageProductText=homePageProducts.getText();
//        Assert.assertEquals("PRODUCTS",homePageProductText);
//        System.out.println("Home Page title:"+ homePageProductText);

    }
    public void backPackImageDisplayed(){
//        imageBackPack.isDisplayed();
//        System.out.println("BackPack image displayed");

    }
    public void lockedOutUserErrorDisplayed() throws InterruptedException {
//        Thread.sleep(5000);
//        lockedOutUserError.isDisplayed();
//        System.out.println("Locked user error message displayed");

    }
}
