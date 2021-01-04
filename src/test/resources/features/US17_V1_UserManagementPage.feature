@US17
Feature: Test user management page functionality
  Background: user is on the login page
    Given user is on the login page
    And user clicks on the username textbox and text "adminTeam13"
    And user clicks on the password textbox and text "gmibankteam13"
    And user clicks on the sign in button
    And user click admin dropdown menu and click user management button

  Scenario: Activating-deactivating, viewing, editing and deleting a user role on management page
    When user click button to activate or deactivate role of "USER"
    And user click view button to see "USER" information
    And user click edit button to be able to edit one of "USER" information
    And user click delete button to be able to delete one role of "USER"

  Scenario: Activating-deactivating, viewing, editing and deleting an employee role on management page
    When user click button to activate or deactivate role of "EMPLOYEE"
    And user click view button to see "EMPLOYEE" information
    And user click edit button to be able to edit one of "EMPLOYEE" information
    And user click delete button to be able to delete one role of "EMPLOYEE"

  Scenario:  Activating-deactivating, viewing, editing and deleting a manager role on management page
    When user click button to activate or deactivate role of "MANAGER"
    And user click view button to see "MANAGER" information
    And user click edit button to be able to edit one of "MANAGER" information
    And user click delete button to be able to delete one role of "MANAGER"

  Scenario:  Activating-deactivating, viewing, editing and deleting a admin role on management page
    When user click button to activate or deactivate role of "ADMIN"
    And user click view button to see "ADMIN" information
    And user click edit button to be able to edit one of "ADMIN" information
    And user click delete button to be able to delete one role of "ADMIN"

  Scenario:  Activating-deactivating, viewing, editing and deleting a customer role on management page
    When user click button to activate or deactivate role of "CUSTOMER"
    And user click view button to see "CUSTOMER" information
    And user click edit button to be able to edit one of "CUSTOMER" information
    And user click delete button to be able to delete one role of "CUSTOMER"
