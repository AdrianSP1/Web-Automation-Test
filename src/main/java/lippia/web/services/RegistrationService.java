package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.RegistrationConstants;
import org.openqa.selenium.WebElement;


public class RegistrationService extends ActionManager {

    public static void inputUser(String user){
        setInput(RegistrationConstants.USERNAME, user);

    }


    public static void inputPassword(String pass) {
        setInput(RegistrationConstants.PASS, pass);

    }
    public static void clickRegistrar() {
        WebActionManager.click(RegistrationConstants.REGISTRAR);

    }



    public static void cleanRegistration() {
        WebElement mail= getElement(RegistrationConstants.USERNAME);
        WebElement pass = getElement(RegistrationConstants.PASS);
        mail.clear();
        pass.clear();

    }




}



