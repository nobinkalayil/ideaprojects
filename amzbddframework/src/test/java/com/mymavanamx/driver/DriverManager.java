package com.mymavanamx.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    private String browser = "chrome";


    public void openBrowser() {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            default:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
    }

    public void navigate() {
        driver.get("https://www.amazon.co.uk/");
    }

    public void maximiseTheBrowser() {
        driver.manage().window().maximize();
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    public void closeBrowser() {
        driver.quit();
    }

    public void sleep(int milli) {
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
