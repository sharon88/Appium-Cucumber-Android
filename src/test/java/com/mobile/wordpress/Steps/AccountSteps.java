package com.mobile.wordpress.steps;

import com.mobile.wordpress.pages.AccountPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.*;

public class AccountSteps extends AccountPage {


    @Then("^I sign out of the app$")
    public void iSignOutOfTheApp() {
        String username = fetchText(ACC_USERNAME_ID);
        clickOn(SIGNOUT);
        String ConfirmMessage = fetchText(LOGOUT_CONFIRM_MESSAGE_ID);
        String expectedMessgae = apendUsernameString(username);
        Assert.assertEquals(ConfirmMessage, expectedMessgae);
        Assert.assertEquals(fetchText(CONFIRM_LOGOUT_BUTTON), "DISCONNECT");
        Assert.assertEquals(fetchText(CANCEL_LOGOUT_BUTTON), "CANCEL");
        clickOn(CONFIRM_LOGOUT_BUTTON);
        waitForElementToDeDisplayed(USERNAME_ID);
    }

    @Then("^I want to uncheck notification$")
    public void iWantToUncheckNotifcation() {
        clickOn(ACCOUNT_SETTINGS_ID);
        driver.findElements(NOTIFICATION_ID).get(1).click();
        String optionName = driver.findElements(NOTIFICATION_ID).get(0).getText();;
        Assert.assertEquals(optionName, "Enable notifications");
        disableIfEnabled();
        Boolean checkBoxStatus  =driver.findElements(CHECKBOX_ID).get(0).isSelected();
        Assert.assertFalse(checkBoxStatus);
    }

}
