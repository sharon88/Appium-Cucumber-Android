package com.mobile.wordpress.pages;

import com.mobile.wordpress.config.DeviceInterface;
import com.mobile.wordpress.config.Helpers;
import com.mobile.wordpress.config.ViewFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.mobile.wordpress.config.Locators.TAB_ID;
import static com.mobile.wordpress.config.Strings.*;

public class TabPage extends Helpers {
    public ViewFactory viewFactory = new ViewFactory(driver);
    public DeviceInterface runnerInfo;


    public TabPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    public void clickTab(String tab) {
        switch (tab.toLowerCase()) {
            case HOMESCREEN_TAB:
                MobileElement element0 = (MobileElement)driver.findElements(TAB_ID).get(0);
                element0.click();
                Assert.assertTrue(element0.isSelected());
                break;
            case FEED_TAB:
                MobileElement element1 = (MobileElement)driver.findElements(TAB_ID).get(1);
                element1.click();
                Assert.assertTrue(element1.isSelected());
                break;
            case ACCOUNT_TAB:
                MobileElement element2 = (MobileElement)driver.findElements(TAB_ID).get(2);
                element2.click();
                Assert.assertTrue(element2.isSelected());
                break;
            case NOTIFICATION_TAB:
                MobileElement element3 = (MobileElement)driver.findElements(TAB_ID).get(3);
                element3 .click();
                Assert.assertTrue(element3.isSelected());
                break;
            default:
                Assert.fail("Not a valid tab");

        }

    }


}

