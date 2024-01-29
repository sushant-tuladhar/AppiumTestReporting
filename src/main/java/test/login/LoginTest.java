package test.login;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import helpers.HelperClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import pageobject.login.Login;
import pageobject.profile.Profile;

import java.net.MalformedURLException;

public class LoginTest extends HelperClass {

    @BeforeMethod
    public void setup() throws MalformedURLException {

        LoginTest loginTest=new LoginTest();
        loginTest.initiate();
        loginTest.setupPermission(3);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    // Login page validation of UI components if exists or not
    @Test
    public void validateLoginUIComponentsTest(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        Login.loginHeader();
        Login.backButton();
        Login.forgotUsername();
        Login.rememberMe();
        Login.forgotUsername();
        Login.username();
        Login.password();
    }

    //Login Test for valid scenario
    @Test
    public void validLoginTestWithProperCredentials(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        loginTest.login("autotester1","Avionte123");
        wait.until(ExpectedConditions.visibilityOf(Profile.profileBack()));
    }

    //Negative test here
    @Test
    public void invalidLoginTestwithWrongUsername(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        loginTest.login("automation","Random");

    }

    @Test
    public void invalidLoginWithWrongCredentials(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        loginTest.login("autotester1","Avionte1234");
    }

    @Test
    public void invalidLoginWithNoUsername(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        loginTest.login("","Avionte1234");
    }

    @Test
    public void invalidLoginWithNoPassword(){
        LoginTest loginTest=new LoginTest();
        loginTest.loginButtonClick();
        loginTest.login("autotester","");
    }
}
