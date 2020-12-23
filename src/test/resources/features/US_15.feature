@logincustomerAndus15

Feature: Customer login and see all account types, balances and transactions

  Background: User enter system
    Given customer goes to website
    And customer goes to signin page
    And customer enter username and password
    Then customer performs login


  @tc06
  Scenario: TC_06_users see their account type
    Given customer goes to My Accounts page
    Then customer asserts the account type
    Then customer clicks signout

  @tc07
  Scenario: TC_06_users see their balances
    Given customer goes to My Accounts page
    Then customer asserts the balances
    Then customer clicks signout

  @tc08
  Scenario: TC_08_users see their transaction
    Given customer goes to My Accounts page
    And customer clicks view transaction button
    Then customer asserts the view transaction
    Then customer clicks signout

  @tc09
  Scenario: TC_09_users see their transaction
    Given customer goes to My Accounts page
    And customer clicks view transaction button
    Then customer asserts the id of account
    Then customer clicks signout
