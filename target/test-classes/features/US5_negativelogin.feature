@loginNegative
Feature:Login negative
  Background: user is on the login page
    Given user is on the login page
  @Negative1
  Scenario:Login page should not be accessible with invalid username
    And user clicks on the username textbox and text invalid username
    And user clicks on the password textbox and text valid password
    And user click on the signin button
    Then user verify the error message
  @Negative2
  Scenario:Login page should not be accessible with invalid password
    And user clicks on the username textbox and text valid username
    And user clicks on the password textbox and text invalid password
    And user clicks on sign in button
    Then user verify the error message
  @Negative3
  Scenario:Login page should not be accessible with invalid password and username
    And user click on the username textbox and text invalid username
    And user click on the password textbox and text invalid password
    And user clicks the sign in button
    Then user verify the error message
  @Negative4
  Scenario:Reset password option
    And user clicks on username textbox and text valid username
    And user clicks on password textbox and text invalid password
    And user clicks on the signin button
    Then user verify the error message
    And user clicks on this text "Did you forget your password?
    Then user verify the new page
    And user enter the email address you used to register in the email text box
    And user clicks the Reset password button
    Then user verify the success message
  @Negative5
  Scenario: User navigate to registration page if they did not register yet
    And user should click on username textbox and text invalid username
    And user click password textbox and text invalid password
    And user clicks on the Sign in button
    Then user verify Error message
    And user clicks on this text "You don't have an account yet? Register a new account"
    Then user verify the Registration page
