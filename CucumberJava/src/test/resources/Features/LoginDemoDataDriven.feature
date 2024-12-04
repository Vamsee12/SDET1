Feature: feature to test login functionality by data driven methodology

  Scenario Outline: check login is successfull with multiple valid credentials
    Given chrome browser is open
    And user is on the login page
    When user enters the <username> and <password>
    And clicks on the login button
    Then user is navigated to the home page

    Examples: 
      | username | password             |
      | practice | SuperSecretPassword! |
