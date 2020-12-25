Feature: US_27_TEST1_User can delete the states one by one

	@TEST_GMIB_184
	Scenario Outline: US_27_TEST1_User can delete the states one by one
		Given user sets the end point to response "https://www.gmibank.com/api/tp-states"
				And user deserializes all states data to Java
				Then  Delete states with "<index>"
				Then Verify the state has been deleted
				Examples:
					| index    |
					| 2        |
					| 2        |
