@US_22
Feature: user story 22
  Background: country background
    Given state endpoint "https://www.gmibank.com/api/tp-states"

  @State_info
  Scenario: System should allow to read all states info using api end point
    Given user should read all states data that is created

  @TC_2202
  Scenario: TC_2202 read all states you created and validate them 1 by 1
    Given  user gets second state id 27510 and validate
    And one user gets second state "name":"Virginia1" and validate
