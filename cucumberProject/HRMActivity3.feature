@activityHRM
Feature: Basic Syntax

Scenario Outline: Add multiple employees
    Given User is on OrangeHRM page
    When User enters "orange" and "orangepassword123"
    Then Add Employees with details "<FirstName>" "<LastName>"
    And Verify Employees are created
    And Close the Browser
    
Examples:
    | FirstName 				| LastName 				|
    | Aakash 						| Sharma  |
