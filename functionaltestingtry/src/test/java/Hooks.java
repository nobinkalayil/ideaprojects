import driver.Drivermanager;
import org.junit.Before;
import org.junit.Test;

public class Hooks {
    private Drivermanager driverManager = new Drivermanager();

    @Before

    public void setup() {
        try {
            driverManager.openBrowser("chrome");
            driverManager.navigateto("https://www.amazon.co.uk/");
            driverManager.MaximiseDriver();
            driverManager.waitDriver();
            driverManager.handleApplication();
        } catch (Exception e) {

        }

    }
}
//@After
// public void teardown(){
// driverManager.closeDriver();

//}

// }
