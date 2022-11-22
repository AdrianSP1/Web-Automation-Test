package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.Validator.RegistrationValidate;
import lippia.web.services.HomeService;
import lippia.web.services.RegistrationService;

import javax.imageio.spi.RegisterableService;


public class RegistrationSteps extends PageSteps {


    @When("^El cliente ingresa un username(.*)$")
    public void elClienteIngresaUnUsername(String username) {
        RegistrationService.inputUser(username);
    }

    @And("^El cliente ingresa un password (.*)$")
    public void elClienteIngresaUnPasswordPassword(String password) {
        RegistrationService.inputPassword(password);
    }

    @And("El cliente  hace click en el boton Register")
    public void elClienteHaceClickEnElBotonRegister() {
        RegistrationService.clickRegistrar();
        HomeService.closeAds();
    }

    @Then("Se muestra mensaje de error por password vacia")
    public void seMuestraMensajeDeErrorPorPasswordVacia() {
        RegistrationValidate.verificarEmptyPass();
    }

    @Then("Se muestra mensaje de error en la pagino por email vacio")
    public void seMuestraMensajeDeErrorEnLaPaginoPorEmailVacio() {
        RegistrationValidate.verificarEmptyMail();
    }
}

