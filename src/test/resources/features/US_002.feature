@US_002
Feature: US_002 Negative test using invalid credentials for registration page

  Background: user goes to linnbank page
    Given  user goes to linnbank page
    And user clicks on human icon on the page
    And user clicks on register from dropdown

  @TC_00201
  Scenario: TC_00201 registiration test
    And  user leaves all text boxes blanks and clicks on register button
    Then user verifies that all text boxes has error text

  @TC_00202
  Scenario:  TC_00202 invalid SSN test
    And  user enters an unhyphenated ssn number in ssn text box
    Then user verifies error text "Your SSN is invalid"

  @TC_0203
  Scenario: TC_00203 invalid mobile phone number test
    And user enters an invalid Mobile nr in Mobile text box by without hyphenated between numbers
    Then  user verifies err mobile txt

  @TC_0204
  Scenario:  TC_00204 invalid email test
    And user entes an invalid email in Email box by without respecting hyphenated between numbers
    Then user verifies err email txt