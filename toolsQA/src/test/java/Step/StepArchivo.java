package Step;

import Page.BasePage;
import Page.SelecArchivoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepArchivo {

    SelecArchivoPage calendarPage = new SelecArchivoPage();

    @Given("El usuario ingresa a la pagina de demo {string}")
    public void elUsuarioIngresaALaPaginaDeDemo(String url) {
        BasePage.visitUrl(url); //hace get "va a la direccion"a la url

    }

    @And("El usuario carga un archivo")
    public void elUsuarioCargaUnArchivo() {
        calendarPage.insertarinput();
    }


    @Then("El usuario presiona termns y btn enter")
    public void elUsuarioPresionaTermnsYBtnEnter() {
        calendarPage.click();
    }
}
