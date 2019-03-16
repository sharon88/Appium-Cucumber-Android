package com.mobile.wordpress.Steps;

import com.mobile.wordpress.Pages.TabPage;
import cucumber.api.java.en.When;

public class TabSteps extends TabPage {

    @When("^I click on (.*) tab$")
    public void iClickOnTab(String tab) {
        clickTab(tab);
    }


}
