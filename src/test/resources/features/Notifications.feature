@notification @run
Feature: Notifications

  @notification1
  Scenario: I want to naviagte to my first post
    Given I am in the application landing screen
    When I enter user credentials
    And I am signed in to the app
    When I click on Notification tab
    Then I navigate to my first post
