package lippia.web.Validator;
import lippia.web.constants.AccountConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;


public class AccountValidate  {
    static SoftAssert softAssert = new SoftAssert();
    public static void verificarCambiarPass() {
        waitVisibility(AccountConstants.CHANGE_PASSWORD);
        softAssert.assertTrue(isVisible(AccountConstants.CHANGE_PASSWORD));


    }
}
