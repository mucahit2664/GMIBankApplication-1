@US22
  Feature: read and validate states
    Background: sets api end point to response
      Given user sets end point to response "https://www.gmibank.com/api/tp-states"

    Scenario: Read and validate the states with api end point from data set
      Given user generate states
      And user save the states in correspondent file
      Then validate all states from the data set

    Scenario: Read and validate the states with api end point one by one
      Given user generate states
      And user save the states in correspondent file
      Then validate states one by one from data set

