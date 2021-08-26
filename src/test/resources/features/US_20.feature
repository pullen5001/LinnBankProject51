@US_20
  Feature: Us20
  Scenario: System should allow to read all customers info using api end point
    Given user should go "https://www.gmibank.com/api/tp-customers"
    Then user should read all customer data that is created
    And user validate all customer information