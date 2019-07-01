package com.seleniumwebdriver.driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;

    public DriverManager(){ PageFactory.initElements(driver, this); }

    public String browser = "chrome";

    public void openBrowser(){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                 driver = new ChromeDriver();
            WebDriverManager.iedriver().setup();
            break;
            case "IE":
                driver = new InternetExplorerDriver();
                WebDriverManager.firefoxdriver().setup();
                break;
                default:
                    driver = new FirefoxDriver(); }
    }
    public void navigate(String url){driver.get(url);}
    public void maximiseBrowser(){driver.manage().window().maximize();}

    public void isDisplaye(){
        Boolean dis = driver.findElement(By.cssSelector("isDisplayed()")).isDisplayed();
        System.out.println(dis);
    }

    public void implicitWait(){driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}


    }


}

