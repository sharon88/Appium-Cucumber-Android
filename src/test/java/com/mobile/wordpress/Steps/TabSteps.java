package com.mobile.wordpress.steps;

import com.appium.manager.AppiumDriverManager;
import com.mobile.wordpress.pages.TabPage;
import cucumber.api.java.en.When;

public class TabSteps {

    TabPage tabPage = new TabPage(AppiumDriverManager.getDriver());


    @When("^I click on (.*) tab$")
    public void iClickOnTab(String tab) {
        tabPage.clickTab(tab);
    }


}
