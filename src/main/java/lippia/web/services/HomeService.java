package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomeService extends ActionManager {
    public static void clickShopMenu() {
        click(HomeConstants.SHOP_MENU);
    }

    public static void clickHome() {
        click(HomeConstants.HOME);
    }

    public static void clickNextArrival(){
        click(HomeConstants.NEXT_ARRIVAL);
    }

    public static void clickArrivalJS() {
        WebActionManager.waitVisibility(HomeConstants.JAVASCRIPT_BOOK);
        WebActionManager.click(HomeConstants.JAVASCRIPT_BOOK);

    }

    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(HomeConstants.AD_IFRAME1_XPATH);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(HomeConstants.AD_CLOSE_BUTTON_XPATH).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(HomeConstants.AD_IFRAME2_XPATH);
                    driver.switchTo().frame(iframe2);
                    click(HomeConstants.AD_CLOSE_BUTTON_XPATH);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }

    public static void clickAgregarCarrito() {
        click(HomeConstants.ADD_CART_JS);
    }

    public static void clickContinuarPago() {
        click(HomeConstants.CONTINUE_PAYMENTS);
    }

    public static void rellenarForm(String nombre, String apellido, String nombre_empresa, String email, String telefono, String pais, String direccion, String depto, String localidad, String ciudad, String cPostal) {
    waitVisibility(HomeConstants.REQUEST_DETAILS);
    setInput(HomeConstants.NAME,nombre);
    setInput(HomeConstants.SURNAME,apellido);
    setInput(HomeConstants.COMPANY_NAME,nombre_empresa);
    setInput(HomeConstants.EMAIL,email);
    setInput(HomeConstants.PHONE,telefono);

    setInput(HomeConstants.COUNTRY,pais);

    setInput(HomeConstants.ADRESS,direccion);
    setInput(HomeConstants.DPTO,depto);
    setInput(HomeConstants.LOCATION,localidad);

    setInput(HomeConstants.STATE,ciudad);

    setInput(HomeConstants.POSTAL_CODE,cPostal);
    }

    public static void seleccionarMetodoPago(String metodoPago) {
        switch (metodoPago) {
            case "Transferencia Bancaria":
                click(HomeConstants.BANK_TRANSFER);
                break;
            case "Cheque":
                click(HomeConstants.CHEQUE_PAYMENT);
                break;
            case "Contra Reembolso":
                click(HomeConstants.COD_PAYMENT);
                break;
            default:
                click(HomeConstants.PAYPAL_PAYMENT);
                break;
        }








    }
}

