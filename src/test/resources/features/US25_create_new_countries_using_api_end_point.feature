@US25
Feature: System should allow to create new countries using api end point

  Scenario Outline: Create the countries with api end point
    Given create country using "<name>" and "<states>"
    When verify status code 201

    Examples:
      | name        | states  |
      | Mozambique  | null    |
      | Germany     | null    |
      | Cyprus      | null    |

  Scenario: Validation
    Given get all countries
    Then validate all created countries
