Feature: Read all applicant data
  Background: Api endpoint is being set
    Given user provides api endpoint to set response using "https://www.gmibank.com/api/tp-account-registrations"

  Scenario: Read all applicant data which come as JSON from response
    Given user deserializes all applicant data to Java