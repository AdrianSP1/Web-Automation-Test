package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.RegistrationConstants;
import org.apache.commons.lang.RandomStringUtils;


public class RegistrationService extends ActionManager {

    public static void registrarUserName(String text){
        setInput(RegistrationConstants.INPUT_NEW_USERNAME_ID,text);
    }
    public static void  registrarPassword(String text){
        setInput(RegistrationConstants.INPUT_NEW_PASSWORD_ID,text);
    }
    public static void clickRegister()
    {
        click(RegistrationConstants.BTN_REGISTRAR);
    }
    public static void randomEmail(String mail){
        String generateString= RandomStringUtils.randomAlphabetic(12);
        String email= generateString+mail;
        registrarUserName(email);
    }

    }



