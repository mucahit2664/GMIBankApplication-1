Feature: US_27_TEST1_User can delete the states one by one

	@TEST_GMIB_184
	Scenario: US_27_TEST1_User can delete the states one by one
		Given Send a GET request to REST API endpoint
		And Verify the HTTP Status code
		And Send a DELETE request to REST API endpoint and delete the selected states
		Then Verify the state has been deleted
