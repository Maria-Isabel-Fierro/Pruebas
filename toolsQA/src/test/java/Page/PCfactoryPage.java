package Page;

import Utiles.Utilities;
import drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PCfactoryPage {

        public PCfactoryPage(){
            PageFactory.initElements(DriverContext.getDriver(),this);
        }

        @FindBy(xpath = "//*[@id='searchalgolia']//input")
        private WebElement inputTextBusqueda;

        @FindBy(xpath = "//*[@class='ais-input-search-button']")
        private WebElement btnBusqueda;

        @FindBy(xpath = "//*[@id='25']")
        private WebElement imgBanner2;

        @FindBy(xpath = "//h4[@class='price color-dark-2 product__card-title']")
        public List<WebElement> listadeproducto;

        @FindBy(xpath = "//a[@class='product__link']")
        public List<WebElement> listaLinkProd;

        @FindBy(xpath = "(//div[@class='product-single__units']/p/span)[2]")
        public WebElement idProducto;
    public void validarIdProducto(String idprod){
        System.out.println("validar producto");

        if(idProducto.getText().equals(idprod)){
            System.out.println("ok");
        } else {
            System.out.println("no ok");
        }

    }

    public void clickElementoBusqueda(String idProducto) {

        System.out.println("se inicia espera");
        Utilities.esperar(4);
        int indice = 0;
        //DriverContext.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ///WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(),Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOf(listadeproducto.get(0)));

        System.out.println("finaliza espera");


        for (WebElement producto : listadeproducto  ) {
            System.out.println("prodE-"+producto.getText());
            System.out.println("prodB-"+idProducto);
            System.out.println("****************");
            if(producto.getText().contains(idProducto)){
                listaLinkProd.get(indice).click();
                System.out.println("producto encontrado");
                break;
            }
            indice++;
        }

    }


    public void insertarProducto(String producto) {
            inputTextBusqueda.sendKeys(producto); }
        public void clickBtnBuscar(){
            btnBusqueda.click();
        }
        public void clickBanner2(){
            imgBanner2.click();
        }

    }


