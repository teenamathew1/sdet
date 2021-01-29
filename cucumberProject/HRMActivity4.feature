@activityHRM
Feature: Basic Syntax

Scenario Outline: Creating multiple vacancies
    Given User is on OrangeHRM page
    When User enters "orange" and "orangepassword123"
    Then Create new job vacancies with details "<Title>" "<Name>" "<Hiring Manager>"
    And Verify job vacancy is created
    And Close the Browser

Examples:
    | Title 				| Name 				| Hiring Manager |
    | Test Engineer 				| Test Engineer  | Ram Moorthy|
    | Automation Test Engineer 	| Automation Test Engineer  | Ram Moorthy|