
@activity2_4
Feature: Data driven test without Example

  @tag1
  Scenario: Testing with Data from Scenario without Examples
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close the Browser