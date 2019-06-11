package com.mobile.wordpress.config;

import com.appium.manager.AppiumDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Config {

    public static AppiumDriver<AndroidElement> driver = AppiumDriverManager.getDriver();
    public static WebDriverWait wait = new WebDriverWait(driver,30);

}
