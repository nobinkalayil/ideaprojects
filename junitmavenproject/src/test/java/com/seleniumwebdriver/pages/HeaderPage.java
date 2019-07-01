package com.seleniumwebdriver.pages;

import com.seleniumwebdriver.driver.DriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {
public static String searchItem;

    @FindBy(id ="twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(className ="nav-input")
    private WebElement magifierGlass;


    public void search(String item){

        searchItem = item;

        searchTextBox.sendKeys(item);
        magifierGlass.click();

    }

}
