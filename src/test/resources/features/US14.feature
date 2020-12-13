@us16tc01
Feature: US16


  Scenario Outline: Test Case 01
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to my accounts
    And Assert if there is second View Transaction
    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |


  @us16tc02
  Scenario Outline: Test Case 02
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to transfer money
    And choose first account

    And close browser


    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |

  @us16tc03
  Scenario Outline: Test Case 03
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to transfer money
    And choose first account
    Then choose remain one
    And close browser


    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |

  @us16tc04
  Scenario Outline: Test Case 04
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to transfer money
    And choose first account
    And enter description
    And close browser


    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |

  @us16tc05
  Scenario Outline: Test Case 05
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to transfer money
    And choose first account
    Then choose remain one
    And enter balance
    And enter description
    And click on transfer money
    And receive alert description
    And close browser


    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |

  @smoke
  Scenario Outline: userStory16 smoke
    Given Login in customer account user name "<username>" and password "<password>"
    Then Go to my operations
    Then Go to transfer money
    And choose first account
    Then choose remain one
    And enter balance
    And enter description
    And click on transfer money
    And receive alert description
    And close browser


    Examples:
      | username | password |
      | omer__4  | omer__4  |
      | omer__5  | omer__5  |
      | omer__6  | omer__6  |
      | omer__7  | omer__7  |
      | omer__8  | omer__8  |
      | omer__10 | omer__10 |
