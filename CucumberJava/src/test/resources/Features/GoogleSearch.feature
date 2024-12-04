Feature: feature to cricbuzz search functionality

  Scenario: validate cricbuzz search is working
    Given browser is open
    And user is on cricbuzz search page
    When user enters a text in search box
    And clicks on search button
    Then user is navigated to search results
