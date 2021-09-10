@US016
Feature: Money transfer should be available
  Background: User is on linnbank homepage
    Given User clicks on human icon
    Then User clicks sign in button
    Then User enters a valid customer username "bankprojectcustomer51"
    Then User enters a valid customer password "Bankprojectcustomer51."
    Then User clicks on sign in button
    Then User clicks on My operations
    Then user clicks on Transfer money from dropdown


    Scenario: TC_01 User should have at least 2 accounts or more to make money transfer with own and others
      Given user clicks From dropdown
      Then Verify there are two accounts


    Scenario: TC_02 User can select the first account as From dropdown where they receive their money from
      Given user clicks From dropdown
      When user clicks on To dropdown
      Then Verify there is an account


    Scenario: TC_03 User can select a balace that they want to proceed with
      When user click on Balance text box
      Then Verify user can select balance


    Scenario: TC_04 User should provide a description for that transfer
      When User click description text box
      Then User enters description "This is a description"


   Scenario: TC_05 User can make sure transfer is done successfully validating the message
    an amount of the transaction
      When User click Make Transfer

