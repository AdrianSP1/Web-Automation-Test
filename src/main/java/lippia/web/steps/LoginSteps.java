package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.Validator.LoginValidate;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("El cliente se encuentra en la pagina Automation Practice")
    public void ElClienteSeEncuentraEnLaPaginaAutomationPractice() {
        LoginService.navegarWeb();
    }

    @When("^El cliente hace click en el boton My Account de la barra de navegacion$")
       public void ElClienteHaceClickEnElBotonMyAccount() {
        LoginService.clickMyAccount();
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
    }

    }


