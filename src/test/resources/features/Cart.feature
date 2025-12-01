Feature: User select items

  Background:
    Given the user is on the serenity demo page

  @E2E
  Scenario Outline: testing the selection items
    Given attempts to log in <user> and <pass>
    When user select item
    Then will validate the selected items <message2> and <message3>
    Examples:
      | message2            | message3              | user          | pass         |
      | Sauce Labs Backpack | Sauce Labs Bike Light | standard_user | secret_sauce |
