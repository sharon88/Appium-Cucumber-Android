package output;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/sharon/Desktop/Appium/AppiumDemo/src/test/resources/features/Accounts.feature:5"},
        plugin = {"json:/Users/sharon/Desktop/Appium/AppiumDemo/target/1.json"},
        monochrome = false,
        glue = {"com.mobile.wordpress.steps"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
