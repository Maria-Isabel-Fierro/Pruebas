package Page;

import Utiles.Utilities;
import drivers.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.helpers.Util;

import java.util.List;
import java.util.NoSuchElementException;

public class RegistroPage {
    public RegistroPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='user_title']")
    public WebElement dropselect;

    @FindBy(xpath = "//input[@id='user_firstname']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@id='user_surname']")
    public WebElement surname;

    @FindBy(xpath = "//input[@id='user_phone']")
    public WebElement phone;
    @FindBy(xpath = "//select[@id='user_dateofbirth_1i']")
    public WebElement cumpleano;
    @FindBy(xpath = "//select[@id='user_dateofbirth_2i']")
    public WebElement cumplemes;
    @FindBy(xpath = "//select[@id='user_dateofbirth_3i']")
    public WebElement cumpledia;
    @FindBy(xpath = "//input[@name='licencetype']")
    public List<WebElement> listChekBox;
    @FindBy(xpath = "//select[@id='user_licenceperiod']")
    public WebElement licence;
    @FindBy(xpath = "//select[@id='user_occupation_id']")
    public WebElement ocupacion;
    @FindBy(xpath = "//input[@id='user_address_attributes_street']")
    public WebElement address;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='county']")
    public WebElement country;
    @FindBy(xpath = "//input[@name='post_code']")
    public WebElement codigoPostal;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement pass;
    @FindBy(xpath = "//input[@name='c_password']")
    public WebElement confirmPass;
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement btnClick;

    public void click(){
        btnClick.click();
    }
    public void insertarcontrasena(String password, String confirm){
        pass.sendKeys(password);
        confirmPass.sendKeys(confirm);
    }
    public void insertarCodYEmail(String codigo,String eemail){
        codigoPostal.sendKeys(codigo);
        email.sendKeys(eemail);
    }

    public void insertaraddress(String dire,String ciudad, String coun){
        address.sendKeys(dire);
        city.sendKeys(ciudad);
        country.sendKeys(coun);
    }
    public void selecOcupation(String ocupa) {
        Utilities.esperar(5);

        Select objocupacion = new Select(ocupacion);
        objocupacion.selectByVisibleText(ocupa);
    }
    public void clickLicencia(int years) {

        Select objano = new Select(licence);
        objano.selectByValue(Integer.toString(years));
    }

    public void clickChek(String chek) {
        Utilities.esperar(3);
        switch (chek) {
            case "Full":
                listChekBox.get(0).click();
                break;
            case "Provisional":
                listChekBox.get(1).click();
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public void seleccionarCumpleanos(int anno,String mes,int dia) {

        Utilities.esperar(2);
        Select objano = new Select(cumpleano);
        objano.selectByValue(Integer.toString(anno));

        Utilities.esperar(2);
        Select objmes = new Select(cumplemes);
        objmes.selectByVisibleText(mes);

        Utilities.esperar(2);
        Select objdia = new Select(cumpledia);
        objdia.selectByValue(Integer.toString(dia));
    }

    public void insertarphone(int num){
        phone.sendKeys(Integer.toString(num));
    }
    public void insertarsur(String sname){
        surname.sendKeys(sname);
    }
    public void insertarname(String name){
        firstname.sendKeys(name);
    }
    public void seleccionarOpcionDropdown(String opcion) {

        Select objselect = new Select(dropselect);
        objselect.selectByValue(opcion);

    }
}