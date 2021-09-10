@Demo2
  @Read_Customer
  Feature: Demo2 Tests
    Scenario: System should allow to read information customer
      Given customer endpoint "https://www.gmibank.com/api/tp-customers"
      Then user should read all customer data that is created

      @Create_Update_Delete_Country
    Scenario: System should allow to create a new country
      Given user goes to create country endpoint "https://www.gmibank.com/api/tp-countries" and create new country
      Then  user validate created country

    Scenario Outline: User can update a country
      Given user can update any country with endPoint "https://www.gmibank.com/api/tp-countries" "<name>" and its id "<id>"
      Examples: update country
        |name|id|
        |Italia Demo New|95053|

    Scenario Outline: User can delete a country
      Given user should be delete a country with using "<endpoint_country>" and its extension "<id>" and verify
    Examples: Delete country
      | endpoint_country| id|
      |https://www.gmibank.com/api/tp-countries|/95053|

    Scenario Outline: validate all data by using database
      Given database connection with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And database gmibank user reads the country data using "<queryCountry>" and "<columnCountryName>"
      Then database gmibank validate country data
      Examples: database gmibank read the data
        |queryCountry|columnCountryName|
        |Select * from tp_country|name|

    Scenario Outline: create customer pdf file by using DataBase
      Given database connection for pdf generator with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
      And pdf user provides the query "<query>"
      Examples: customer pdf data
        |query|
        |Select * from tp_customer|

#    Scenario: Create extent test reports
#      Then user creates test extent reports