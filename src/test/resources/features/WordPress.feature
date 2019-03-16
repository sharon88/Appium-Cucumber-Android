@login @run
Feature: Login

  @login1
  Scenario: Login to the app
    Given I am in the application landing screen
    And I enter user credentials
    Then I am signed in to the app
