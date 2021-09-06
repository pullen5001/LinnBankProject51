@US_26
Feature: user story 26
  Scenario Outline: : System should allow to update countries using api end point
    Given user can update any country with endPoint "https://www.gmibank.com/api/tp-countries" "<name>" and its id "<id>"

    Examples: update country
      |name|id|
      |AnyCountry Guncel|95023|