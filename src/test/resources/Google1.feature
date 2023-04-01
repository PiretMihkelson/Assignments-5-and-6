Feature: Google account sign up
  Scenario: Create a Google account
    Given I launch Firefox browser for Google
    When I open Google sign up webpage
    Then I enter user data and press next button
    And Close browser for Google