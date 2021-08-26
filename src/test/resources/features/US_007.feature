@US_007
Feature: US007_System should not allow to make updates with invalid credentials
  Background: user enters linnbank home page
    Given user enters linnbank home page
    Then user clicks on human icon
    Then user enters sign in button
    Then user enters valid customer username "Aya"
    Then user enters valid password "ayaHappy123"
    Then user clicks on sign in button
    Then user clicks on customer account button
    Then user clicks on userInfoButton

  Scenario: TC01_Email id cannot contain just digits or chars without "@" sign or "." extension
    Given user should see User settings for [user] page
    Then user click on email textbox
    And clear everything inside email textbox
    And user enters invalid email1 address "ayaHappy123"
    Then verify the message has "This field is invalid"
    Then sign out from the application

  Scenario: TC02_There should not be an option of any other language other than English or Turkish
    Given user should see User settings for [user] page
    Then user navigates to language dropdown
    And user enters the language
    And user verifies only English and Turkish languages
    Then sign out from the application

  Scenario Outline: TC03_Email id cannot contain just digits or chars without "@" sign or "." extension
    Given user should see User settings for [user] page
    Then user click on email textbox
    And clear everything inside email textbox
    And user enters invalid email address "<invalid email>"
    Then verify the message has "<This field is invalid>"
    Then sign out from the application
    Examples:
      | invalid email  | This field is invalid|
      | ayaHappy123    | This field is invalid|
      | behappy@gmailcom| This field is invalid|
      |123456789        | This field is invalid |
      |customer         | This field is invalid |



