package com.mobile.wordpress.steps;

import com.appium.manager.AppiumDriverManager;
import com.mobile.wordpress.pages.AccountPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.*;

public class AccountSteps {

    AccountPage accountPage = new AccountPage(AppiumDriverManager.getDriver());

    @Then("^I sign out of the app$")
    public void iSignOutOfTheApp() {
        String username = accountPage.fetchText(ACC_USERNAME_ID);
        accountPage.clickOn(SIGNOUT);
        String ConfirmMessage = accountPage.fetchText(LOGOUT_CONFIRM_MESSAGE_ID);
        String expectedMessgae = accountPage.apendUsernameString(username);
        Assert.assertEquals(ConfirmMessage, expectedMessgae);
        Assert.assertEquals(accountPage.fetchText(CONFIRM_LOGOUT_BUTTON), "DISCONNECT");
        Assert.assertEquals(accountPage.fetchText(CANCEL_LOGOUT_BUTTON), "CANCEL");
        accountPage.clickOn(CONFIRM_LOGOUT_BUTTON);
        accountPage.waitForElementToDeDisplayed(USERNAME_ID);
    }

    @Then("^I want to uncheck notification$")
    public void iWantToUncheckNotifcation() {
        accountPage.clickOn(ACCOUNT_SETTINGS_ID);
//        MobileElement element = (MobileElement)driver.findElements(NOTIFICATION_ID).get(1);
//        element.click();
//        MobileElement textId = (MobileElement)driver.findElements(NOTIFICATION_ID).get(0);
//        String optionName = textId.getText();
//        Assert.assertEquals(optionName, "Enable notifications");
//        accountPage.disableIfEnabled();
//        MobileElement checkBoxElement = (MobileElement) driver.findElements(CHECKBOX_ID).get(0);
//        Boolean checkBoxStatus = checkBoxElement.isSelected();
//        Assert.assertFalse(checkBoxStatus);
    }

}
