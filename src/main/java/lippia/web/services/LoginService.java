package lippia.web.services;


import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {
    public static  void  navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMyAccount(){
        click(LoginConstants.MYACCOUNT);
    }

    public static void inputUser(String text){
        setInput(LoginConstants.INPUT_USERNAME, text);
    }
    public static void inputPassword(String text){
        setInput(LoginConstants.INPUT_PASSWORD, text);
    }
    public static void clickLogin(){
        click(LoginConstants.LOGIN);
    }


    public static void HappyLogin(){
        inputUser(LoginConstants.PROPERTI_USER);
        inputPassword(LoginConstants.PROPERTI_PASSWORD);
        clickLogin();

    }


    public static void clickLogout() {
        click(LoginConstants.LOGOUT);
    }

    public static void comeBackJack() {
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();

    }
}
