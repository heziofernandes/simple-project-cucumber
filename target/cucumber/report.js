$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/registrationform/RegistrationForm.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language:en"
    }
  ],
  "line": 3,
  "name": "registration user",
  "description": "\tIn order to complete registration\n\tAs administrator\r\n\tI want to registering a user in the system",
  "id": "registration-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@registration"
    }
  ]
});
formatter.background({
  "line": 8,
  "name": "Access the registration form",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "the administrator is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterFieldsSteps.the_administrator_is_logged_in()"
});
formatter.result({
  "duration": 4073207946,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Performs registration form",
  "description": "",
  "id": "registration-user;performs-registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@basicRegistration"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "insert a name",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "insert a login",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "insert a password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "insert a email",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "insert a main adress",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "insert a reference address",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select an academic background",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select a course of interest",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "save the form",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the system informs the administrator of successfully register.",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_name()"
});
formatter.result({
  "duration": 371759551,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_login()"
});
formatter.result({
  "duration": 381627829,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_password()"
});
formatter.result({
  "duration": 419671313,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_email()"
});
formatter.result({
  "duration": 396742702,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_main_adress()"
});
formatter.result({
  "duration": 521602911,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_reference_address()"
});
formatter.result({
  "duration": 553903196,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.select_an_academic_background()"
});
formatter.result({
  "duration": 157699220,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.select_a_course_of_interest()"
});
formatter.result({
  "duration": 287578984,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.save_the_form()"
});
formatter.result({
  "duration": 191701722,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.the_system_informs_the_administrator_of_successfully_register()"
});
formatter.result({
  "duration": 99460697,
  "status": "passed"
});
formatter.after({
  "duration": 161154096,
  "status": "passed"
});
});