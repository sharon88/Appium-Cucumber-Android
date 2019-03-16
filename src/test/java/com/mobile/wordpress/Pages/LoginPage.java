package com.mobile.wordpress.Pages;

import com.mobile.wordpress.Utils.Helpers;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import static com.mobile.wordpress.Utils.Strings.PASSWORD;
import static com.mobile.wordpress.Utils.Strings.USERNAME;

public class LoginPage extends Helpers {

    protected static final By USERNAME_ID = MobileBy.id("nux_username");
    private static final By PASSWORD_ID = MobileBy.id("nux_password");
    private static final By SIGNIN_BUTTON = MobileBy.id("nux_sign_in_button");
    protected static final By LOGGED_IN_TITLE_ID = MobileBy.id("my_site_title_label");


    protected void ConfirmLoginPage() {
        driver.findElement(USERNAME_ID).isDisplayed();
    }

    protected void enterCredentails() {
        driver.findElement(USERNAME_ID).sendKeys(USERNAME);
        driver.findElement(PASSWORD_ID).sendKeys(PASSWORD);
        driver.findElement(SIGNIN_BUTTON).click();
    }

}
