package lippia.web.Validator;

import lippia.web.constants.LoginConstants;
import lippia.web.constants.RegistrationConstants;
import org.testng.asserts.SoftAssert;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LoginValidate {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarLogin() {
        softAssert.assertTrue(isVisible(RegistrationConstants.DASHBOARD));
    }
    public static void noLoginUser404() {
            softAssert.assertTrue(isVisible(LoginConstants.NOT_REGIST));
    }

    public static void noLoginUser412() {
        softAssert.assertTrue(isVisible(LoginConstants.PASSWORD_EMPTY));
    }

    public static void noLoginPassword409(){
        softAssert.assertTrue(isVisible(LoginConstants.PASSWORD_FAIL));
}
    public static void noLoginPassword412(){
        softAssert.assertTrue(isVisible(LoginConstants.USERNAME_EMPTY));
    }

    public static void verificarLogoutBack() {
        softAssert.assertTrue(isVisible(LoginConstants.LOGIN));
    }
}
