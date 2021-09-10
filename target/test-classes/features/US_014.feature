@US014
  Feature:US014_Date should be created on the time of account
    Background: US014_Tests
      Given user enters linnbank home page
      Then user clicks on human icon
      And user enters sign in button
      And user enters a valid employee username "bankprojectemployee51"
      And user enters a valid employee password "Bankprojectemployee51."
      Then user clicks on sign in button

    Scenario: Send current date and time
      Given user clicks on my operations
      Then user clicks on manage accounts
      And user clicks on create a new account
      And user send a date and time
      Then close the application


  Scenario: Verifies the date and time
      Given user clicks on my operations
      Then user clicks on manage accounts
      And user clicks on create a new account
      And user verifies that create created date successfully
      Then close the application


  Scenario: User select a user
      Given user clicks on my operations
      Then user clicks on manage customer
      And user clicks on create a new customer
      And user selects a user
      Then close the application


  Scenario: User choose created account
      Given user clicks on my operations
      Then user clicks on manage customer
      And user clicks on create a new customer
      And user selects a created account from account box
      Then close the application


  Scenario: User select Zelle Enrolled box
      Given user clicks on my operations
      Then user clicks on manage customer
      And user clicks on create a new customer
      And user clicks Zelle Enrolled
      Then close the application




