package Step;

import Page.BasePage;
import Page.PCfactoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepPCfactory {
    PCfactoryPage pcfactory = new PCfactoryPage();

    @Given("El usuario ingresa a la pagina de PCFactory {string}")
    public void elUsuarioIngresaALaPaginaDePCFactory(String url) {
        BasePage.visitUrl(url); //hace get "va a la direccion"a la url
    }

    @Given("El usuario realiza la busqueda del producto {string}")
    public void elUsuarioRealizaLaBusquedaDelProducto(String arg0) {
        pcfactory.insertarProducto(arg0);
        pcfactory.clickBtnBuscar();
    }

    @And("El usuario selecciona el producto {string}")
    public void elUsuarioSeleccionaElProducto(String idproducto) {
        pcfactory.clickElementoBusqueda(idproducto);
    }

    @Then("Se valida que el usuario haya seleccionado el producto {string}")
    public void seValidaQueElUsuarioHayaSeleccionadoElProducto(String arg0) {
        pcfactory.validarIdProducto(arg0);
    }
}
