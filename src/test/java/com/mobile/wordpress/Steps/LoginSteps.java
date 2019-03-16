package com.mobile.wordpress.Steps;

import com.mobile.wordpress.Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LoginSteps extends LoginPage {

    @Given("^I am in the application landing screen$")
    public void iAmInTheApplicationLandingScreen(){
        ConfirmLoginPage();
    }

    @And("^I enter user credentials$")
    public void iEnterUserCredentials(){
        enterCredentails();
    }

    @Then("^I am signed in to the app$")
    public void iAmSignedInToTheApp(){
        Assert.assertTrue(elementExists(LOGGED_IN_TITLE_ID));
    }



}
