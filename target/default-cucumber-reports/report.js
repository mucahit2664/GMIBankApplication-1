$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US22_read_and_validate_countries.feature");
formatter.feature({
  "name": "read and validate states",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US22"
    }
  ]
});
formatter.background({
  "name": "sets api end point to response",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets end point to response \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_sets_end_point_to_response(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Read and validate the states with api end point from data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US22"
    }
  ]
});
formatter.step({
  "name": "user generate states",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_generate_states()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user save the states in correspondent file",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_save_the_states_in_correspondent_file()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat stepdefinitions.US22_StepDefinitions.user_save_the_states_in_correspondent_file(US22_StepDefinitions.java:42)\r\n\tat ✽.user save the states in correspondent file(file:///C:/Users/Pc/IdeaProjects/GMIBankApplication/src/test/resources/features/US22_read_and_validate_countries.feature:8)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "validate all states from the data set",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.validate_all_states_from_the_data_set()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "sets api end point to response",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user sets end point to response \"https://www.gmibank.com/api/tp-states\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_sets_end_point_to_response(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Read and validate the states with api end point one by one",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US22"
    }
  ]
});
formatter.step({
  "name": "user generate states",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_generate_states()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user save the states in correspondent file",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.user_save_the_states_in_correspondent_file()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat stepdefinitions.US22_StepDefinitions.user_save_the_states_in_correspondent_file(US22_StepDefinitions.java:42)\r\n\tat ✽.user save the states in correspondent file(file:///C:/Users/Pc/IdeaProjects/GMIBankApplication/src/test/resources/features/US22_read_and_validate_countries.feature:13)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "validate states one by one from data set",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US22_StepDefinitions.validate_states_one_by_one_from_data_set()"
});
formatter.result({
  "status": "skipped"
});
});