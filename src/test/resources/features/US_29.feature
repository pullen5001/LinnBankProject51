@US_29
  Feature: user story 29
    Background: create connection gmibank
    Scenario: create connection using DataBase
      Given database connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"

    Scenario Outline: database gmibank read and validate created data using with all customer
      And database gmibank user reads the Customers data using "<query>" and "<columnName>"
      Then database gmibank validate customers data

      Examples: database gmibank read the data
        |query|columnName|
        |Select * from tp_customer|ssn|

    Scenario Outline: database gmibank read and validate created data using with all admin role
      And database gmibank user reads the admin data using "<query1>" and "<columnAdmin>"
      Then database gmibank validate admin data

      Examples: database gmibank read the data
        |query1|columnAdmin|
        |Select * from jhi_persistent_audit_event|principal|

    Scenario Outline: database gmibank read and validate created data using with all country
      And database gmibank user reads the country data using "<queryCountry>" and "<columnCountryName>"
      Then database gmibank validate country data

      Examples: database gmibank read the data
        |queryCountry|columnCountryName|
        |Select * from tp_country|name|

    Scenario Outline: database gmibank read and validate created data using with all state
      And database gmibank user reads the state data using "<queryState>" and "<columnState>"
      Then database gmibank validate state data

      Examples: database gmibank read the data
        |queryState|columnState|
        |Select * from tp_state|name|




