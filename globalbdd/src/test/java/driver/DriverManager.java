package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public static WebDriver driver;
    private String browser ="Chrome";
    public void openBrowserr(){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
        }

    }
    public void navigate(String url){
        driver.get(url);
    }
    public void maximise(){driver.manage().window().maximize();}

}
