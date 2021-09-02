@US_23
  Feature: user story 23
    Background: Registration background
      Given registrants endpoint "https://www.gmibank.com/api/tp-account-registrations"

    @Read_registrant
      Scenario: System should allow to read all registrant info using api end point
      Then user should read all registrant data


    @TC_2302
    Scenario: TC_2302 read all customers you created and validate them 1 by 1
      Given user gets fifth registrant ssn "245-35-5468" and validate
      And one user gets fifth registrant "firstName":"Adam" and validate
      And two user gets fifth registrant "lastName":"John" and validate
      And three user gets fifth registrant "address":"1101 ROPER MOUNTAIN RD" and validate
      And four user gets fifth registrant "mobilePhoneNumber":"123-456-7890" and validate
      And five user gets fifth registrant "userId":4092 and validate
      And six user gets fifth registrant "userName":"adam" and validate
      And seven user gets fifth registrant "email":"abc.user@gmail.com" and validate
      And eight user gets fifth registrant "createDate":"2020-11-09T15:31:53.544Z" and validate

