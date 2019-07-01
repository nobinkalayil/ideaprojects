package com.mymavanamx.pages;

import com.mymavanamx.driver.DriverManager;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {

    public static String searchItem;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextbox;

    @FindBy(className = "nav-input" )
    private WebElement magniClick;



    public void doSearch(String item){
        searchItem = "puma";
        searchTextbox.sendKeys();
        magniClick.click();




    }
    public void emptySearch(){

    }
}
