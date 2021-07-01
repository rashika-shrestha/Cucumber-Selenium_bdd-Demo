Feature: To search on google
  Scenario: search anything on google
    Given browser is open
    And user is on google search page
    When user enters with search key
    And hits enter
    Then user is navigated search result page