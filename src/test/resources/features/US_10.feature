@loginemployeeAndus10

  Feature: Employer login and change his/her address

    Background: User enter system
      Given user goes to website
      And user goes to signin page
      And user enter username and password
      Then user performs login


    @tc01
    Scenario: TC_01_users edit their address
      Given user goes to manageCustomers page
      And user clicks edit button
      And user clicks address textbox
      And user writes "Walferdange" as an address
      And user click save button
      Then user asserts the registration
      Then user clicks signout




    @tc02
    Scenario: TC_02_users edit their city
      Given user goes to manageCustomers page
      And user clicks edit button
      And user clicks city textbox
      And user writes "" as an city
      And user clicks save button
      Then user asserts the registration city
      Then user clicks signout



    @tc03
    Scenario: TC_03_users edit their country
      Given user goes to manageCustomers page
      And user clicks edit button
      And user selects "Germany" as an country from dropdown
      And user clicks save button
      Then user asserts the registration country
      Then user clicks signout

    @tc04
    Scenario: TC_04_users edit their country
      Given user goes to manageCustomers page
      And user clicks edit button
      And user selects "" as an country from dropdown
      And user clicks save button
      Then user asserts the registration empty country
      Then user clicks signout

    @tc05
    Scenario: TC_05_users edit their country
      Given user goes to manageCustomers page
      And user clicks edit button
      And user writes "" as a state
      And user clicks save button
      Then user asserts the registration empty state
      Then user clicks signout
