Feature: OrangeCRM Login Test
  Scenario: logo presence on OrangeCRM Homepage
    Given I Lunch chrome browser
    When I open HRM HomePage
    Then I Verify logo present on page
    And Close Browser