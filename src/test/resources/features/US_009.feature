@US_009
Feature: US_009_Create a new customer
  Background: employee enters linnbank home page as a employee
    Given employee enters linnbank home page
    Then employee clicks on human icon
    Then employee enters sign in button
    Then employee enters valid employee username "bankprojectemployee51"
    Then employee enters valid password "Bankprojectemployee51."
    Then employee clicks on sign in button
    Then employee navigates to my operations
    Then employee clicks on Manage customers
    And employee should see Customers page
    Then employee clicks on Create a new Customer button


  Scenario Outline: TC01_User can search for a new applicant by their SSN and see all their registration info populated
    Given employee should see Create or edit a Customer page
    Then employee enters the "<SSN of customers>"
    Then employee clicks on Search button
    And employee should see all customer registration info populated
    Then employee sign out from the application
    Examples:
      | SSN of customers |
      | 567-55-1234      |
      | 123-98-7654      |
      | 740-76-4847      |
      | 233-45-6634      |


  Scenario Outline: TC02_Negative scenario_User can search for a new applicant by their incorrect SSN and should see
  alert error message
    Given employee should see Create or edit a Customer page
    Then employee fills the "<incorrect SSN of customers>"
    Then employee clicks on Search button
    And employee should see alert error message
    Then employee sign out from the application
    Examples:
      | incorrect SSN of customers |
      | 265-55-2538      |
      | 256-98-7654      |
      | 586-76-4847      |
      | 233-59-6892      |
