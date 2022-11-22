package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.Validator.AccountValidate;
import lippia.web.services.AccountService;
import lippia.web.services.HomeService;

public class AccountSteps extends PageSteps {

    @And("El cliente selecciona el boton Acount Details")
    public void ElClienteSeleccionaElBotonAcountDetails(){
        AccountService.clickAccountDetails();
        HomeService.closeAds();



    }

    @Then("El cliente visualiza en la pagina la opcion de cambiar su password")
    public void elClienteVisualizaEnLaPaginaLaOpcionDeCambiarSuPassword() {
        AccountValidate.verificarCambiarPass();
    }
}
