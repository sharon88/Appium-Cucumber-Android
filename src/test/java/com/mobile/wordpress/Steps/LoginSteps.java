package com.mobile.wordpress.steps;

import com.mobile.wordpress.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.LOGGED_IN_TITLE_ID;

public class LoginSteps extends LoginPage {

    @Given("^I am in the application landing screen$")
    public void iAmInTheApplicationLandingScreen() {
        ConfirmLoginPage();
    }


    @And("^I enter user credentials$")
    public void iEnterUserCredentials() {
        enterCredentails();
    }

    @Then("^I am signed in to the app$")
    public void iAmSignedInToTheApp() throws InterruptedException {
        waitForElementToDeDisplayed(LOGGED_IN_TITLE_ID);
        Assert.assertTrue(elementExists(LOGGED_IN_TITLE_ID));
    }


}
