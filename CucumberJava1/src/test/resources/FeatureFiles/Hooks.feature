Feature: Check login functionality

  @Smoke
  Scenario: scenario1
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to home page

  Scenario: scenario2
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to home page
