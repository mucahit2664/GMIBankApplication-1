@US11
  Feature: Operation for employee
    Background: pre conditions
      Given user login as an "employee"
      Given user clicks My Operation segment
      Given user click Manage Customer segment
      Given user clicks Create a new customer button
      Given user provide valid ssn "624-62-6314"
      Given user clicks search button
      Then user verify customer info retrieved
      Given user provide middle initials "M"
      Given user provide phone number  "123-123-1234"
      Given user provide zip code "11220 "
      Given user provide city "NewCity"

      Scenario:US11_TC01 The date cannot be typed earlier, in the past, at the time of creation a customer (positive)
        Given user select the date at the time of customer creation
        Then user validate the date is same with actual date

      Scenario: US11_TC01 The date cannot be typed earlier, in the past, at the time of creation a customer (negative)
        Given user select the date earlier then customer creation
        Then user validate error message "You can not type earlier date!"

      Scenario: US11_TC02 The date should be created as month, day, year, hour and minute
        Given user should provide data expected format "MM-dd-yyyy hh:mm"
        Then user validate date format as expected

      Scenario: US11_TC03 User can choose a user from the registration and it cannot be blank (positive)
        Given user select the date at the time of customer creation
        Given user select User from user box
        Then verify user is selected

      Scenario:  US11_TC03 User can choose a user from the registration and it cannot be blank (negative)
        Given user select the date at the time of customer creation
        Given user unselect any user from user box
        Given user clicks save button
        Then user see error message

      Scenario: US11_TC04 There user can choose an account created on manage accounts
        Given user select the date at the time of customer creation
        Given user select User from user box
        Given user select the account from Account box
        Then verify account is selected

      Scenario: US11_TC05 User can select Zelle Enrolled optionally and save it
        Given user select the date at the time of customer creation
        Given user select country from Country box
        Given user provide state to State box
        Given user select User from user box
        Given user select the account from Account box
        Given user select zelle Enrolled as an option
        Given user clicks save button
        Then validate success message "  "