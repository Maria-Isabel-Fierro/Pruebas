package Page;

import Utiles.Utilities;
import drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {
    public GooglePage(){ PageFactory.initElements(DriverContext.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
    public WebElement inputname;
    @FindBy(xpath = "//div[@class='SG0AAe']/div/label/div/div[1]")
    public List<WebElement> listagoogle;

    @FindBy(xpath = "//textarea")
    public WebElement comentario;

    @FindBy(xpath = "(//span[@class='l4V7wb Fxmcue'])[2]")
    public WebElement btn;

    public void clickbtn(){
        btn.click();
    }
    public void insertarcom(String comen){

        comentario.sendKeys(comen);
    }
    public void clickTalla(String talla){

        Utilities.esperar(5);

        switch (talla) {
            case "xs":
                listagoogle.get(0).click();
                System.out.println("opcion xs");
                break;
            case "s":
                listagoogle.get(1).click();
                break;
            case "m" :
                listagoogle.get(2).click();
                break;
            case "l" :
                listagoogle.get(3).click();
                break;
            case "xl" :
                listagoogle.get(4).click();
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public void insertarinput(String name){
        inputname.sendKeys(name);
    }

}
