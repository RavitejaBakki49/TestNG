@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |


@tag2
  Scenario Outline: Login to a website
    Given user is on login page
    When user enters "<username>" and "<password>" on the login page
    Then user clicks on submit button
    And user redirects to homepage

    Examples: 
      | username | password    |
      | student  | Password123 |
