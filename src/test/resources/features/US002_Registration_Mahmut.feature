@mahmut
Feature: US002_user_wants_to_register_scenario_outline

  Background: user is on the website
    Given user is on the website
    When user clicks on user icon
    And user clicks on register button

  Scenario Outline: Required_information_was_given_by_user

    Then user enters the SSN "<ssn>"
    And user enters the first name "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the address "<address>"
    And user enters the mobile phone number "<mobile_number>"
    And user enters the username "<username>"
    And user enters the email address "<email>"
    And user enters the new password "<password>"
    And user enters the new password confirmation "<confirmation>"
    And user clicks on the Register button
    Then verify the text message

    Examples:
      | ssn         | firstname | lastname  | address            | mobile_number | username | email         | password | confirmation |
      | 00000000    | Johannes  | Salvador  | JFK Str. 19, 07558 | 000-000-0000  | JohnS    | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 |           | Salvador  | JFK Str. 19, 07558 | 000-000-0000  | JohnS    | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 | Johannes  |           | JFK Str. 19, 07558 | 000-000-0000  | JohnS    | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 | Johannes  | Salvador  |                    | 000-000-0000  | JohnS    | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 | Johannes  | Salvador  | JFK Str. 19, 07558 |               | JohnS    | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 | Johannes  | Salvador  | JFK Str. 19, 07558 | 000-000-0000  |          | johns@xyz.com | johns123 | johns123     |
      | 258-10-1905 | Johannes  | Salvador  | JFK Str. 19, 07558 | 000-000-0000  | JohnS    |               | johns123 | johns123     |
      | 258-10-1905 | Johannes  | Salvador  | JFK Str. 19, 07558 | 000-000-0000  | JohnS    | johns@xyz.com |          | johns123     |
      | 258-10-1905 | Johannes  | Salvador  | JFK Str. 19, 07558 | 000-000-0000  | JohnS    | johns@xyz.com | johns123 |              |

