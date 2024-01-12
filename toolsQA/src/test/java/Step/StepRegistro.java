package Step;

import Page.BasePage;
import Page.RegistroPage;
import Utiles.Utilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepRegistro {

    RegistroPage registroPage = new RegistroPage();

    @Given("El usuario ingresa a la pagina de guru99 {string}")
    public void ElUsuarioIngresaALaPaginaDeGuru99(String url) {
        BasePage.visitUrl(url); //hace get "va a la direccion"a la url
    }

    @Given("El usuario completa dropdown {string}")
    public void elUsuarioCompletaDropdown(String title) {
        registroPage.seleccionarOpcionDropdown(title);
    }

    @Then("El usuario ingresa first name {string}")
    public void elUsuarioIngresaFirstName(String name) {

        registroPage.insertarname(name);
    }

    @And("El usuario ingresa surname {string}")
    public void elUsuarioIngresaSurname(String srname) {
        registroPage.insertarsur(srname);
    }

    @And("El usuario ingresa phone {string}")
    public void elUsuarioIngresaPhone(String arg0) {
        int numero = Integer.parseInt(arg0); // convierte la cadena a entero
        registroPage.insertarphone(numero);
    }

    @And("El usuario ingresa cumpleanos {string} {string} {string}")
    public void elUsuarioIngresaCumpleanos(String ano, String mes, String dia) {
        int anio = Integer.parseInt(ano); // convierte la cadena a entero
        int diaa = Integer.parseInt(dia); // convierte la cadena a entero

        registroPage.seleccionarCumpleanos(anio, mes, diaa);
    }

    @And("El usuario ingresa cheked {string}")
    public void elUsuarioIngresaCheked(String chekeado) {
        registroPage.clickChek(chekeado);
    }

    @And("El usuario ingresa periodo licencia {string}")
    public void elUsuarioIngresaPeriodoLicencia(String lic) {
        int licence = Integer.parseInt(lic);
        registroPage.clickLicencia(licence);
    }

    @And("El usuario ingresa ocupacion {string}")
    public void elUsuarioIngresaOcupacion(String ocupacion) {
        registroPage.selecOcupation(ocupacion);
    }

    @And("El usuario ingresa direccion {string} {string} {string}")
    public void elUsuarioIngresaDireccion(String add, String ci, String con) {
        registroPage.insertaraddress(add, ci, con);
    }

    @And("El usuario ingresa CodePost {string} {string}")
    public void elUsuarioIngresaCodePost(String codigoPostal, String email) {
        registroPage.insertarCodYEmail(codigoPostal, email);
    }

    @And("El usuario ingresa Pass {string} {string}")
    public void elUsuarioIngresaPass(String pass, String confpass) {
        registroPage.insertarcontrasena(pass,confpass);
    }

    @When("El usuario presiona boton create")
    public void elUsuarioPresionaBotonCreate() {
        registroPage.click();
    }

}
