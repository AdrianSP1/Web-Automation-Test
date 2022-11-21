package lippia.web.constants;

import com.crowdar.core.PropertyManager;

public class LoginConstants {

    //Botones
    public static final String MYACCOUNT ="xpath://li/a[text()='My Account']";
    public static final String LOGIN ="xpath://div[1]/form/p[3]/input[3]";


    //Mensajes de error
    public static final String EM_USERNAME404 ="xpath://li[text()=' A user could not be found with this email address.']";
    public static final String EM_PASSWORD412 ="xpath://li[text()=' Password is required.']";
    public static final String EM_USERNAME412 ="xpath://li[text()=' Username is required.']";
    public static final String EM_PASSWORD409 ="xpath://div/div/ul/li[text()=' is incorrect. ']";

    //INPUT
    public static final String INPUT_USERNAME ="id:username";
    public static final String INPUT_PASSWORD ="id:password";

    //HAPPY USER
    public static final String PROPERTI_USER = PropertyManager.getProperty("mail");
    public static final String PROPERTI_PASSWORD = PropertyManager.getProperty("password");





}
