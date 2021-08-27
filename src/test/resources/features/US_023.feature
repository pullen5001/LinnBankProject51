@US_24
  Feature: US_20_User can Just create each state 1 by 1
  Scenario: System should allow to create new states using api end point
  "https://www.gmibank.com/api/tp-states" if not created already
    Given user should go "https://www.gmibank.com/api/tp-states"
    Then user should create new states and validate them
