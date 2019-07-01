import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driver.Drivermanager;
import org.junit.Test;
import org.junit.runner.RunWith;
import pages.HeaderPage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resourses", dryRun = false, strict = true,tags = "@reg", plugin = "json:target/cucumber.json")

public class CucumberRunner {



}
