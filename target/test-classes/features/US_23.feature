@US_23
  Feature: user story 23
    Background: Registration background
      Given registrants endpoint "https://www.gmibank.com/api/tp-account-registrations"
      Then user should read all registrant data

    @Read_registrant
      Scenario: System should allow to read all registrant info using api end point



    @TC_2302
    Scenario: TC_2302 read all customers you created and validate them 1 by 1
      Given user gets all registrant id and validate 6216
      Then user gets all registrant ssn and validate "120-11-3322"
      And user gets all registrant first name and validate "john"
      And user gets all registrant last name and validate "smith"
      And user gets all registrant address and validate "8080 winter circle Alpharetta 30011"
      And user gets all registrant mobile Phone Number and validate "780-232-2222"
      And user gets all registrant user Id and validate 6023
      And user gets all registrant user name and validate "jsmith"
      And user gets all registrant email and validate "jsmith@gmail.com"


