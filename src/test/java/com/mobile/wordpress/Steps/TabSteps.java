package com.mobile.wordpress.steps;

import com.mobile.wordpress.pages.TabPage;
import cucumber.api.java.en.When;

public class TabSteps extends TabPage {


    @When("^I click on (.*) tab$")
    public void iClickOnTab(String tab) {
        clickTab(tab);
    }


}
