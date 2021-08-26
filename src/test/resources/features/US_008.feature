@US_008
Feature: US_008_Password segment on Homepage should be editable
  Background: user enters linnbank home page
    Given user enters linnbank home page
    Then user clicks on human icon
    Then user enters sign in button
    Then user enters valid customer username "Aya"
    Then user enters valid password "ayaHappy123"
    Then user clicks on sign in button
    Then user clicks on customer account button
    Then user clicks on passwordButton

  Scenario: TC01_The old password should not be used
    Given user enters current password
    Then user enters old password in new password textbox
    And user verifies he could not update with the old password
    Then user sign out from the application

