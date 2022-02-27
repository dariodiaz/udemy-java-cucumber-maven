package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps"
    //plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"}
    // tags = {"@Cart"}
)

public class runnerTest {
    /*@AfterClass
    public static void closeDriver() {
        BasePage.closeBrowser();
    }*/
}