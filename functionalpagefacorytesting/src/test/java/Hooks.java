import driver.Drivermanager;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    private Drivermanager drivermanager = new Drivermanager();
    @Before
    public void setup(){


        drivermanager.openbrowser("Chrome");
        drivermanager.navigate("https://www.argos.co.uk/");
        drivermanager.maximisebrowser();
        drivermanager.waitdriver();
        drivermanager.handleAppCookies();



    }
    @After
    public void teardown(){
        drivermanager.closebrowser();

    }
}
