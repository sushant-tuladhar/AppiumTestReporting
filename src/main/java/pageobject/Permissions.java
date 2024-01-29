package pageobject;

import helpers.HelperClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Permissions extends HelperClass {

    private static WebElement element=null;

    public static WebElement locationPermission(){
        element=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        return element;
    }

    public static  WebElement commonPermissions(){
        element= driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        return element;
    }

    //This is for the app opening permissions
    public static WebElement appPermission(){
        element=driver.findElement(By.id("android:id/button1"));
        return element;
    }
}
