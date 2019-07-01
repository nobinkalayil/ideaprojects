package com.seleniumwebdriver;

import com.seleniumwebdriver.driver.DriverManager;
import com.seleniumwebdriver.pages.HeaderPage;
import cucumber.api.java.Before;
import org.junit.Test;

public class Hooks {

    private DriverManager driverManager = new DriverManager();


@Before
    public void setUp(){
        driverManager.openBrowser();
    driverManager.navigate("https://www.amazon.co.uk/");
    driverManager.maximiseBrowser();

        driverManager.implicitWait();
        driverManager.isDisplaye();




    }

}
