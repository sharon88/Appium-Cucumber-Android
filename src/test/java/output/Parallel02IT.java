package output;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/sharon/Desktop/Appium/AppiumDemo/src/test/resources/features/Accounts.feature:12"},
        plugin = {"com.cucumber.listener.CucumberListener:/Users/sharon/Desktop/Appium/AppiumDemo/target/2"},
        monochrome = false,
        glue = {"com.mobile.wordpress.steps"})
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
