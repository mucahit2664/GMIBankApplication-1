Feature: System should allow to read all customers info using api end point


  Scenario: Read all customers you created and validate them from your data set
    Given user gets all data for customers using api end point "https://www.gmibank.com/api/tp-customers"
    And user deserializes customers data as json to java pojo
    And create dataset
    Then user validates the data for customers