@activityHRM
Feature: Basic Syntax

Scenario: Creating a job vacancy
    Given User is on OrangeHRM page
    When User enters "orange" and "orangepassword123"
    Then Create new job vacancy
    And Verify job vacancy is created
    And Close the Browser