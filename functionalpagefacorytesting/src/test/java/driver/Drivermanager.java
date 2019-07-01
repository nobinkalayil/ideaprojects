package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Drivermanager {

        public static WebDriver driver;
        private String browser = "";
        public Drivermanager(){ PageFactory.initElements(driver, this);}

        public void openbrowser(String browserType){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        public void navigate(String url){driver.get(url);
        }
        public void maximisebrowser(){driver.manage().window().maximize();}

        public void waitdriver(){driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
        public void handleAppCookies(){driver.findElement(By.linkText("GOT IT"));}

        public void closebrowser(){driver.quit();}
        public void sleep(int milli) {
            try {
                Thread.sleep(milli);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public Boolean waitForInviOfElement(String element){
            return new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(element)));
        }

        public WebElement waitUntilClickable(WebElement element){
            return new WebDriverWait(driver,10).until(
                    ExpectedConditions.elementToBeClickable(element));
        }

    }

