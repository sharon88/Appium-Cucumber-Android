package com.mobile.wordpress.Pages;

import com.mobile.wordpress.Utils.Helpers;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.mobile.wordpress.Utils.Strings.FIRST_POST_TEXT;


public class NotificationPage extends Helpers {

    private static By POST_TITLE_ID = MobileBy.id("note_subject");
    protected static By POST_ID = MobileBy.id("note_text");

    protected void navigateToFirstPost() {
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
