Feature: Selenium Automation Practice Form
  Scenario: Form Practice
    Given I launch Firefox browser
    When I open form webpage
    Then I enter my name
    And I enter my email
    And I choose Gender and Profession
    And I enter country and skill
    And I click the button