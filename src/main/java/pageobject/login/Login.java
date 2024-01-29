package pageobject.login;

import helpers.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends HelperClass {
    private static WebElement element=null;
    public static By loginButton= By.id("com.serveture.avionte:id/btn_login");

    public static WebElement username(){
        element= driver.findElement(By.id("com.serveture.avionte:id/et_username"));
        return element;
    }

    public static WebElement password(){
        element=driver.findElement(By.id("com.serveture.avionte:id/et_psw"));
        return element;
    }

    public static WebElement rememberMe(){
        element= driver.findElement(By.id("com.serveture.avionte:id/checkbox_remember_me"));
        return element;
    }

    public static WebElement forgotPassword(){
        element= driver.findElement(By.id("com.serveture.avionte:id/textview_forgot_password"));
        return element;
    }

    public static WebElement forgotUsername(){
        element= driver.findElement(By.id("com.serveture.avionte:id/textview_forgot_password"));
        return element;
    }

    public static WebElement backButton(){
        element= driver.findElement(By.id("com.serveture.avionte:id/iv_back"));
        return element;
    }

    public static WebElement loginHeader(){
        element= driver.findElement(By.id("com.serveture.avionte:id/tv_toolbar"));
        return element;
    }
}
