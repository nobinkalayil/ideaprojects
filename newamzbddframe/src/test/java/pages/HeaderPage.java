package pages;

import driver.Drivermanager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;


public class HeaderPage extends Drivermanager {
    public static String searchItem;

    @FindBy(id ="twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(className = "nav-input")
    private WebElement magniClick;

    @FindBy(css = ".a-color-state")
    private WebElement headername;

    @FindBy(id= "nav-link-shopall")
    private WebElement shopdropdown;

    @FindBy(xpath = "//span[contains(text(), 'Movies, TV, Music & Games')]")
    private WebElement movieTVbutton;

    @FindBy(xpath = "//span[contains(text(), 'PC & Video Games')]")
    private WebElement pcButton;
    @FindBy(xpath = "//span[contains(text(),'Nintendo Switch - Neon Red/Neon Blue')]")
    private WebElement selectProductlink;

    @FindBy(css = "#add-to-cart-button")
    private WebElement basketButton;

    @FindBy(css = ".a-button-close.a-declarative")
    private WebElement popupbutton;
   // @FindBy(css = ".a-button.a-button-base.mbb__no")
   // private WebElement popnothanks;

    @FindBy(css = "#hlb-view-cart-announce")
    private WebElement editBasket;

    @FindBy(css = ".sc-product-title.a-text-bold")
    private WebElement getProName;






    public void doSearch(String item){

        searchTextBox.sendKeys(item);
        magniClick.click();
    }

    public void emptySearch(){}

    public String getCurrenturl(){
        return driver.getCurrentUrl();

    }
    public String getHeadername(){
        return headername.getText();

    }


    public void shopByDepartment(){
        Actions actions = new Actions(driver);
        actions.moveToElement(shopdropdown).build().perform();
        }

        public void navigateToMoviePcTV(){
        movieTVbutton.click();
        pcButton.click();

        }

        public void searchForThatProduct(String pro){
        searchItem = pro;
        searchTextBox.sendKeys("Nintendo Switch Neon Red/ Neon Blue");
        magniClick.click();

        }

        public void selectProductToBasket() {
            selectProductlink.click();
            basketButton.click();

           sleep(3000);
            popupbutton.click();


        }



        public void editBasketProduct(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


            editBasket.click();
        }
        public String getBasketpronames(){
        return getProName.getText();
        }


    }


