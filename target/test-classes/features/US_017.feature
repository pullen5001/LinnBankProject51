@US_017
  Feature: System should allow the Admin to manage users
    Background: Admin is on linnbank home page
      Given Admin clicks on human icon
      Then Admin clicks sign in button
      Then Admin enters valid admin username
      Then Admin enters valid admin password
      Then Admin clicks on sign in button
      Then Admin clicks on Administration Dropdown
      Then Admin clicks on User management from dropdown

      Scenario: TC_01 Admin can activate a role as user
        Given finds user by using ID
        Then Admin clicks on Activated button

      Scenario: TC_02 Admin can activate a role as employee
        Given finds userID
        Then Clicks on employees Edit button
        Then Admin Selects Role_Employee
        Then Admin clicks save

      Scenario:TC_03 Admin can activate a role as manager
        Given finds userID
        Then Admin Clicks on edit button
        Then Admin selects Role_Manager
        Then Admin clicks save

      Scenario: TC_04 Admin can activate a role as admin
          Given finds userID
          Then Admin Clicks on employees Edit button
          Then Admin Selects Role_Admin
          Then Admin clicks save

      Scenario: TC_05 Admin can view all user info (admin, manager, employee and user)
        Given clicks userID
        Then verify admin can view all info

      Scenario: TC_06 Admin can edit all user info  (admin, manager, employee and user)
        Given clicks edit button on user
        Then verify Create or edit a user is displayed for user

      Scenario: TC_07 Admin can delete all user info  (admin, manager, employee and user)
        Given clicks delete button on user
        Then Admin clicks delete from alert
        Then verify user is deleted alert