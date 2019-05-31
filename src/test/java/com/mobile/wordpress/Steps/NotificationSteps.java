package com.mobile.wordpress.steps;

import com.appium.manager.AppiumDriverManager;
import com.mobile.wordpress.pages.NotificationPage;
import cucumber.api.java.en.Then;

public class NotificationSteps{

    NotificationPage notificationPage = new NotificationPage(AppiumDriverManager.getDriver());


    @Then("^I navigate to my first post$")
    public void iNavigateToMyFirstPost() {
        notificationPage.navigateToFirstPost();
//        MobileElement element = (MobileElement)driver.findElements(POST_ID).get(0);
//        String firstNote = element.getText();
//        Assert.assertEquals(firstNote, FIRST_NOTE);
//        MobileElement element2 = (MobileElement)driver.findElements(POST_ID).get(1);
//        String firstNoteDesc = element2.getText();
//        Assert.assertEquals(firstNoteDesc, FIRST_NOTE_DES);
    }
}
