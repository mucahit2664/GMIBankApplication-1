@deniz
Feature: An Employee can manage Customer

  Background:
    Given user login as an "employee"
    Given user clicks My Operation segment
    Given user click Manage Customer segment

  @US12_TC01
  Scenario: Employees should be able to see "First Name, Last Name, Middle Letter, E-mail, Mobile Number, Phone Number, Address, Create Date"
    Given Verify if the first name is showing "uigbn"
    And Verify if the last name is showing "Father"
    And Verify if the middle initial is showing "."
    And Verify if the email is showing "money@moneymail.com"
    And Verify if the mobile phone number is showing "951-753-1654"
    And Verify if the phone number is showing "951-753-1654"
    And Verify if the address is showing "Test Mahallesi Test Sokak Test Apartman 06100 Alaska"
    Then Verify if the create date is showing "23/11/20 22:00"

  @US12_TC02
  Scenario: There should be a View option where customer can be navigated to all customer info and see edit button there
    Given Verify an View button
    And Click on the View button
    Then Verify an Edit button

  @US12_TC03
  Scenario: There should be an Edit button where all customer information can be populated
    Given Verify an Edit button from main page
    And Click on the Edit button from main page

  @US12_TC04
  Scenario: The Edit portal can allow user to create or update the user info
    Given Click on the Edit button
    And Change first name "Team13"
    And Change last name "France"
    And Change middle initial "Meinau"
    And Change email "example@gmail.com"
    And Change mobile phone number "123-456-7889"
    And Change phone number "123-321-0011"
    And Change zip code "67000"
    And Change address "Test Street"
    And Change city "Maiven"
    And Change SSN "580-42-0606"
    And Change create date "22/11/2020 23:18"
    And Change country "UNITED KINGDOM"
    And Change state "IntelliJ"
    And Change user "john John Doe"
    And Change account "aaa"
    And Click to checkbox
    Then Click on the "Save" button
    Then user sees green success message on the screen

  @US12_TC05
  Scenario: User can delete a customer, but seeing a message if the user is sure about deletion
    Given Click on the Delete button
    And Verify the alert message "Are you sure you want to delete Customer"
    Then Click on the Delete button from alert page