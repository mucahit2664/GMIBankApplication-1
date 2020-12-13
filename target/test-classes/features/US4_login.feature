@login
Feature: login page feature
  Background: user is on the login page
    Given user is on the login page
  @loginPositive
  Scenario Outline: log in to page
    And user clicks on the username textbox and text "<username>"
    And user clicks on the password textbox and text "<password>"
    And user clicks on the sign in button
    Then user verify to login
    And user clicks on userIcon
    And user clicks on sign out button

    Examples:
      | username       | password       |
      | TugbaValid     | TugbaValid123. |
      | CustomerTeam13 | gmibankteam13  |
      | employeeTeam13 | gmibankteam13  |
      | managerTeam13  | gmibankteam13  |
      | adminTeam13    | gmibankteam13  |




  Scenario Outline: log in to page with cancel button
    And user clicks on the username textbox and text "<valid username>"
    And user clicks on the password textbox and text "<valid password>"
    And user clicks on the cancel button
    Then user verify to homepage
    Examples:
      | username       | password       |
      | TugbaValid     | TugbaValid123. |
      | CustomerTeam13 | gmibankteam13  |
      | employeeTeam13 | gmibankteam13  |
      | managerTeam13  | gmibankteam13  |
      | adminTeam13    | gmibankteam13  |
