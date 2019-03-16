package com.mobile.wordpress.Pages;

import com.mobile.wordpress.Utils.Helpers;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AccountPage extends Helpers {


    protected static By SIGNOUT = MobileBy.id("me_login_logout_text_view");
    protected static By CONFIRM_LOGOUT_BUTTON = By.id("android:id/button1");
    protected static By CANCEL_LOGOUT_BUTTON = By.id("android:id/button2");
    protected static By ACCOUNT_SETTINGS_ID = By.id("me_settings_text_view");
    protected static By LOGOUT_CONFIRM_MESSAGE_ID = By.id("android:id/message");
    protected static By ACC_USERNAME_ID = By.id("me_username");
    protected static By NOTIFICATION_ID = By.id("android:id/title");
    protected static By CHECKBOX_ID = By.id("android:id/checkbox");
    protected static By TURN_OFF_CONFIRM = By.id("notificationsOff");


    protected void disableIfEnabled() {

        if (!(driver.findElements(CHECKBOX_ID).get(0).isSelected())) {
            driver.findElements(CHECKBOX_ID).get(0).click();
            clickOn(TURN_OFF_CONFIRM);
        }


    }

    public String apendUsernameString(String value) {
        String appendedTxt = "Disconnecting your account will remove all of " + value + "’s WordPress.com data from this device, including local drafts and local changes.";
        return appendedTxt;
    }


}
