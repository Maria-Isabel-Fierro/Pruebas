package Page;

import Utiles.Utilities;
import drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormPage {

    public FormPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement inputname;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement inputlastname;
    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement inputemail;

    @FindBy(xpath = "//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div")
    public List<WebElement> listagender;

    public void clickGender(String genero) {
        for (WebElement opcion : listagender) {
            if (opcion.getAttribute("value").equals(genero)) {
                opcion.click();
                break;
            }
        }}


    public void insertaremail(String email){

        inputemail.sendKeys(email);
    }

    public void insertarlast(String last){

        inputlastname.sendKeys(last);
    }

    public void insertarinput(String name){

        inputname.sendKeys(name);
    }




    }


