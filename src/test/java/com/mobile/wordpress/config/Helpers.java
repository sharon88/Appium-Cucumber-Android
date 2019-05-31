package com.mobile.wordpress.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Helpers {

    public AppiumDriver driver;
    public static WebDriverWait wait;


    public Helpers(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


    public Boolean elementExists(By id) {
        try {
            driver.findElement(id).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickOn(By id) {
        driver.findElement(id).click();
    }

    public String fetchText(By id) {
        return driver.findElement(id).getText();
    }

    public void waitForElementToDeDisplayed(By id){
        wait.until(ExpectedConditions.visibilityOfElementLocated(id));

    }

}
