Feature: test login functionality

  Scenario Outline: check login with valid credentials
    Given chrome browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page

    Examples:
      | username | password |
      | rashi    | 12345    |
      | nirmal   | 12345    |