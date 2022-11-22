package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.Validator.HomeValidate;
import lippia.web.services.HomeService;


public class HomeSteps extends PageSteps {
    @When("El cliente hace click en el boton Shop")
    public void ElClienteHaceClickEnElBotonShop(){
        HomeService.clickShopMenu();
        HomeService.closeAds();

    }

    @And("El cliente hace click en el boton Home")
    public void elClienteHaceClickEnElBotonHome() {
        HomeService.clickHome();
        HomeService.closeAds();
    }


    @And("El cliente verifica que solo existen 3 libros")
    public void elClienteVerificaQueSoloExistenLibros() {
        HomeValidate.verificarLibros();
        HomeService.closeAds();


    }

    @And("El cliente prueba que la pagina contenga 3 libros")
    public void elClientePruebaQueLaPaginaContengaLibros(){
        HomeValidate.verificarArrivals();
        HomeService.closeAds();
    }

    @And("El cliente hace click en el libro Mastering Javascript")
    public void elClienteHaceClickEnELLibroMasteringJavascrip() {
        HomeService.clickArrivalJS();
        HomeService.closeAds();
    }


    @And("El cliente verifica ser redireccionado a la pagina del producto seleccionado")
    public void elClienteVerificaSerRedireccionadoALaPaginaDelProductoSeleccionado() {
        HomeValidate.verificarPageJSProduct();
    }

    @And("El cliente agrega el libro al carrito")
    public void elClienteAgregaElLibroAlCarrito() {
        HomeService.clickAgregarCarrito();
    }


    @And("El cliente verifica el producto agregado al carro")
    public void elClienteVerificaElProductoAgregadoAlCarro() {
        HomeValidate.verificarItemAgregado();
    }

    @And("El cliente se dirije al carrito y visualiza el precio del producto")
    public void elClienteSeDirijeAlCarritoYVisualizaElPrecioDelProducto() {
        HomeValidate.verificarPrecios();

    }

    @And("El cliente verifica que el precio total es menor al subtotal")
    public void elClienteVerificaQueElPrecioTotalEsMenorAlSubtotal() {
        HomeValidate.verificarTotal_Subtotal();
    }

    @And("El cliente hace click en el boton para continuar el pago")
    public void elClienteHaceClickEnElBotonParaContinuarElPago() {
        HomeService.clickContinuarPago();
    }

    @And("El cliente accede al formulario para completar sus datos junto con los datos de facturacion y detalles de facturacion")
    public void elClienteAccedeAlFormularioParaCompletarSusDatosJuntoConLosDatosDeFacturacionYDetallesDeFacturacion() {
        HomeValidate.verificarDetallesForm();
    }

    @And("El cliente completa el formulario con sus datos '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'")
    public void elClienteCompletaElFormularioConSusDatosNombreApellidoNombreEmpresaEmailTelefonoPaisDireccionDptoLocalidadCuidadCodigoPostal(String nombre, String apellido, String nombre_empresa, String email, String telefono, String pais, String direccion, String depto, String localidad, String ciudad, String cPostal) {
        HomeService.emptyForm();
        HomeService.rellenarForm(nombre,apellido,nombre_empresa,email,telefono,pais,direccion,depto,localidad,ciudad,cPostal);
    }

    @Then("El cliente puede agregar un cupon de descuento")
    public void elClientePuedeAgregarUnCuponDeDescuento() {
        HomeValidate.verificarCupon();
    }

    @And("El cliente hace click en el boton para Pagar")
    public void elClienteHaceClickEnElBotonParaPagar() {
        HomeService.clickPayout();
    }

    @Then("El cliente completa su pedido")
    public void elClienteCompletaSuPedido() {
        HomeValidate.verificarFactura();
    }
}
