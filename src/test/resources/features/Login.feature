Feature: Login on the website

  @E2E
  Scenario Outline: testing the login module
    Given the user is on the serenity demo page
    When attempts to log in <user> and <pass>
    Then will validate the text on screen <message>
    Examples:
      | message   | user          | pass         |
      | Swag Labs | standard_user | secret_sauce |