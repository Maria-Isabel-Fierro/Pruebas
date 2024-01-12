package Step;

import Page.BasePage;
import Page.FormPage;
import Page.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepFormGoogle {

    GooglePage googlepage = new GooglePage();

    @Given("El usuario ingresa a la pagina de google Form {string}")
    public void elUsuarioIngresaALaPaginaDeGoogleForm(String url) {
        BasePage.visitUrl(url); //hace get "va a la direccion"a la url
    }

    @Given("El usuario llena nombre google form {string}")
    public void elUsuarioLlenaNombreGoogleForm(String nombre) {
        googlepage.insertarinput(nombre);
    }

    @Then("El usuario seleciona talla google form {string}")
    public void elUsuarioSelecionaTallaGoogleForm(String talla) {
        googlepage.clickTalla(talla);
    }

    @And("El usuario llena el campo comentario {string}")
    public void elUsuarioLlenaElCampoComentario(String comentario) {
        googlepage.insertarcom(comentario);
    }

    @When("El usuario presiona el boton enviar")
    public void elUsuarioPresionaElBotonEnviar() {
        googlepage.clickbtn();
    }
}
