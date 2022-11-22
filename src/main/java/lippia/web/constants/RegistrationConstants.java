package lippia.web.constants;

public class RegistrationConstants {
    //INPUT
    public static final String USERNAME ="id:reg_email";
    public static final String PASS ="id:reg_password";

    //BOTON
    public static final String REGISTRAR = "xpath://input[@value='Register']";
    public static final String DASHBOARD = "xpath://a[text()='Dashboard']";


    //Mensajes
    public static final String ERROR_EMAIL ="xpath://li[text()=' Please provide a valid email address.']";;
    public static final String ERROR_PASSWORD ="xpath://li[text()=' Please enter an account password.']";


    public static final String INVALID_PASS ="xpath://li[text()=' An account is already registered with your email address. Please login.']";
    public static final String INVALID_EMAIL ="xpath://li[text()=' Please provide a valid email address.']"; ;
    ;
}
