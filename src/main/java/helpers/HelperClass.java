package helpers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.Permissions;
import pageobject.dashboard.Dashboard;
import pageobject.login.Login;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HelperClass{
    String baseURL="http://0.0.0.0:4723/";
    public static AndroidDriver driver;

    public static WebDriverWait wait;
    // Make it runnable from the command line from where it is executed in the future and try to pass the variable from fixtures
    public void initiate() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","13.0");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","/Users/sushanttuladhar/Downloads/avionte247-4.16.135.140.apk");
        driver=new AndroidDriver(new URL(baseURL),desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        System.out.println("Connection initailized and working fine");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setupPermission(int commonPermissionCount){
        wait.until(ExpectedConditions.visibilityOf(Permissions.appPermission()));
        Permissions.appPermission().click();
        wait.until(ExpectedConditions.visibilityOf(Permissions.locationPermission()));
        Permissions.locationPermission().click();
        // Repeats the number of count we need for setting yp the permission will be replaced by adb shell in after optimization
        for(int i=0;i<commonPermissionCount;i++){
            wait.until(ExpectedConditions.visibilityOf(Permissions.commonPermissions()));
            Permissions.commonPermissions().click();
        }
    }

    public void loginButtonClick(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Login.loginButton));
        driver.findElement(Login.loginButton).click();
    }

    public void login(String username, String password){
        wait.until(ExpectedConditions.visibilityOf(Login.username()));
        Login.username().sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(Login.password()));
        Login.password().sendKeys(password);
        loginButtonClick();
    }

    public void profileButtonClick(){
        wait.until(ExpectedConditions.visibilityOf(Dashboard.profileButton()));
        Dashboard.profileButton().click();
    }
}