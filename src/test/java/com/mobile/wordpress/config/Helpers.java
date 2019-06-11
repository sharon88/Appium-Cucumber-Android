package com.mobile.wordpress.config;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Helpers extends Config {


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

    public void waitForElementToDeDisplayed(By id) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(id));
    }

}
