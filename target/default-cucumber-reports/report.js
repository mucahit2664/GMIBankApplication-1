$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US002_Registration_Mahmut.feature");
formatter.feature({
  "name": "US002_user_wants_to_register_scenario_outline",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters the SSN \"\u003cssn\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters the first name \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the address \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the mobile phone number \"\u003cmobile_number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the email address \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the new password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user enters the new password confirmation \"\u003cconfirmation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ssn",
        "firstname",
        "lastname",
        "address",
        "mobile_number",
        "username",
        "email",
        "password",
        "confirmation"
      ]
    },
    {
      "cells": [
        "00000000",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "",
        "johns@xyz.com",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "",
        "johns123",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "",
        "johns123"
      ]
    },
    {
      "cells": [
        "258-10-1905",
        "Johannes",
        "Salvador",
        "JFK Str. 19, 07558",
        "000-000-0000",
        "JohnS",
        "johns@xyz.com",
        "johns123",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"00000000\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "user is on the website",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_is_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on user icon",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_user_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Required_information_was_given_by_user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@mahmut"
    }
  ]
});
formatter.step({
  "name": "user enters the SSN \"258-10-1905\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_SSN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the first name \"Johannes\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_first_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the last name \"Salvador\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_last_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the address \"JFK Str. 19, 07558\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the mobile phone number \"000-000-0000\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_mobile_phone_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username \"JohnS\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the email address \"johns@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_email_address(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password \"johns123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the new password confirmation \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_enters_the_new_password_confirmation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Register button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.user_clicks_on_the_Register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the text message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.US02_StepDefinitions.verify_the_text_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});