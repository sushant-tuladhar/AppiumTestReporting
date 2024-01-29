package pageobject.profile;

import helpers.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile extends HelperClass {

    private static WebElement element=null;

    public static WebElement profileBack(){
        element=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"back\"]"));
        return element;
    }
}
