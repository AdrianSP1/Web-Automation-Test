package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.AccountConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountService extends ActionManager {
    public static void clickAccountDetails() {
        WebDriver driver= DriverManager.getDriverInstance().getWrappedDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement accountDetails= driver.findElement(By.xpath("//a[text()='Account Details']"));
        js.executeScript("arguments[0].click()", accountDetails);


    }
}
