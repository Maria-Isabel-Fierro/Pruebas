package Step;

import Page.BasePage;
import Page.CalendarioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepCalendario {

    CalendarioPage calendariopage = new CalendarioPage();

    @Given("El usuario ingresa a la pagina de demoguru date and time {string}")
    public void elUsuarioIngresaALaPaginaDeDemoguruDateAndTime(String url) {
        BasePage.visitUrl(url); //hace get "va a la direccion"a la url
    }

    @Then("El usuario selecciona mes, ano y dia")
    public void elUsuarioSeleccionaMesAnoYDia() {
        calendariopage.insertarFecha();
    }


}
