@US_27
Feature: US_27 create and  delete state

  Scenario Outline: User can just delete each state
    Given user should be reads all states data from "https://www.gmibank.com/api/tp-states"
    And user should be delete a state with using "<endpoint>" and its extension "<id>" and verify

    Examples: Delete state
      | endpoint| id|
      |https://www.gmibank.com/api/tp-states|/94744|