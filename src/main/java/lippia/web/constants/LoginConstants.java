package lippia.web.constants;

import com.crowdar.core.PropertyManager;

public class LoginConstants {

    //Botones
    public static final String MYACCOUNT ="xpath://li/a[text()='My Account']";
    public static final String LOGIN ="xpath://div[1]/form/p[3]/input[3]";


    //Mensajes de error
    public static final String NOT_REGIST ="xpath://li[text()=' is not registered on this site. If you are unsure of your username, try your email address instead.']";
    public static final String PASSWORD_EMPTY ="xpath://li[text()=' Password is required.']";
    public static final String USERNAME_EMPTY ="xpath://li[text()=' Username is required.']";
    public static final String PASSWORD_FAIL ="xpath://div/div/ul/li[text()=' is incorrect. ']";

    //INPUT
    public static final String INPUT_USERNAME ="id:username";
    public static final String INPUT_PASSWORD ="id:password";

    //HAPPY USER
    public static final String PROPERTI_USER = PropertyManager.getProperty("mail");
    public static final String PROPERTI_PASSWORD = PropertyManager.getProperty("password");


    public static final String LOGOUT = "xpath://a[text()='Logout']";
}
