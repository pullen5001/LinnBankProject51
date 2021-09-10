@US019
Feature:US019_System should allow Admin to create a new Account
  Background: US019_Tests
    Given user enters linnbank home page
    Then user clicks on human icon
    And user enters sign in button
    And user enters a valid employee username "bankprojectemployee51"
    And user enters a valid employee password "Bankprojectemployee51."
    And user clicks on sign in button
    And user clicks on my operations
    And user clicks on manage accounts
    Then user clicks on create a new account

  Scenario: Create a description
    Given user can create a description for the new account
    Then close the application


  Scenario: Provide a balance
    Given user should provide a balance for the first-time account creation as Dollar
    Then close the application


  Scenario: Select an account type
    Given user can select an account type as checking saving credit-card investing
    Then close the application


  Scenario: Define account status
    Given user should define account status as active suspended or closed
    Then close the application


  Scenario: Select an employee
    Given user can select an employee from the drop-down
    Then close the application