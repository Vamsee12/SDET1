Feature: check home page functionality

  Background: Logging in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is on home page

  Scenario: 1
    When user clicks on logout button
    Then user is navigated to login page

  Scenario: 2
    Then Logged In Successfully is text visible on home page
