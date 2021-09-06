@US_24
Feature: user story 24
  Scenario: System should allow to create new states
    Given user goes to create state endpoint "https://www.gmibank.com/api/tp-states" and create new state
    Then user read all  all states from end point "https://www.gmibank.com/api/tp-states"
    Then  user validate created states