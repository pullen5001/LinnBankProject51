@US_04
Feature: Success login with valid credentials
Background: User logged in
  Given User is on homepage

  @TC001
  Scenario: US_04 TC001 Login page should accessible with valid credentials
#   When user click on login icon
#    And User click on sign in
    When User send username YeniUser
    And User send password Test101
    And User click on sign in button
   Then User verify that logged in successfully to the application

@TC002
 Scenario: User Should be able to click cancel button before login
   When User click cancel button on Sign in pop-up window
   Then User should navigate to Home Page