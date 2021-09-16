@DEMO_01
Feature: Demo tests
  Scenario: User does every step to transfer money
    Given user goes to linnbank page
    And user clicks on human icon on the page
    And user clicks on register from dropdown
    Then user applies for registration
    And user goes to linnbank page
    And user logins to admin account "admin_user" "admin_password"
    Then user navigates to user management section
    Then capture screenshot
    Then user activates the applicant
    Then capture screenshot
    Then user logs out from admin account
    Then user log in employee account "employee_user" "employee_password"
    And employee navigates to my operations
    And employee clicks on Manage customers
    And employee integrates an account to Customer
    And user logs out from employee account
    And user logs in customer account "demo_username" "demo_password"
    Then User clicks on My operations
    And user clicks on my accounts
    And user get account details
    Then capture screenshot
    Then User clicks on My operations
    Then user clicks on Transfer money from dropdown
    And user selects first account
    And user selects second account
    And user makes money transfer
    And user validates money transfer has been done successfully
    And user clicks on my operations
    And user clicks on my accounts
    And user get account details
    And user logs out from customer account


