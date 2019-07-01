package pageObject;

import driver.Drivermanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends Drivermanager {
    @FindBy(id = "searchTerm")
    private WebElement searchTextbox;


    @FindBy(className = "argos-header__search-button" )
    private WebElement magniGlass;


    public void searchproduct(String item) {
        // searchTextbox.sendKeys(item);
        //  magniGlass.click();

        driver.findElement(By.id("searchTerm")).sendKeys(item);
        waitUntilClickable(
                driver.findElement(By.className("argos-header__search-button"))).click();
    }
    public void emptySearch(){
        magniGlass.click();
    }
}


