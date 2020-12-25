@US22
  Feature: read and validate states
    Background: sets api end point to response
      Given user sets end point to response "https://www.gmibank.com/api/tp-states"

    Scenario:US22_TC01 Read and validate the states with api end point from data set
      And user de-serialize the data
      Then validate states from the data set

    Scenario:US22_TC02 Read and validate the states with api end point one by one
      And user de-serialize the data
      Then validate states one by one



