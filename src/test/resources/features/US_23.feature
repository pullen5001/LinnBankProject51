@US_23
  Feature: user story 23
    Background: Registration background
      Given registrants endpoint "https://www.gmibank.com/api/tp-account-registrations"

    @Read_registrant
      Scenario: System should allow to read all registrant info using api end point
      Then user should read all registrant data


    @ONLY @TC_2302
    Scenario: TC_2302 read all customers you created and validate them 1 by 1
      Given user gets all registrant ssn and validate "245-35-5468"
      And user gets all registrant first name and validate "Adam"
      And user gets all registrant last name and validate "John"
      And user gets all registrant address and validate "1101 ROPER MOUNTAIN RD"
      And user gets all registrant mobile Phone Number and validate "123-456-7890"
      And user gets all registrant user Id and validate 4092
      And user gets all registrant user name and validate "adam"
      And user gets all registrant email and validate "abc.user@gmail.com"


