@US015
Feature:US015_System should allow user to manage their account
  Background: US015_Tests
    Given user enters linnbank home page
    Then user clicks on human icon
    Then user enters sign in button
    Then user enters a valid customer username "hakki10"
    Then user enters a valid password "Hakki10."
    Then user clicks on sign in button
    Then user clicks on my operations button
    Then user clicks on my accounts

  Scenario: TC01 System should allow to user
    Given user see all account types and balance populated
    Given user clicks on account menu
    Then user sign out
    Then close the application

  Scenario: TC02 user can view transaction
    Given user see all transaction
    Then user verifies the transaction
    Then close the application


