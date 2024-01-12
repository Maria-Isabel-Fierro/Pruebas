package Page;

import Utiles.Utilities;
import drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarioPage {

    public CalendarioPage(){ PageFactory.initElements(DriverContext.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='datepicker']")
    public WebElement calendario;

    @FindBy(xpath = "//span[@class='ui-datepicker-month']")
    public WebElement mes;
    @FindBy(xpath = "//span[@class='ui-datepicker-year']")
    public WebElement ano;
    @FindBy(xpath = "//td[@data-handler='selectDay']/a[text()='23']")
    public WebElement dia;

    @FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-e']")
    public WebElement btnNext;


    public void insertarFecha(){
        calendario.click();
        Utilities.esperar(2);

        int anoActual = Integer.parseInt(ano.getText());

        while(!(mes.getText().equals("July") && anoActual == 2024)){

            btnNext.click();
            mes.getText();
            anoActual = Integer.parseInt(ano.getText());
        }

        dia.click();

    }


}
