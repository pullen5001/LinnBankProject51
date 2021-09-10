@US05
Feature: Login with invalid credentials
  Background: User logged in
    Given User is on homepage

    Scenario: Verify Error Message with invalid username
      When user send invalid username YeniUser900
      And user send valid password Test101
      Then User verify error message contains Failed to sign in! Please check your credentials and try again.

   Scenario: Verify Error Message with invalid password
    When user send invalid username YeniUser
    And user send valid password Test101111
    Then User verify error message contains Failed to sign in! Please check your credentials and try again.

  Scenario: Verify Error Message with invalid username and password
    When user send invalid username YeniUser1
    And user send valid password Test101111
    Then User verify error message contains Failed to sign in! Please check your credentials and try again.

  Scenario: Verify "Did you forget your password?" link is enabled
    When user send invalid username YeniUSer1
    And user send valid password Test
    And user click on Did you forget your password? link
    Then user verify that page navigate to reset password page

  Scenario: Verify "You don't have an account yet? Register a new account" link is enabled
    When user send invalid username YeniUser23
    And user send valid password Test321
    And user click on You don't have an account yet? Register a new account link
    Then user verify that page navigate to registration page
