package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.Validator.RegistrationValidate;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {
    @When("El Cliente ingresa un mail (.*)$")
    public void ElClienteIngresaUnMail(String mail){
        RegistrationService.randomEmail(mail);
    }
    @And("El Cliente ingresa un password(.*)$")
    public void ElClienteIngresaUnPassword(String password){
        RegistrationService.registrarPassword(password);
    }
    @And("^El Cliente hace click en el boton Register para registrarse$")
    public void ClienteClickRegister(){
        RegistrationService.clickRegister();
    }
    @Then("El Cliente verifica que su registro fue exitoso")
    public void VerificacionRegistro(){
        RegistrationValidate.verificarRegistro();
    }
    @Then("Se obtiene error en la pagina por email invalido")
    public void ErrorEmailInvalido(){
        RegistrationValidate.verificarEmailInvalido();
    }
    @Then("Se obtiene error en la pagina por password invalido")
    public void ErrorPassInvalido(){
        RegistrationValidate.verificarPassNull();}



    @When("El cliente ingresa un mail no valido {string}")
    public void elClienteIngresaUnMailNoValidoMailInvalid(String mailInvalid) {
        RegistrationService.randomEmail(mailInvalid);
    }
    
}
