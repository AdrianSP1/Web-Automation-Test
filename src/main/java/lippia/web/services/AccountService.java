package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;

public class AccountService extends ActionManager {
    public static void clickAccountDetails() {
        click(AccountConstants.ACCOUNT_DETAILS);
    }
}
