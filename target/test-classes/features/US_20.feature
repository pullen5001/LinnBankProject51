@US_20
Feature: user story 20
  Background: customer background
    Given customer endpoint "https://www.gmibank.com/api/tp-customers"

  @Customer_info
  Scenario: System should allow to read all registrant info using api end point
    Given user should read all customer data that is created

    @TC_2002
    Scenario: TC_2002 read all customers you created and validate them 1 by 1
      Given user gets seventh customer ssn "821-84-3971" and validate
      And one user gets seventh customer "firstName":"Wendell" and validate
      And two user gets seventh customer "lastName":"Trantow" and validate
      And three user gets seventh customer "address":"Apt. 391 572 Rodrick Mountains, Port Myungfurt, KY 22925-3615", and validate
      And four user gets seventh customer "mobilePhoneNumber":"047-152-6952" and validate
      And five user gets seventh customer "email":"hugo.schneider@example.com" and validate
      And six user gets seventh customer "createDate":"2020-12-13T10:20:00Z" and validate
      And seven user gets seventh customer "zipcode":"63622-1699" and validate





