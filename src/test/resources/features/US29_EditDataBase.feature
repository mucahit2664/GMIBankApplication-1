@US29 @SmokeTest
Feature: US_29 user tests database validation
  Background: user connects with DataBase

  @US_29_TC001
  Scenario: All users' information must be obtained database and validated
    And users read can all users' info about from database
    Then users validate all user data

  @US_29_TC002
  Scenario:All countries' info should be retrieved by database and validated
    And users read all countries infos from database
    Then users validate all countries infos

  @US_29_TC003
  Scenario: All states should related to USA should be  retrieved by database and validated
    And users read all states of related to USA from database
    Then users validate all states of related to USA

