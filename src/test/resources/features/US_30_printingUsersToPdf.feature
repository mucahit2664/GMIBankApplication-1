@berati
Feature: All users (user, employee, manager or admin) should be printed as a pdf file

  Scenario: You should have all users info as Name last name and role on a pdf document
    Given user sets database connection
    And user reads first name last name and role from database
    And user writes the read data to pdf file