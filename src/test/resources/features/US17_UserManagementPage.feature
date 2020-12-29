@US17
Feature: Test user management page functionality
  Background: user is on the login page
    Given user is on the login page
    And user clicks on the username textbox and text "adminTeam13"
    And user clicks on the password textbox and text "gmibankteam13"
    And user clicks on the sign in button
    And user click admin dropdown menu and click user management button

  Scenario: Activate-Deactivate an user on user management page
    When user click button to activate or deactivate a role as "USER"
    When user click button to activate or deactivate a role as "EMPLOYEE"
    When user click button to activate or deactivate a role as "MANAGER"
    When user click button to activate or deactivate a role as "ADMIN"

  Scenario: Viewing user information on user management page
    When user click view button to see "USER" info
     And user click view button to see "EMPLOYEE" info
     And user click view button to see "MANAGER" info
     And user click view button to see "ADMIN" info

  Scenario:  Editing user information on user management page
    When user click edit button to be able to edit one of "USER" info
     And user click edit button to be able to edit one of "EMPLOYEE" info
     And user click edit button to be able to edit one of "MANAGER" info
     And user click edit button to be able to edit one of "ADMIN" info

  Scenario:  Deleting user information on user management page
    When user click delete button to be able to delete one of "USER"
     And user click delete button to be able to delete one of "EMPLOYEE"
     And user click delete button to be able to delete one of "MANAGER"
     And user click delete button to be able to delete one of "ADMIN"

