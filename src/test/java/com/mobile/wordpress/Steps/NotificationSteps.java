package com.mobile.wordpress.Steps;

import com.mobile.wordpress.Pages.NotificationPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static com.mobile.wordpress.Utils.Strings.FIRST_NOTE;
import static com.mobile.wordpress.Utils.Strings.FIRST_NOTE_DES;

public class NotificationSteps extends NotificationPage {

    @Then("^I navigate to my first post$")
    public void iNavigateToMyFirstPost() {
        navigateToFirstPost();
        String firstNote = driver.findElements(POST_ID).get(0).getText();
        Assert.assertEquals(firstNote, FIRST_NOTE);
        String firstNoteDesc = driver.findElements(POST_ID).get(1).getText();
        Assert.assertEquals(firstNoteDesc, FIRST_NOTE_DES);

    }
}
