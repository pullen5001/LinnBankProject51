@US_008
Feature: US007_System should not allow to make updates with invalid credentials
  Background: user is on linnbank home page
    Given user is on linnbank home page
    Then user provides valid customer username "Aya"
    Then user provides valid password "ayaHappy123"
    Then user navigates on sign in button and click
    Then user clicks on customer account button
    Then user clicks on passwordButton

  Scenario: TC01_The old password should not be used
    Given user enters current password
    Then user enters old password in new password textbox
    And user verifies he could not update with the old password
    Then user sign out from the application

