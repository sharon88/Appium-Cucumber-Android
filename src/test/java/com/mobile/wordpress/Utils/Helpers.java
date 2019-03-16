package com.mobile.wordpress.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


public class Helpers extends Config {

    protected Boolean elementExists(By id) {
        try {
            driver.findElement(id).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void clickOn(By id) {
        driver.findElement(id).click();
    }

    protected String fetchText(By id) {
        return driver.findElement(id).getText();
    }

}
