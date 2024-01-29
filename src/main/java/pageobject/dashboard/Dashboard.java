package pageobject.dashboard;

import helpers.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard extends HelperClass {

    private static WebElement element=null;

    public static WebElement profileButton(){
        element=driver.findElement(By.id("com.serveture.avionte:id/provider_profile"));
        return element;
    }

    public static WebElement settingButton(){
        element=driver.findElement(By.id("com.serveture.avionte:id/provider_settings"));
        return element;
    }

    public static WebElement sortAndFilter(){
        element=driver.findElement(By.id("com.serveture.avionte:id/provider_sort_filter"));
        return element;
    }

    public static WebElement status(){
        element=driver.findElement(By.id("com.serveture.avionte:id/provider_toolbar_status_indicator"));
        return element;
    }

    public static WebElement opportunities(){
        element=driver.findElement(By.id("com.serveture.avionte:id/tab_layout_icon"));
        return element;
    }
}
