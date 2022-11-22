package lippia.web.Validator;
import lippia.web.constants.AccountConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;


public class AccountValidate  {
    static SoftAssert softAssert = new SoftAssert();
    public static void verificarCambiarPass() {
        softAssert.assertTrue(isVisible(AccountConstants.CHANGE_PASSWORD));


    }
}
