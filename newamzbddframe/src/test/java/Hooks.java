import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Drivermanager;
import org.junit.Test;

public class Hooks {
Drivermanager drivermanager = new Drivermanager();
@Before
public void setUp(){
    drivermanager.openBrowser();
    drivermanager.navigate("https://www.amazon.co.uk/");
    drivermanager.maximiseBrowser();
    drivermanager.implicitWait();


}
@After
public void tearUp(){
   // drivermanager.closeBrowser();
}

}
