@US003
Feature:
  Background:
    Given Goto "gmi_url"
    Then Click the login button from the login page
    And Click the register button from the popup window
    And scroll down the page
  @RedPoint
  Scenario: US003_TC001 There should be at least 1 lowercase char for stronger password and
  see the level chart change accordingly
    And Enter a password in lower case in the new password
    And see change in Password strength


  @OrangePoint
  Scenario: US003_TC002 There should be at least 1 uppercase char and see the level  chart change accordingly
    And Enter a password in upper case in the new password
    And see change in Password strength (orange)


  @GreenPoint
  Scenario: US003_TC003 There should be at least 1 uppercase char and see the level  chart change accordingly
    And Enter a password in digit in the new password
    And see change in Password strength (green)


  @DarkGreenPoint
  Scenario: US003_TC004 There should be at least 1 uppercase char and see the level  chart change accordingly
    And enter a special character as password in new password
    And see change in Password strength (darkgreen)
    And user closes the page

  @DarkGreenPoint
  Scenario: US003_TC004 There should be at least 1 uppercase char and see the level  chart change accordingly
    And enter the password in seven characters for all desired properties
    And see change in Password strength (againdarkgreen)