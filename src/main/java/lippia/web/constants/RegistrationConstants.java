package lippia.web.constants;

public class RegistrationConstants {
    //INPUT
    public static final String INPUT_NEW_USERNAME_ID="id:reg_email";
    public static final String INPUT_NEW_PASSWORD_ID="id:reg_password";

    //BOTON
    public static final String BTN_REGISTRAR = "xpath://input[@value='Register']";
    public static final String BTN_DASHBOARD = "xpath://a[text()='Dashboard']";


    //Mensajes
    public static final String ERROR_EMAIL ="xpath://li[text()=' Please provide a valid email address.']";;
    public static final String ERROR_PASSWORD ="xpath://li[text()=' Please enter an account password.']";


}
