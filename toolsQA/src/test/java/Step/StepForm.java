package Step;

import Page.BasePage;
import Page.FormPage;
import Utiles.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepForm {

    FormPage pageform = new FormPage();

    @Given("El usuario ingresa a la pagina de demoqa {string}")
    public void elUsuarioIngresaALaPaginaDeDemoqa(String arg0) {
        BasePage.visitUrl(arg0); //hace get "va a la direccion"a la url
    }

    @Given("El usuario llena name {string}")
    public void elUsuarioLlenaName(String arg0) {
        pageform.insertarinput(arg0);
    }

    @And("El usuario llena lastname {string}")
    public void elUsuarioLlenaLastname(String arg0) {
        pageform.insertarlast(arg0);
    }

    @And("El usuario llena email {string}")
    public void elUsuarioLlenaEmail(String arg0) {
        pageform.insertaremail(arg0);
    }

    @And("El usuario selecciona gender {string}")
    public void elUsuarioSeleccionaGender(String genero) {
        pageform.clickGender(genero);
    }

    @And("El usuario llena address {string}")
    public void elUsuarioLlenaAddress(String arg0) {
        //pageform.insertarinput();
    }

    @And("El usuario llena  addressper {string}")
    public void elUsuarioLlenaAddressper(String arg0) {
        //pageform.insertarinput();
    }

    @Then("Se valida que el usuario haya completado todos los campos")
    public void seValidaQueElUsuarioHayaCompletadoTodosLosCampos() {
    }

}
