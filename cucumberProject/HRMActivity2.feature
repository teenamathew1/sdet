@activityHRM
Feature: Basic Syntax

Scenario: Adding a candidate for recruitment
    Given User is on OrangeHRM page
    When User enters "orange" and "orangepassword123"
    Then Add candidate to job
    And Verify candidate is created
    And Close the Browser