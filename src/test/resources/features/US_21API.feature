@ReaderOfCountries
Feature: Test all countries
  Background: api end point is being set in response
    Given user provides the api end point to set the response using "https://www.gmibank.com/api/tp-countries"

@tc01api
  Scenario: read all countries
    Given user is desirializing all data json to Java
    And user validates all data
 @tc02api
   Scenario: read all countries number
     Given user is desirializing all data json to Java
     And user validates countries number
 @tc03api
  Scenario Outline: read all countries 1 by 1
    Given user is desirializing all data json to Java
    And user validates "<country>"
    Examples:
    |country|
    |Alamanya|
    |Sudan  |
    |DOMINIC|
    |Poland |
    |MOZAMBIK|
    |Norwegan|

