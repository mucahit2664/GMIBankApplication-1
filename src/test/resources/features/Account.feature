Feature: Test Account Page Functionality
  Scenario: Go to account page
    Given Go to homepage and click user icon
    Given Click sign in selection
    Given Type username "employeeTeam13" and password "gmibankteam13"
    Given Click on sign in button
    Given Click on My Operations button
    Given Click on Manage Accounts button
    Given Click on Create New Account button

    Scenario: Check description field, editable and required
      When Edit description field and check if it is editable
      |This is a sample description|
      |123 it allows user to start typing with digits|
      Then if description field is blank get feedback message

    Scenario: Check balance field, editable only with digits and required
      When Edit balance field and check if it is editable and non char
      |10000|
      |is it acceptable with chars?|
      Then if balance field is blank get feedback message

    Scenario: Check account type drop down list selectable
      When "Account type" dropdown clicked
      |CHECKING   |
      |SAVING     |
      |CREDIT_CARD|
      |INVESTING  |
      Then Select and check "Account type"

    Scenario: Check account status type drop down list selectable
      When "Account status type" dropdown clicked
        |ACTIVE   |
        |SUESPENDED|
        |CLOSED   |
      Then Select and check "Account status type"

    @closeBrowser
    Scenario: Check employee drop down list selectable
      When "Employee" dropdown clicked
      Then Select and check "Employee"