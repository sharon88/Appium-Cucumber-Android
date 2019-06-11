package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;

import static com.mobile.wordpress.config.Locators.*;
import static com.mobile.wordpress.config.Strings.PASSWORD;
import static com.mobile.wordpress.config.Strings.USERNAME;

public class LoginPage extends Helpers {


    public void ConfirmLoginPage() {
        driver.findElement(USERNAME_ID).isDisplayed();
    }

    public void enterCredentails() {
        driver.findElement(USERNAME_ID).sendKeys(USERNAME);
        driver.findElement(PASSWORD_ID).sendKeys(PASSWORD);
        driver.findElement(SIGNIN_BUTTON).click();
    }

}
