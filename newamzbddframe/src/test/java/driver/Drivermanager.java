package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Drivermanager {
    public static WebDriver driver;
    private String browser = "chrome";
    public Drivermanager(){  PageFactory.initElements(driver, this);    }




    public void openBrowser(){
        switch (browser){
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

        }

    }


    public void navigate(String url){driver.get(url);    }

    public void maximiseBrowser(){driver.manage().window().maximize();}

    public void implicitWait(){driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}

    //public void handleAppCookies(){driver.findElement(By.linkText("No thanks"));}
    public void sleep(int milli) {
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void closeBrowser(){driver.quit();}



}
