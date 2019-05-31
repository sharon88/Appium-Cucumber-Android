package com.mobile.wordpress.steps;

import com.appium.manager.AppiumDriverManager;
import com.mobile.wordpress.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.LOGGED_IN_TITLE_ID;

public class LoginSteps{

    public LoginSteps(){
        System.out.println("**************");
        System.out.println("tesco");
        System.out.println("**************");
    }

     public LoginPage loginPage;


    @Given("^I am in the application landing screen$")
    public void iAmInTheApplicationLandingScreen() {
        try {
            loginPage = new LoginPage(AppiumDriverManager.getDriver());
            loginPage.ConfirmLoginPage();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @And("^I enter user credentials$")
    public void iEnterUserCredentials() {
        loginPage.enterCredentails();
    }

    @Then("^I am signed in to the app$")
    public void iAmSignedInToTheApp() {
        Assert.assertTrue(loginPage.elementExists(LOGGED_IN_TITLE_ID));
    }


}
