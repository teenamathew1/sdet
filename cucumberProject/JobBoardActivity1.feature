
@jobBoardActivity
Feature: Create and verify user creation on Job Board site

@jobBoardActivity1
  Scenario: Create a new user 
    Given User is on Job Board login page
		When User enters username and password
    And Click on Users Menu and Add New button
    Then Create the new User
    And Close the browser

@jobBoardActivity2
  Scenario: Searching for jobs and applying to them using XPath
    Given Open the Jobs page
    When Search for a fulltime tester job
    And Find the job details and print the Job title
    Then Apply for the job
		And Close the Browser
		
@jobBoardActivity3
  Scenario: Posting a job using data from feature File
    Given Open the Alchemy Jobs site
    And Go to Post a Job Page
    Then User fills in job details with email "jk@gmail.com" title "Automation Tester" location "Bangalore" jd "49" url "jk@gmail.com"
    And Close the Browser
		
@jobBoardActivity4
  Scenario Outline: Posting a job using parameterization
    Given Open the Alchemy Jobs site
    And Go to Post a Job Page
    Then User fills in job details with email "<Email>" title "<Title>" location "<Location>" jd "<JobId>" url "<URL>"
    And Close the Browsers
		
 Examples: 
      | Email   			| Title							 |  Location		|		JobId	|		URL						|
      | tm3@gmail.com	|	Automation tester	 |  Bangalore   |    48		|	tm3@gmail.com   |
