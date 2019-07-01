import driver.DriverManager;
import org.junit.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();
    @Before
    private void  setup(){
        driverManager.openBrowserr();
        driverManager.navigate("https://www.globalsign.com/en/");
        driverManager.maximise();
    }
}
