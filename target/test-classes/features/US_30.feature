@US_30
Feature: user story 30
  Background: create connection gmibank
  Scenario Outline: create customer pdf file by using DataBase
    Given database connection for pdf generator with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126"
    And pdf user provides the query "<query>"

    Examples: customer pdf data
      |query|
      |Select * from tp_customer|
