
@US23
Feature: Read all applicant data
  Background: Api endpoint is being set
    Given user provides api endpoint to set response using "https://www.gmibank.com/api/tp-account-registrations"

  Scenario: Read all applicant data which come as JSON from response
    Given user deserializes all applicant data to Java
    And user write all applicant to the "applicants.txt" file
    And user validate all applicant via "applicants.txt" file
    Then user validate applicant one by one which is selected randomly in "applicants.txt" file