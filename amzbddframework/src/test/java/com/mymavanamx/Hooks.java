package com.mymavanamx;

import com.mymavanamx.driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Hooks {
    DriverManager driverManager = new DriverManager();

    @Test
    public void setup(){
        driverManager.openBrowser();
        driverManager.maximiseTheBrowser();
        driverManager.navigate();
        driverManager.navigate();



    }
    @After
    public void tearUp(){
        driverManager.closeBrowser();

    }

}

