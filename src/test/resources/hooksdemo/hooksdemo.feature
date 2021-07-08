Feature: To check login functionality

  @smoke
  Scenario:
    Given users is on login page
    When users enters username and password
    And users clicks on login button
    Then users is navigated to home page

  Scenario:
    Given users is on login page
    When users enters username and password
    And users clicks on login button
    Then users is navigated to home page