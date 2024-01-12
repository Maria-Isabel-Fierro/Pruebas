package Page;

import drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelecArchivoPage {
    public SelecArchivoPage() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='uploadfile_0']")
    public WebElement btnArchivo;

    @FindBy(xpath = "//input[@id='terms']")
    public WebElement btnTermns;

    @FindBy(xpath = "//button[@id='submitbutton']")
    public WebElement btnEnter;

    public void insertarinput(){

        btnArchivo.sendKeys("C:\\Users\\56937\\Downloads\\subir\\err.png");
    }
    public void click(){
        btnTermns.click();
        btnEnter.click();

    }

}
