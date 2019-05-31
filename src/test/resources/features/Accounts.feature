@account @run
Feature: Accounts

  @account1
  Scenario: As a user i Navigate to accounts screen
    Given I am in the application landing screen
    When  I enter user credentials
    And I am signed in to the app
    Then I click on Account tab

  @account2 @a
  Scenario: As a user i sign out
    Given I am in the application landing screen
    When  I enter user credentials
    And I am signed in to the app
    When I click on Account tab
    Then I sign out of the app

  @account3
  Scenario: As a user i Uncheck notification
    Given I am in the application landing screen
    When  I enter user credentials
    And I am signed in to the app
    When I click on Account tab
    Then I want to uncheck notification