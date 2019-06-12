package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static com.mobile.wordpress.config.Locators.CHECKBOX_ID;
import static com.mobile.wordpress.config.Locators.TURN_OFF_CONFIRM;

public class AccountPage extends Helpers {



    public AccountPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public void disableIfEnabled() {
        MobileElement element = (MobileElement)driver.findElements(CHECKBOX_ID).get(0);

        if (!(element.isSelected())) {
            element.click();
            clickOn(TURN_OFF_CONFIRM);
        }


    }

    public String apendUsernameString(String value) {
        String appendedTxt = "Disconnecting your account will remove all of " + value + "’s WordPress.com data from this device, including local drafts and local changes.";
        return appendedTxt;
    }


}
