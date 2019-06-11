package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;

import static com.mobile.wordpress.config.Locators.CHECKBOX_ID;
import static com.mobile.wordpress.config.Locators.TURN_OFF_CONFIRM;
import static org.apache.logging.log4j.core.async.AsyncLoggerContextSelector.isSelected;

public class AccountPage extends Helpers {


    public void disableIfEnabled() {
        if (driver.findElements(CHECKBOX_ID).get(0).isSelected()) {
            driver.findElements(CHECKBOX_ID).get(0).click();
            clickOn(TURN_OFF_CONFIRM);
        }
    }

    public String apendUsernameString(String value) {
        String appendedTxt = "Disconnecting your account will remove all of " + value + "’s WordPress.com data from this device, including local drafts and local changes.";
        return appendedTxt;
    }


}
