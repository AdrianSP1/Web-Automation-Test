package lippia.web.Validator;

import lippia.web.constants.RegistrationConstants;
import org.testng.asserts.SoftAssert;

import static com.crowdar.core.actions.ActionManager.isVisible;

public class RegistrationValidate {
    static SoftAssert softAssert = new SoftAssert();

    public static void verificarEmptyPass() {
        softAssert.assertTrue(isVisible(RegistrationConstants.INVALID_PASS));
    }

    public static void verificarEmptyMail() {
        softAssert.assertTrue(isVisible(RegistrationConstants.INVALID_EMAIL));
    }
}

