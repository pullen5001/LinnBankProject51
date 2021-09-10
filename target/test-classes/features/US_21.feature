@US_21
Feature: user story 21
  Background: country background
    Given country endpoint "https://www.gmibank.com/api/tp-countries"

  @Country_info
  Scenario: System should allow to read all countries info using api end point
    Given user should read all country data that is created

  @TC_2102
  Scenario: TC_2102 read all countries you created and validate them 1 by 1
    Given  user gets fifth country id 22349 and validate
    And one user gets fifth country "name":"KENYA" and validate






