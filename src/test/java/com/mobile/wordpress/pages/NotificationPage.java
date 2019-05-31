package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.DeviceInterface;
import com.mobile.wordpress.config.Helpers;
import com.mobile.wordpress.config.ViewFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.mobile.wordpress.config.Locators.POST_TITLE_ID;
import static com.mobile.wordpress.config.Strings.FIRST_POST_TEXT;


public class NotificationPage extends Helpers {

    public NotificationPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void navigateToFirstPost() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(POST_TITLE_ID)));
        int postCount = driver.findElements(POST_TITLE_ID).size();
        for (int count = 0; count <= postCount; count++) {
            WebElement element = (WebElement)driver.findElements(POST_TITLE_ID).get(count);
            if (element.getText().equals(FIRST_POST_TEXT)) {
                element.click();
                break;
            }
        }

    }
}
