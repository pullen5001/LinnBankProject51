@US_001
Feature: US_001 success register with valid credentials

  Background: user goes to linnbank page
    Given  user goes to linnbank page
    And user clicks on human icon on the page
    And user clicks on register from dropdown


  @TC_001
  Scenario Outline: TC_001 Registeration  Positive Test
    Given user clicks on ssn box and enters "<SSN>"
    And user enters "<Firstname>" in First Name text box
    And user enters "<Lastname>" in Last Name text box
    And user enters "<Address>"  in Address text box
    And user enters "<MobilePhoneNr>" in Mobile Phone text box
    And enters "<Username>" in Username text box
    And user enters "<Emailaddress>" in Email text box
    And user enters "<Password>" in New Password text box
    And user enters "<PasswordConf>" in new Password Confirmation text box and clicks on register button
    Then user verifies the success message of the registration "<SuccessMsg>"

    Examples:
      |SSN         |Firstname|Lastname|Address                  |MobilePhoneNr|Username|Emailaddress    |Password  |PasswordConf|SuccessMsg|
      |110-34-6789|Smike   |Clark   |104 Green st Virginia 26724|113-222-4444 |smke8888 |vlarkg@gmail.com|Zarabuk62!|Zarabuk62!  |Registration saved! Please check your email for confirmation alert.|
