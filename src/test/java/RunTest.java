import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports/html-report", "rerun:target/rerun.txt"})

public class RunTest {
    private static AppiumDriverLocalService service;

    @BeforeClass
    public static void startAppiumServer(){
        System.out.println("test");

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterClass
    public static void StopAppiumServer(){
        service.stop();
    }
}
