package com.mobile.wordpress.steps;

import com.mobile.wordpress.pages.NotificationPage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import static com.mobile.wordpress.config.Locators.POST_ID;
import static com.mobile.wordpress.config.Strings.FIRST_NOTE;
import static com.mobile.wordpress.config.Strings.FIRST_NOTE_DES;

public class NotificationSteps extends NotificationPage {


    @Then("^I navigate to my first post$")
    public void iNavigateToMyFirstPost() {
        navigateToFirstPost();
        Assert.assertEquals(driver.findElements(POST_ID).get(0).getText(), FIRST_NOTE);
        Assert.assertEquals(driver.findElements(POST_ID).get(1).getText(), FIRST_NOTE_DES);
    }
}
