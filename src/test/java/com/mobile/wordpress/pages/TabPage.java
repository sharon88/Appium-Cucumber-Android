package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.Helpers;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.TAB_ID;
import static com.mobile.wordpress.config.Strings.*;

public class TabPage extends Helpers {

    public void clickTab(String tab) {
        switch (tab.toLowerCase()) {
            case HOMESCREEN_TAB:
                driver.findElements(TAB_ID).get(0).click();
                Assert.assertTrue(driver.findElements(TAB_ID).get(0).isSelected());
                break;
            case FEED_TAB:
                driver.findElements(TAB_ID).get(1).click();
                Assert.assertTrue(driver.findElements(TAB_ID).get(1).isSelected());
                break;
            case ACCOUNT_TAB:
                driver.findElements(TAB_ID).get(2).click();
                Assert.assertTrue(driver.findElements(TAB_ID).get(2).isSelected());
                break;
            case NOTIFICATION_TAB:
                driver.findElements(TAB_ID).get(3).click();
                Assert.assertTrue(driver.findElements(TAB_ID).get(3).isSelected());
                break;
            default:
                Assert.fail("Not a valid tab");
        }

    }


}

