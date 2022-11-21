package lippia.web.Validator;

import lippia.web.constants.LoginConstants;
import org.testng.asserts.SoftAssert;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LoginValidate {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarLogin() {
        softAssert.assertTrue(isVisible(LoginConstants.LOGIN));
    }
    public static void noLoginUser404() {
            softAssert.assertTrue(isVisible(LoginConstants.EM_USERNAME404));
    }

    public static void noLoginUser412() {
        softAssert.assertTrue(isVisible(LoginConstants.EM_PASSWORD412));
    }

    public static void noLoginPassword409(){
        softAssert.assertTrue(isVisible(LoginConstants.EM_PASSWORD409));
}
    public static void noLoginPassword412(){
        softAssert.assertTrue(isVisible(LoginConstants.EM_USERNAME412));
    }

    public static void verificarLogoutBack() {
        softAssert.assertTrue(isVisible(LoginConstants.LOGIN));
    }
}
