#@LoginFeature
Feature: user wants to login in the system

#  @LoginScenario
  Scenario: login with valid credentials
    Given user is on login page
    When user enters username and password
    And enter login button
    Then user logged in successfully

#  Scenario Outline: login with valid credentials
#    Given user is on login page
#    When user enters <username> and <password>
#    And enter login button
#    Then user logged in successfully
#
#    Examples:
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |
