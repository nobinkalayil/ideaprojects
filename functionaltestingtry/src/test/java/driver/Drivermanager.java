package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Drivermanager {
    public static WebDriver driver;

    public void openBrowser(String browserTyperowserType) {
       WebDriverManager.chromedriver().setup();
       WebDriverManager.firefoxdriver().setup();
        WebDriverManager.operadriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.iedriver().setup();
        switch (browserType) {
            case "firefox":
                driver = new FirefoxDriver();
            case "chrome":
                driver = new ChromeDriver();
            case "opera":
                driver = new OperaDriver();
            case "IE":
                driver = new InternetExplorerDriver();
            case "edge":
                driver = new EdgeDriver();
            default:
                System.out.println("browser : " + browserType + " invalide ");

                driver = new ChromeDriver();
        }


        public void navigateto(String url) {
            driver.get("url");
        }
        public void maximiseWindows(){
        }
    }

        public void waitDriver () {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
         public void closeDriver(){driver.quit();}
        public void handleApplication () {
            driver.findElements(By.linkText("GOT IT"));
        }
        public void sleep ( int milli){
            try {
                Thread.sleep(milli);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }