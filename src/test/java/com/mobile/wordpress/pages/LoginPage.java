package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static com.mobile.wordpress.config.Locators.*;
import static com.mobile.wordpress.config.Strings.PASSWORD;
import static com.mobile.wordpress.config.Strings.USERNAME;

public class LoginPage extends Helpers {

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        System.out.println(driver);
    }


    public void ConfirmLoginPage() {
        driver.findElement(USERNAME_ID).isDisplayed();
    }

    public void enterCredentails() {
        driver.findElement(USERNAME_ID).sendKeys(USERNAME);
        driver.findElement(PASSWORD_ID).sendKeys(PASSWORD);
        driver.findElement(SIGNIN_BUTTON).click();
    }

}
