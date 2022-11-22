package lippia.web.Validator;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.*;
import static lippia.web.services.HomeService.clickNextArrival;

public class HomeValidate {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarLibros() {
        softAssert.assertTrue(isVisible(HomeConstants.HTML_BOOK));
        softAssert.assertTrue(isVisible(HomeConstants.RUBY_BOOK));
        softAssert.assertTrue(isVisible(HomeConstants.JAVASCRIPT_BOOK));

    }

    public static void verificarArrivals() {
        for(int a =0; a <3; a++){
            clickNextArrival();
        }

    }

    public static void verificarPageJSProduct() {
        WebActionManager.waitVisibility(HomeConstants.VERIFY_JS);
        softAssert.assertTrue(isVisible(HomeConstants.VERIFY_JS));

    }

    public static void verificarItemAgregado() {
        softAssert.assertNotEquals(getAttribute(HomeConstants.MENU_ITEMS, "innerText"), "0 items");


    }

    public static void verificarPrecios() {
        click(HomeConstants.MENU_ITEMS);
        softAssert.assertTrue(isVisible(HomeConstants.PRICE_TOTAL));
        softAssert.assertTrue(isVisible(HomeConstants.PRICE_SUBTOTAL));

    }

    public static void verificarTotal_Subtotal() {
        String total = getAttribute(HomeConstants.PRICE_TOTAL, "innerText").substring(1,4);
        String Subtotal = getAttribute(HomeConstants.PRICE_SUBTOTAL, "innerText").substring(1,4);
        int Total = Integer.parseInt(total);
        int SubTotal = Integer.parseInt(Subtotal);
        softAssert.assertTrue(Total> SubTotal, "El Subtotal es mayor que el Total");

    }

    public static void verificarDetallesForm() {
        waitVisibility(HomeConstants.ADDITIONAL_INFO);
        softAssert.assertTrue(isVisible(HomeConstants.ADDITIONAL_INFO));

        waitVisibility(HomeConstants.REQUEST_DETAILS);
        softAssert.assertTrue(isVisible(HomeConstants.REQUEST_DETAILS));

        waitVisibility(HomeConstants.ORDER);
        softAssert.assertTrue(isVisible(HomeConstants.ORDER));

    }

    public static void verificarCupon() {
        WebDriver driver= DriverManager.getDriverInstance().getWrappedDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@class='showcoupon'][text()='Click here to enter your code']"));
        js.executeScript("arguments[0].click()", element);
        WebActionManager.waitVisibility(HomeConstants.APLY_CUPON);


    }

    public static void verificarFactura() {

        waitVisibility(HomeConstants.BUY_SUCCES);
        softAssert.assertTrue(isVisible(HomeConstants.BUY_SUCCES));
        softAssert.assertTrue(isVisible(HomeConstants.BILLING));
        softAssert.assertTrue(isVisible(HomeConstants.CUSTOMER));
        softAssert.assertTrue(isVisible(HomeConstants.ORDER_DETAILS));


    }
}
