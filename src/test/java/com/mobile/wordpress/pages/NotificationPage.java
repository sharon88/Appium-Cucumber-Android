package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.mobile.wordpress.config.Locators.POST_TITLE_ID;
import static com.mobile.wordpress.config.Strings.FIRST_POST_TEXT;


public class NotificationPage extends Helpers {

    public void navigateToFirstPost() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(POST_TITLE_ID)));
        int postCount = driver.findElements(POST_TITLE_ID).size();
        for (int count = 0; count <= postCount; count++) {
            if (driver.findElements(POST_TITLE_ID).get(count).getText().equals(FIRST_POST_TEXT)) {
                driver.findElements(POST_TITLE_ID).get(count).click();
                break;
            }
        }

    }
}
