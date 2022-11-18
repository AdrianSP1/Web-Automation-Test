package lippia.web.constants;

import com.crowdar.core.PropertyManager;

public class LoginConstants {

    //Botones
    public static final String BTN_MYACCOUNT_XPATH="xpath://li/a[text()='My Account']";
    public static final String BTN_LOGIN_XPATH="xpath://div[1]/form/p[3]/input[3]";


    //Mensajes de error
    public static final String EM_USERNAME404_XPATH="xpath://li[text()=' A user could not be found with this email address.']";
    public static final String EM_PASSWORD412_XPATH="xpath://li[text()=' Password is required.']";
    public static final String EM_USERNAME412_XPATH="xpath://li[text()=' Username is required.']";
    public static final String EM_PASSWORD409_XPATH="xpath://div/div/ul/li[text()=' is incorrect. ']";

    //INPUT
    public static final String INPUT_USERNAME_ID="id:username";
    public static final String INPUT_PASSWORD_ID="id:password";

    //HAPPY USER
    public static final String HAPPY_USER= PropertyManager.getProperty("mail");
    public static final String HAPPY_PASSWORD= PropertyManager.getProperty("password");





}
