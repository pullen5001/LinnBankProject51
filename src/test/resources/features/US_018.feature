@US018
Feature:US018_System should allow Admin to manage a customer
  Background: US018_Tests
    Given user enters linnbank home page
    Then user clicks on human icon
    And user enters sign in button
    And user enters a valid employee username "bankprojectemployee51"
    And user enters a valid employee password "Bankprojectemployee51."
    And user clicks on sign in button
    And user clicks on my operations
    Then user clicks on manage customer

  Scenario: Verifies customer details
    Given user verifies first name last name middle initial email mobile phone number phone number address create date columns
    Then close the application


  Scenario: Verifies view option
    Given user verifies view option
    Then close the application


  Scenario: Verifies edit option
    Given user verifies edit option
    Then close the application


  Scenario: Create or update info from edit portal
    Given user clicks edit option
    Then user can create or update user info from edit portal
    Then close the application


  Scenario: Delete a customer
    Given user can delete a customer, but seeing a message if the user is sure about deletion
    Then close the application