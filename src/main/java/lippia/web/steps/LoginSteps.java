package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.Validator.LoginValidate;
import lippia.web.Validator.RegistrationValidate;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("El cliente se encuentra en la pagina Automation Practice")
    public void ElClienteSeEncuentraEnLaPaginaAutomationPractice() {
        LoginService.navegarWeb();
    }

    @When("^El cliente hace click en el boton My Account de la barra de navegacion$")
       public void ElClienteHaceClickEnElBotonMyAccount() {
        LoginService.clickMyAccount();
        HomeService.closeAds();
    }

    @And("^El cliente ingresa su username(.*)$")
    public void ElClienteIngresaSuUsername(String username) {
        LoginService.inputUser(username);
    }

    @And("^El cliente ingresa su password(.*)$")
    public void ElClienteIngresaSuPassword(String password) {
        LoginService.inputPassword(password);
    }

    @And ("^El Cliente hace click en el boton de Login$")
    public void ElClienteHaceClickEnElBotonLogin(){
        LoginService.clickLogin();
        HomeService.closeAds();
    }

    @Then( "Se verifica el ingreso correcto")
    public void SeVerificaEIngresoCorrecto(){
        LoginValidate.verificarLogin();
    }


    @Then("Se muestra mensaje de error")
    public void UsuarioNoEncontrado() {
            LoginValidate.noLoginUser404();
        }

        @Then("Error de password vacio")
        public void PasswordVacio(){
        LoginValidate.noLoginPassword412();
        }

        @Then("Error de username Vacio")
        public void ErrorUsernnameVacio(){
        LoginValidate.noLoginUser412();
    }

    @Then("Error password incorrecta")
    public void PasswordIncorrecta(){
        LoginValidate.noLoginPassword409();
    }

    @Then("El cliente accede a su cuenta")
    public void ElClienteAccedeASuCuenta() {
        LoginService.HappyLogin();
        HomeService.closeAds();
        LoginValidate.verificarLogin();
    }

    @And("El cliente cierra sesion de su cuenta")
    public void elClienteCierraSesionDeSuCuenta() {
        LoginService.clickLogout();
        HomeService.closeAds();
    }

    @And("El cliente presiona volver atras")
    public void elClientePresionaVolverAtras() {
        LoginService.comeBackJack();
        HomeService.closeAds();

    }

    @Then("El cliente no deberia estar logueado")
    public void elClienteNoDeberiaEstarLogueado() {
        LoginValidate.verificarLogoutBack();
    }
}


