@US_25
Feature: user story 25
  Scenario: System should allow to create new country
    Given user goes to create country endpoint "https://www.gmibank.com/api/tp-countries" and create new country
    Then user read all  all countries from end point "https://www.gmibank.com/api/tp-countries"
    Then  user validate created country