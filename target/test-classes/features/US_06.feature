@US06
  Feature: Verify User Info page fields
    Background: User logged in
      Given User is on homepage

  Scenario: Verify user info pop up page
    When User send username YeniUser
      And User send password Test101
      And User click on sign in button
      And User click on name of customer
      And User click on user info subtab
    Then user verify firstname field is visible
      And user verify lastname field is visible
      And user verify email field is visible
      And user verify language field is visible

    Scenario: Verify language dropdown values
      When User send username YeniUser
      And User send password Test101
      And User click on sign in button
      And User click on name of customer
      And User click on user info subtab
      Then user verify language dropdown menu has Turkish and English options

